<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<div class="card card-info">
<c:if test="${param!=null && param.title!=null}">
<div class="card-header">${param.title}</div>
</c:if>

<div class="card-body">
