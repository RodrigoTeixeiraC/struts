<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar</title>
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
		<div class="row">
			<div class="col-md-6" id="img-bg"></div>

			<div class="col-md-6 mt-5 mb-5">
				<div class="row d-flex justify-content-center">
					<div class="col-md-10">
						<h1 class="text-center">Cadastro</h1>
						<s:form id="form1" action="usuarioaction.cadastrar"
							method="cadastrar">
							<div class="mb-3">
								<label for="nome">Nome</label> <input class="form-control"
									type="text" name="usuario.nome" id="usuario.nome"
									placeholder="nome">
							</div>
							<div class="mb-3">
								<label for="email">E-mail</label> <input class="form-control"
									type="email" name="usuario.email" id="usuario.email"
									placeholder="Seu e-mail">
							</div>
							<div class="mb-3">
								<label for="senha">Senha</label> <input class="form-control"
									type="password" name="usuario.senha" id="usuario.senha"
									placeholder="Sua senha">
							</div>
							<div class="mb-3">
								<label for="tipo">Tipo de usuário</label> <select
									class="form-control" name="usuario.perfil" id="usuario.perfil">
									<option>Selecione um tipo de usuário</option>
									<option value="alu">Aluno</option>
									<option value="prf">professor</option>
								</select>
							</div>
							<div class="d-flex justify-content-center">
								<a class="btn btn-danger me-4" href="/projstrutsmaven/login.jsp">Cancelar</a>
								<button type="submit" class="btn btn-success">Cadastrar</button>
							</div>
						</s:form>
					</div>
				</div>
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