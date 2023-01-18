<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/1/17
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="./css/login.css">
</head>
<body>
<div class="box">
  <h2>Login</h2>
  <form action="login" method="post" id="loginForm">
    <div class="input-box">
      <label>账号</label>
      <input type="text" name="rname" id="rname" value="">
      <span id="rnameSpan" style="margin-top: 5px; padding: 5px; color: rgba(225, 50, 58, 1.0); font-size: 13px">

      </span>
    </div>
    <div class="input-box">
      <label>密码</label>
      <input type="password" name="rpwd" id="rpwd" value="">
      <span id="rpwdSpan" style="margin-top: 5px; padding: 5px; color: rgba(225, 50, 58, 1.0); font-size: 13px">

      </span>
    </div>
    <div class="input-box">
      <label>确认密码</label>
      <input type="password" name="rspwd" id="rspwd" value="">
      <span id="rspwdSpan" style="margin-top: 5px; padding: 5px; color: rgba(225, 50, 58, 1.0); font-size: 13px">

      </span>
    </div>
  </form>
  <div class="btn-box">
<%--    <a href="#">忘记密码?</a>--%>
    <div>
<%--      <button type="button" id="loginBtn">登录</button>--%>
      <button type="button" id="regBtn">注册</button>
    </div>
  </div>
</div>
</body>

<script type="text/javascript" src="./js/jquery-3.6.3.js"></script>
<script type="text/javascript" src="./js/login_demo.js"></script>

</html>
