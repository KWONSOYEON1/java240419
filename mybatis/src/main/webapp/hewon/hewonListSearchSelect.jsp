<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="xyz.itwill.dao.MyHewonDAO"%>
<%@page import="xyz.itwill.dto.MyHewon"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String searchColumn=request.getParameter("searchColumn");
	String searchKeyword=request.getParameter("searchKeyword");
	
	List<MyHewon> hewonList=null;
	if(searchKeyword == null || searchKeyword.equals("")) {//조회기능을 사용하지 않은 경우
		hewonList=MyHewonDAO.getDAO().selectHewonList();//전체 검색
	} else {//조회기능을 사용한 경우
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("searchColumn", searchColumn);
		map.put("searchKeyword", searchKeyword);

		hewonList=MyHewonDAO.getDAO().selectSearchHewonList(map);//조건 검색
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYBATIS</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	border: 1px solid black;
	text-align: center;
	padding: 3px;	
}

.id { width: 150px; }
.name { width: 150px; }
.phone { width: 200px; }
.email { width: 200px; }
.scope { width: 100px; }
</style>
</head>
<body>
	<h1>회원목록</h1>
	<hr>
	<table>
		<tr>
			<td class="id">아이디</td>
			<td class="name">이름</td>
			<td class="phone">전화번호</td>
			<td class="email">이메일</td>
			<td class="scope">공개범위</td>
		</tr>
		<% if(hewonList.isEmpty()) { %>
		<tr>
			<td colspan="5">검색된 회원정보가 없습니다.</td>
		</tr>
		<% } else { %>
			<% for(MyHewon hewon : hewonList) { %>
			<tr>
				<td class="id"><%=hewon.getId() %></td>
				<td class="name"><%=hewon.getName() %></td>
				<td class="phone"><%=hewon.getPhone() %></td>
				<td class="email"><%=hewon.getEmail() %></td>
				<td class="scope"><%=hewon.getScope() %></td>
			</tr>	
			<% } %>
		<% } %>
	</table>
	<br>
	
	<form method="post">
		<%-- 조회대상을 입력받아 요청 웹프로그램에게 전달 --%>
		<%-- => 전달값은 반드시 테이블의 컬럼명과 같도록 작성 --%>
		<select name="searchColumn">
			<option value="hewon_id" selected="selected">아이디</option>
			<option value="hewon_name">이름</option>
			<option value="hewon_phone">전화번호</option>
			<option value="hewon_email">이메일</option>
		</select>
		<%-- 조회단어를 입력받아 요청 웹프로그램에게 전달 --%>
		<input type="text" name="searchKeyword">
		<button type="submit">검색</button>
	</form>
</body>
</html>






