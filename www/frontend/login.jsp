<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="/common/_open_page.jsp"></jsp:include> 
<jsp:include page="/common/_open_card.jsp">

<jsp:param name="title" value="Login" />
</jsp:include>
<form method="post" action="main?action=utente.login">
<div class="form-group">

<label>Email</label><br>
<input type="text" name="email" class="form-control"/><br>
</div>

<label>Password</label><br>
<input type="password" name="password" class="form-control"/><br>
<input type="submit" class="btn btn-primary" value="Entra"/><br>

</form>
<jsp:include page="/common/_close_card.jsp"></jsp:include>
<jsp:include page="/common/_close_page.jsp"></jsp:include> 