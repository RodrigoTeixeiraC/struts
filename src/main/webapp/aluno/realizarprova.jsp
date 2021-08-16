<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prova</title>
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
	List<Questao> questoes = (List<Questao>)session.getAttribute("questoes");
	%>

	<div class="container">
		<div class="d-flex justify-content-center mt-5">
			<div class="col-md-6">
			<s:form id="form7" action="questaoaction.finalizarProva" method="finalizarProva">
				<%
				for (Questao questao : questoes){
					out.println(
							"<div class=\"card w-100 mt-3\" style=\"width: 18rem;\">" +
								"<div class=\"card-header\">" +
									"<h5 class=\"card-title\">"+ questao.getPergunta() +"</h5>" +
								"</div>" +
								"<div class=\"card-body\">" +
									"<div>" +
										"A - " + questao.getAlternativaA() + 
									"</div>" +
									"<div>" +
										"B - " + questao.getAlternativaB() + 
									"</div>" +
									"<div>" +
										"C - " + questao.getAlternativaC() + 
									"</div>" +
									"<div>" +
										"D - " + questao.getAlternativaD() + 
									"</div>" +
									"<select class=\"form-control mt-3\" id=\"resposta\" name=\"resposta " + questao.getIdQuestao() + "\">" +
				 						"<option selected>Selecione qual prova deseja fazer</option>" +
				 						"<option value="+ questao.getAlternativaA() +">Opção A</option>" +
				 						"<option value="+ questao.getAlternativaB() +">Opção B</option>" +
				 						"<option value="+ questao.getAlternativaC() +">Opção C</option>" +
				 						"<option value="+ questao.getAlternativaD() +">Opção D</option>" +
				 					"</select>" +
								"</div>" +
							"</div>"
							);
				}
			%>
			<div class="d-flex justify-content-center mt-3">
			<button class="btn btn-success" type="submit">Finalizar prova</button>
			<a class="btn btn-danger" href="/projstrutsmaven/aluno/verprovas.jsp">Voltar</a>
			</div>
			
			</s:form>
				
			</div>
		</div>
	</div>

</body>
</html>