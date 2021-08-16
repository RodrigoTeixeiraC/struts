<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema Aluno</title>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/css/mdb.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>
<body>

	<div class="container-fluid">

		<div class="row bg-secondary d-flex align-items-center">
			<div class="col-md-6 text-white text-left">
				<div class="row d-flex justify-content-center">
					<div class="col-md-6">
						<h1 class="fs-54">Seja bem vindo(a)!</h1>
					</div>
				</div>
				<div class="row d-flex justify-content-center mt-3 mb-5">
					<div class="col-md-6">
						<s:form id="form5" action="provaaction.buscarProvasAluno"
							method="buscarProvasAluno">
							<button type="submit" class="btn btn-outline-light">Ver
								Provas</button>
						</s:form>

					</div>

				</div>
			</div>

			<div class="col-md-6 d-flex justify-content-center">
				<img src="https://i.imgur.com/H88yIo2.png" width="650px"
					height="650px" alt="">
			</div>

		</div>
	</div>

</body>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/js/mdb.min.js"></script>
</html>