﻿<%@page import="java.net.URLEncoder"%>
<%@page import="xyz.itwill.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	//session 내장객체에서 권한 관련 정보가 저장된 속성값을 객체로 반환받아 저장
	MemberDTO loginMember=(MemberDTO)session.getAttribute("loginMember");

	//비로그인 사용자가 JSP 문서를 요청한 경우에 대한 응답 처리
	if(loginMember == null) {
		//request.getRequestURI() : 요청 URL 주소에서 JSP 문서의 경로를 반환하는 메소드
		String requestURI=request.getRequestURI();
		//System.out.println("requestURI = "+requestURI);//requestURI = /shop/index.jsp
				
		//request.getQueryString() : 요청 URL 주소에서 질의문자열(QueryString)을 반환하는 메소드
		String queryString=request.getQueryString();		
		//System.out.println("queryString = "+queryString);//queryString = workgroup=cart&work=cart_list
		
		//현재 실행중인 JSP 문서의 URL 주소를 생성하여 저장
		String url=requestURI;
		if(queryString != null) {
			url+="?"+queryString;
		}
		
		//URL 주소를 부호화 처리하여 저장
		url=URLEncoder.encode(url, "utf-8");
		System.out.println("url = "+url);
		
		request.setAttribute("returnUrl", request.getContextPath()+"/index.jsp?workgroup=member&work=member_login&url="+url);
		return;	
	}
--%>   
<%@include file="/security/login_url.jspf" %> 
<h1>장바구니 목록</h1>






