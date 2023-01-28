$("#loginBtn").click(() => {
    //获取用户名和密码
    let uname = $("#uname").val();
    let upwd = $("#upwd").val();

    // console.log(uname + " "+ upwd);

    if (isEmpty(uname) || isEmpty(upwd)) {
        $("#msg").html("用户名或密码不能为空!");
        return;
    }
    $("#loginForm").submit();
})

$("#regBtn").click(function (){
    window.location.replace("register.jsp");
})