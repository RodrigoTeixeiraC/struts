package br.com.stefanini.projstrutsmaven.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import br.com.stefanini.projstrutsmaven.dto.QuestaoProvaDto;
import br.com.stefanini.projstrutsmaven.entity.Questao;
import br.com.stefanini.projstrutsmaven.persistence.QuestaoDao;

public class QuestaoAction extends ActionSupport implements ModelDriven<QuestaoProvaDto> {

	private static final long serialVersionUID = 1L;
	private QuestaoProvaDto questaoDto;
	HttpServletRequest request;
	HttpServletResponse response;
	ServletContext context;

	public void init() {
		request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		response = (HttpServletResponse) ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
	}

	public QuestaoAction() {
		questaoDto = new QuestaoProvaDto();
	}

	public String execute() {
		return "success";
	}

	@Override
	public QuestaoProvaDto getModel() {
		return questaoDto;
	}

	public String criarQuestao() {
		init();
		QuestaoDao qd = new QuestaoDao();
		HttpSession session = request.getSession(true);
		try {
			session.setAttribute("idQuestao", qd.createQuestao(questaoDto));
			session.setAttribute("msg", "Questao criada com sucesso!");
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public String buscarQuestoes() {
		init();
		QuestaoDao qd = new QuestaoDao();
		HttpSession session = request.getSession(true);
		try {
			List<Questao> listaQ = new ArrayList<>();
			listaQ = qd.findQuestoesByProva(questaoDto.getIdProva());
			session.setAttribute("questoes", listaQ);
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public String finalizarProva() {
		init();
		int i = 0;
		HttpSession session = request.getSession(true);
		List<Questao> questoes = (List<Questao>) session.getAttribute("questoes");
		for (Questao questao : questoes) {
			if (questao.getResposta().equals(request.getParameter("resposta " + questao.getIdQuestao()))) {
				i++;
			}
		}
		session.setAttribute("msg",
				"Prova finalizada com sucesso, você acertou " + i + " de " + questoes.size() + " questões.");
		return SUCCESS;
	}

	public QuestaoProvaDto getQuestaoDto() {
		return questaoDto;
	}

	public void setQuestaoDto(QuestaoProvaDto questaoDto) {
		this.questaoDto = questaoDto;
	}

}
