<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/1/7
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="./css/login.css">
</head>

<body>
<div class="box">
    <h2>Login</h2>
    <form action="login" method="post" id="loginForm">
        <div class="input-box">
            <label>账号</label>
            <input type="text" name="uname" id="uname" value="${messageModel.object.userName}">
        </div>
        <div class="input-box">
            <label>密码</label>
            <input type="password" name="upwd" id="upwd" value="${messageModel.object.userPwd}">
            <span id="msg" style="margin-top: 5px; padding: 5px; color: rgba(225, 50, 58, 1.0); font-size: 13px">
                ${messageModel.msg}
            </span>
        </div>
    </form>
    <div class="btn-box">
        <a href="#">忘记密码?</a>
        <div>
            <button type="button" id="loginBtn">登录</button>
            <button type="button" id="regBtn">注册</button>
        </div>
    </div>
</div>
</body>

<script type="text/javascript" src="./js/jquery-3.6.3.js"></script>
<script type="text/javascript" src="./js/login_demo.js"></script>

</html>