<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todas as provas</title>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*, br.com.stefanini.projstrutsmaven.entity.*"%>
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
	<%
		List<Prova> provas = (List<Prova>) session.getAttribute("provas");
	%>



	<div class="container">
		<h1 class="text-center mt-5 ">Lista de Provas</h1>
		<div class="d-flex justify-content-center">
			<div class="col-md-6">
				<s:form id="form6" action="questaoaction.buscarQuestoes"
					method="buscarQuestoes">
					<select class="form-control" id="questaoDto.idProva"
						name="questaoDto.idProva">
						<option selected>Selecione qual prova deseja fazer</option>
						<%
							for (Prova prova : provas) {
									out.println("<option value=" + prova.getIdProva() + ">" + prova.getMateria() + "</option>");
								}
						%>
					</select>
					<div class="d-flex justify-content-center mt-3">
						<button type="submit" class="btn btn-success" style="width:150px">Iniciar
						prova</button>
						<a class="btn btn-danger" style="width:150px" href="/projstrutsmaven/aluno/inicio.jsp">Voltar</a>
					</div>
					
				</s:form>
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