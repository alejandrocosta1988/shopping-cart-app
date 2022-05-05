<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.time.LocalDate"%>

<%
    int currentYear = LocalDate.now().getYear();
%>

<p>Shopping Cart App é uma aplicação criada para praticar o uso de tags JSTL. Desenvolvimento Web com JavaServer Pages e Servlets.</p>
<p>
    &copy; Alejandro Costa <%= currentYear %>
</p>