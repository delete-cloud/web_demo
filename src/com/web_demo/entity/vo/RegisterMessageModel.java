package com.web_demo.entity.vo;

/**
 * 注册消息模型对象（数据响应）
 *      状态码
 *          1代表成功，0代表失败
 *      提示信息
 *          分为用户名，密码，确认密码三部分
 *      回显数据
 *          object对象
 */
public class RegisterMessageModel {
    private Integer code = 1;// 状态码
    private String rnameMsg;// 用户名提示信息
    private String rpwdMsg;// 密码提示信息
    private String rspwdMsg;// 确认密码提示信息
    private Object object;// 回显数据对象

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getRnameMsg() {
        return rnameMsg;
    }

    public void setRnameMsg(String rnameMsg) {
        this.rnameMsg = rnameMsg;
    }

    public String getRpwdMsg() {
        return rpwdMsg;
    }

    public void setRpwdMsg(String rpwdMsg) {
        this.rpwdMsg = rpwdMsg;
    }

    public String getRspwdMsg() {
        return rspwdMsg;
    }

    public void setRspwdMsg(String rspwdMsg) {
        this.rspwdMsg = rspwdMsg;
    }
}
