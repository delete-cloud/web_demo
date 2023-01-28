package com.web_demo.service;

import com.web_demo.entity.User;
import com.web_demo.entity.vo.LoginMessageModel;
import com.web_demo.entity.vo.RegisterMessageModel;
import com.web_demo.mapper.UserMapper;
import com.web_demo.util.GetSqlSession;
import com.web_demo.util.StringUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * 业务逻辑类
 *      用户登录
 *          1. 参数的非空问题
 *              如果参数为空
 *                  将状态码，提示信息，回显数据设置到消息模型对象中，返回登录消息模型对象
 *          2. 调用dao层的查询方法，通过用户名查询用户对象
 *          3. 判断用户对象是否为空
 *              如果为空，将状态码，提示信息，回显数据设置到消息模型对象中，返回登录消息模型对象
 *          4. 将数据库中查询到的用户密码与前台传递的密码作比较
 *              如果不相等，将状态码，提示信息，回显数据设置到消息模型对象中，返回登录消息模型对象
 *          5. 登录成功，成功状态，提示信息，用户对象设置登录消息模型对象，并return
 *
 *      用户注册
 *          1. 参数的非空问题
 *              如果参数为空
 *                  将状态码，提示信息，回显账号数据设置到消息模型对象中，返回注册消息模型对象
 */
public class UserService {
    public LoginMessageModel userLogin(String uname, String upwd) {
        LoginMessageModel messageModel = new LoginMessageModel();

        // 回显数据
        User u = new User();
        u.setUserName(uname);
        u.setUserPwd(upwd);
        messageModel.setObject(u);

        // 1. 参数的非空判断
        if(StringUtil.isEmpty(uname) || StringUtil.isEmpty(upwd)){
            // 将状态码，提示信息，回显数据设置到消息模型对象中，返回消息模型对象
            messageModel.setCode(0);
            messageModel.setMsg("用户名或密码不能为空!");
            return messageModel;
        }

        // 2. 调用dao层的查询方法，通过用户名查询用户对象
        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName(uname);

        // 3. 判断用户对象是否为空
        if(user == null){
            // 如果为空，将状态码，提示信息，回显数据设置到消息模型对象中，返回消息模型对象
            messageModel.setCode(0);
            messageModel.setMsg("用户不存在!");
            return messageModel;
        }

        // 4. 将数据库中查询到的用户密码与前台传递的密码作比较
        if(!upwd.equals(user.getUserPwd())){
            // 如果不相等，将状态码，提示信息，回显数据设置到消息模型对象中，返回消息模型对象
            messageModel.setCode(0);
            messageModel.setMsg("用户密码不正确!");
            return messageModel;
        }
        // 登录成功，将用户信息设置到消息模型中
        messageModel.setObject(user);
        return messageModel;
    }

    public RegisterMessageModel userRegister(String rname, String rpwd, String rspwd){
        RegisterMessageModel messageModel = new RegisterMessageModel();

        // 回显数据
        User u = new User();
        u.setUserName(rname);
        u.setUserPwd(rpwd);
        u.setUserSpwd(rspwd);
        messageModel.setObject(u);

        System.out.println(u.getUserId());

        // 参数的一些合法性判断
        // 用户名为空
        if(StringUtil.isEmpty(rname)){
            messageModel.setCode(0);
            messageModel.setRnameMsg("用户名不能为空!");
            return messageModel;
        }


        // 调用dao层的查询方法，通过用户名查询用户对象
        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName(rname);
        // 用户名已存在
        if(user != null){
            messageModel.setCode(0);
            messageModel.setRnameMsg("该用户名已被注册!");
            return messageModel;
        }

        // 密码为空
        if(StringUtil.isEmpty(rpwd)){
            messageModel.setCode(0);
            messageModel.setRpwdMsg("密码不能为空!");
            return messageModel;
        }

        // 确认密码为空或两次输入密码不一致
        if(StringUtil.isEmpty(rspwd) || !rspwd.equals(rpwd)){
            messageModel.setCode(0);
            messageModel.setRspwdMsg("两次输入密码不一致!");
            return messageModel;
        }

        // 注册成功
        userMapper.insertUser(u);
        session.commit();
        System.out.println(u.getUserId());
        return messageModel;
    }
}
