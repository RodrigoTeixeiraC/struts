<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Criar Prova</title>
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

		<div class=" d-flex align-items-center">
			<div class="col-md-6 mt-5 mb-5">
				<div class="row d-flex justify-content-center">
					<div class="col-md-10">
						<h1 class="text-center">Criar questão</h1>
						<s:form id="form4" action="questaoaction.criarQuestao"
							method="criarQuestao">
							<div class="mb-3">
								<label for="pergunta">Pergunta</label> <input
									class="form-control" type="text"
									name="questaoDto.questao.pergunta"
									id="questaoDto.questao.pergunta"
									placeholder="Digite a pergunta aqui">
							</div>
							<div class="mb-3">
								<label for="alternativaa">Alternativa A</label> <input
									class="form-control" type="text"
									name="questaoDto.questao.alternativaA"
									id="questaoDto.questao.alternativaA"
									placeholder="Digite a alternativa A">
							</div>
							<div class="mb-3">
								<label for="alternativab">Alternativa B</label> <input
									class="form-control" type="text"
									name="questaoDto.questao.alternativaB"
									id="questaoDto.questao.alternativaB"
									placeholder="Digite a alternativa B">
							</div>
							<div class="mb-3">
								<label for="alternativac">Alternativa C</label> <input
									class="form-control" type="text"
									name="questaoDto.questao.alternativaC"
									id="questaoDto.questao.alternativaCl"
									placeholder="Digite a alternativa C">
							</div>
							<div class="mb-3">
								<label for="alternativad">Alternativa D</label> <input
									class="form-control" type="text"
									name="questaoDto.questao.alternativaD"
									id="questaoDto.questao.alternativaD"
									placeholder="Digite a alternativa C">
							</div>
							<div class="mb-3">
								<label for="resposta">Resposta</label> <input
									class="form-control" type="text"
									name="questaoDto.questao.resposta"
									id="questaoDto.questao.resposta"
									placeholder="Digite a resposta">
							</div>
							<input class="form-control" type="hidden"
								name="questaoDto.idProva" id="questao.idProva" value=${idProva}>
							<div class="d-flex justify-content-center">
								<a class="btn btn-danger me-4"
									href="/projstrutsmaven/prof/inicio.jsp">Voltar para o
									Inicio</a>
								<button type="submit" class="btn btn-success">Adicionar
									questão</button>
							</div>
						</s:form>
					</div>
				</div>
			</div>

			<div class="col-md-6 d-flex justify-content-center row bg-secondary">
				<img src="https://i.imgur.com/H88yIo2.png" width="650px"
					height="650px" alt="">
			</div>

		</div>
	</div>

	<p class="col-md-6 text-danger text-center">${msg}</p>




</body>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.2/js/mdb.min.js"></script>
</html>