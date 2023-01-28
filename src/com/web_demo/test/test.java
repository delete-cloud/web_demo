package com.web_demo.test;

import com.web_demo.entity.User;
import com.web_demo.mapper.UserMapper;
import com.web_demo.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;

public class test {
//    public static void main(String[] args) {
//        // 获取SqlSession对象
//        SqlSession session = GetSqlSession.createSqlSession();
//        // 得到对应的mapper
//        UserMapper userMapper = session.getMapper(UserMapper.class);
//        // 调用方法，返回用户对象
//        User user = userMapper.queryUserByName("admin");
//        System.out.println(user.getUserId());
//    }

    public static void main(String[] args) {
        SqlSession session = GetSqlSession.createSqlSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = new User();
            user.setUserName("test");
            user.setUserPwd("123456");

            int count = userMapper.insertUser(user);

            System.out.println(user.getUserId());

            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
