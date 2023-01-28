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
    <link rel="stylesheet" href="./css/register.css">
</head>
<body>
<div class="box">
  <h2>Register</h2>
  <form action="register" method="post" id="registerForm">
    <div class="input-box">
      <label>账号</label>
      <input type="text" name="rname" id="rname" value="${messageModel.object.userName}">
      <span id="rnameSpan">
        ${messageModel.rnameMsg}
      </span>
    </div>
    <div class="input-box">
      <label>密码</label>
      <input type="password" name="rpwd" id="rpwd" value="${messageModel.object.userPwd}">
      <span id="rpwdSpan">
        ${messageModel.rpwdMsg}
      </span>
    </div>
    <div class="input-box">
      <label>确认密码</label>
      <input type="password" name="rspwd" id="rspwd" value="${messageModel.object.userSpwd}">
      <span id="rspwdSpan">
        ${messageModel.rspwdMsg}
      </span>
    </div>
  </form>
  <div class="btn-box">
    <a href="login.jsp">返回登录</a>
    <div style="margin:20px auto">
<%--      <button type="button" id="loginBtn">登录</button>--%>
      <button type="button" id="regBtn">注册</button>
    </div>
  </div>
</div>
</body>

<script type="text/javascript" src="js/jquery-3.6.3.js"></script>
<script type="text/javascript" src="js/register.js"></script>
<script type="text/javascript" src="js/util.js"></script>

</html>
