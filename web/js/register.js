$("#regBtn").click(() => {
    let rname = $("#rname").val();
    let rpwd = $("#rpwd").val();
    let rspwd = $("#rspwd").val();

    if(isEmpty(rname)){
        $("#rnameSpan").html("用户名不能为空!");
        return;
    }else{
        $("#rnameSpan").html("");
    }

    if(isEmpty(rpwd)){
        $("#rpwdSpan").html("密码不能为空!");
        return;
    }else{
        $("#rpwdSpan").html("");
    }

    if(isEmpty(rspwd) || rspwd !== rpwd){
        $("#rspwdSpan").html("两次输入密码不一致!");
        return;
    }else{
        $("#rspwdSpan").html("");
    }

    $("#registerForm").submit();
})

