$("#regBtn").click(function (){
    let rname = $("#rname").val();
    let rpwd = $("#rpwd").val();
    let rspwd = $("#rspwd").val();

    if(isEmpty(rname)){
        $("#rnameSpan").html("账号不能为空!");
    }else{
        $("#rnameSpan").html("");
    }

    if(isEmpty(rpwd)){
        $("#rpwdSpan").html("密码不能为空!");
    }else{
        $("#rpwdSpan").html("");
    }

    if(isEmpty(rspwd) || rspwd !== rpwd){
        $("#rspwdSpan").html("两次输入密码不一致!");
    }else{
        $("#rspwdSpan").html("");
    }
})