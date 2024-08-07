<%@page import="xyz.itwill.dto.UserinfoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>         
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MVC</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value='/model_two/css/user.css'/>" type="text/css">
<script language="JavaScript">
function userCreate() {
    var f = document.forms["f"];
    if (f.userid.value.trim() == "") {
        alert("아이디를 입력하십시요.");
        f.userid.focus();
        return;
    } 
    if (f.password.value.trim() == "") {
        alert("비밀번호를 입력하십시요.");
        f.password.focus();
        return;
    }
    if (f.name.value.trim() == "") {
        alert("이름을 입력하십시요.");
        f.name.focus();
        return;
    }
    
    f.action = "<c:url value='/write.do'/>";
    f.submit();
}
</script>
</head>
<body bgcolor="#FFFFFF" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<br>
<table width="780" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td width="20"></td>
        <td style="color: red;">${message}</td>            
    </tr>

    <tr>
        <td width="20"></td>
        <td>
            <table width="590" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>회원관리 - 회원등록</b></td>
                </tr>
            </table>  
            <br>
            
            <form name="f" method="post">
                <table border="0" cellpadding="0" cellspacing="1" width="590" bgcolor="BBBBBB">
                    <tr>
                        <td width="100" align="center" bgcolor="E6ECDE" height="22">아이디</td>
                        <td width="490" bgcolor="ffffff" style="padding-left:10px;">
                            <input type="text" style="width:150px" name="userid" value="${userinfo.userid}">
                        </td>
                    </tr>
                    <tr>
                        <td width="100" align="center" bgcolor="E6ECDE" height="22">비밀번호</td>
                        <td width="490" bgcolor="ffffff" style="padding-left:10px;">
                            <input type="password" style="width:150px" name="password" value="${userinfo.password}">
                        </td>
                    </tr>
                    <tr>
                        <td width="100" align="center" bgcolor="E6ECDE" height="22">이름</td>
                        <td width="490" bgcolor="ffffff" style="padding-left:10px;">
                            <input type="text" style="width:240px" name="name" value="${userinfo.name}">
                        </td>
                    </tr>
                    <tr>
                        <td width="100" align="center" bgcolor="E6ECDE" height="22">이메일</td>
                        <td width="490" bgcolor="ffffff" style="padding-left:10px;">
                            <input type="text" style="width:240px" name="email" value="${userinfo.email}">
                        </td>
                    </tr>
                    <tr>
                        <td width="100" align="center" bgcolor="E6ECDE" height="22">회원등급</td>
                        <td width="490" bgcolor="ffffff" style="padding-left:10px;">
                            <select name="auth">
                                <option value="1" ${userinfo.auth == 1 ? 'selected' : ''}>일반회원</option>
                                <option value="9" ${userinfo.auth == 9 ? 'selected' : ''}>관리자</option>
                            </select>
                        </td>
                    </tr>          
                </table>
            </form>
            <br>
            <table width="590" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td align="center">
                        <input type="button" value="회원등록" onClick="userCreate();">
                        <input type="button" value="로그인" onClick="location.href='<c:url value="/loginform.do"/>';">
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>  
</body>
</html>
