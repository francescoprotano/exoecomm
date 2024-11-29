<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="/common/_open_page.jsp"></jsp:include> 

Id ${model.id}
Nome ${model.nome}
Prezzo ${model.prezzo}
<br>
<a class="btn btn-info" href="main?action=frontend.home">Indietro</a>
<jsp:include page="/common/_close_page.jsp"></jsp:include> 