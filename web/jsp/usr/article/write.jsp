<%@ page import="com.ll.jung.article.dto.ArticleDto" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<ArticleDto> articleDtos = (List<ArticleDto>) request.getAttribute("articles");
%>

<h1>list 작성 페이지</h1>

