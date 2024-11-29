<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="/common/_open_page.jsp"></jsp:include> 


<jsp:include page="/common/_open_card.jsp">

<jsp:param name="title" value="Catalogo" />
</jsp:include>



<form action="main?action=cart.add" method="post">
<table  class="table">
<thead>
	<th>Prodotto</th>
	<th>Importo</th>
	<th></th>
</thead>
<tbody>
<c:forEach items="${model}" var="item">
<tr>
	<input type="hidden" name="id[]" value="${item.id}"/>
	<td><a href="main?action=prodotto.view&id=${item.id}">${item.nome}</a></td>
	<td>${item.prezzo}</td>
	<td><input type="number" name="quantita" value="0" class="form-control"/></td>
	
</tr>
</c:forEach>
</tbody>
</table>
<hr>
<input type="submit"  value="Aggiungi a carrello" class="btn btn-primary"/>
</form>
<a href="main?action=frontend.login" class="btn btn-primary">Entra</a>



<jsp:include page="/common/_close_page.jsp"></jsp:include>
