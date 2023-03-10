package com.web_demo.entity;

/**
 * 用户实体类
 */
public class User {
    private Integer userId;// 用户ID
    private String userName;// 用户名
    private String userPwd;// 用户密码
    private Integer userAge = 18;// 用户年龄

    private String userSpwd;// 用户确认密码（注册时使用）

    public String getUserSpwd() {
        return userSpwd;
    }

    public void setUserSpwd(String userSpwd) {
        this.userSpwd = userSpwd;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
