<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
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
		<div class="row align-items-center">
			<div class="col-md-6">
				<div class="row d-flex justify-content-center">
					<div class="col-md-6">
						<h1 class="text-center mb-3">Entrar</h1>

						<s:form id="form2" action="usuarioaction.login" method="login">

							<div class="form-group">
								<label for="usuario">E-mail</label> <input class="form-control"
									type="text" name="usuario.email" id="usuario.email"
									placeholder="Seu e-mail">
							</div>

							<div class="form-group">
								<label for="senha">Senha</label> <input class="form-control"
									type="password" name="usuario.senha" id="usuario.senha"
									placeholder="Sua senha">
							</div>

							<div class="d-flex justify-content-center">
								<button type="submit" class="btn btn-success mt-3">Entrar</button>
							</div>
						</s:form>

						<hr class="mt-4 mb-4">

						<p class="text-center">
							Não tem conta? <a href="/projstrutsmaven/cadastrar.jsp">Cadastre-se</a>
						</p>
						<p class="text-center text-danger">${msg}...</p>

					</div>
				</div>
			</div>
			<div class="col-md-6" id="img-bg"></div>
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