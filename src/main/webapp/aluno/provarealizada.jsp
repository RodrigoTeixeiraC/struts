<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prova Realizada</title>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*, br.com.stefanini.projstrutsmaven.dto.*"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/css/mdb.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>
<body class="bg-secondary">

	<div class="container">
		<h1 class="mt-5 text-center">Parabéns</h1>
		<h5 class="mt-3 text-center">${msg}</h5>
		<div class="d-flex justify-content-center">
			<a class="btn btn-info d-flex justify-content-center mt-5"
				style="width: 400px" href="/projstrutsmaven/aluno/inicio.jsp">Voltar
				ao início</a> <a
				class="btn btn-danger d-flex justify-content-center mt-5"
				style="width: 400px" href="/projstrutsmaven/login.jsp">sair</a>
		</div>
	</div>



</body>
</html>