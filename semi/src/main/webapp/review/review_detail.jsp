<%@page import="xyz.itwill.dto.UsersDTO"%>
<%@page import="xyz.itwill.dao.ReviewDAO"%>
<%@page import="xyz.itwill.dto.ReviewDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
  //비정상적으로 JSP 문서를 요청한 경우에 대한 응답 처리
  	if(request.getParameter("reviewNum") == null) {//전달값이 없는 경우
  		request.setAttribute("returnUrl", request.getContextPath()+"/index.jsp?workgroup=error&work=error_400");
  		return;
  	}
        
	int reviewNum=Integer.parseInt(request.getParameter("reviewNum"));
	String pageNum=request.getParameter("pageNum");
	String pageSize=request.getParameter("pageSize");
	
	ReviewDTO review=ReviewDAO.getDAO().selectReviewByNum(reviewNum);

	if(review == null) {//검색된 게시글이 없는 경우 
		request.setAttribute("returnUrl", request.getContextPath()+"/index.jsp?workgroup=error&work=error_400");
		return;
	}
    
	
	UsersDTO loginUsers=(UsersDTO)session.getAttribute("loginUsers");
	

    
    %>
    

    
<style type="text/css">
#review_detail {
	width: 500px;
	margin: 0 auto;

	height: 350px;
	margi-top:20px;
	
}

#review-detail-middle-box{
	width: 500px;
	height: 200px;
	
	margin-top:60px;
}

table {
	border: 1px solid black;
	border-collapse: collapse;
	font-size: 17px;
	
}

th, td {
	border: 1px solid black;
	padding: 5px;	
}

th {
	width: 100px;
	background: black;
	color: white;
}

td {
	width: 400px;
}

.subject, .content {
	text-align: left;
}

.content {
	height: 300px;
	vertical-align: middle;
}

#review_menu {
	text-align: right;
	margin: 5px;
}
</style>

<div id="review_detail">
<div id="review-detail-middle-box">
	<h1 style="text-align: center; margin-bottom:20px; font-size:27px;">제품후기</h1>
	
	<%-- 검색된 게시글 출력 --%>
	<table>
		<tr>
			<th>작성자</th>
			<td>
				<%=review.getUsersName() %>
				<%-- 로그인 사용자가 관리자인 경우 게시글을 작성한 클라이언트의 IP 주소 출력 --%>	
			</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td><%=review.getReviewDate() %></td>
		</tr>
		<tr>
			<th>제목</th>
			<td>		
				<%=review.getReviewContent() %>
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<%=review.getReviewContent().replace("\n", "<br>") %>
				<br>
				<% if(review.getReviewImage() != null) { %>
					<img src="<%=request.getContextPath()%>/review_images/<%=review.getReviewImage()%>" width="200">
				<% } %>
			</td>
		</tr>
	</table>
	
	<%-- 링크를 제공하는 태그 출력 --%>
	<div id="review_menu">
		<%-- 로그인 사용자가 게시글 작성자이거나 관리자인 경우 태그 출력 --%>
		<% if(loginUsers !=null && (loginUsers.getUsersNo() == review.getReviewUserNo()
			|| loginUsers.getUsersStatus() == 9)) { %>
			<button type="button" id="removeBtn">글삭제</button>
		<% } %>
		
		<button type="button" id="listBtn">글목록</button>
	</div>
	</div>
</div>

<script type="text/javascript">


$("#removeBtn").click(function() {
	if(confirm("게시글을 정말로 삭제 하시겠습니까?")) {
		location.href="<%=request.getContextPath()%>/index.jsp?workgroup=review&work=review_remove_action"
			+"&reviewNum=<%=review.getReviewNum()%>&pageNum=<%=pageNum%>&pageSize=<%=pageSize%>";
	}
});



$("#listBtn").click(function() {
	location.href="<%=request.getContextPath()%>/index.jsp?workgroup=review&work=review"
		+"&pageNum=<%=pageNum%>&pageSize=<%=pageSize%>";
});
</script>