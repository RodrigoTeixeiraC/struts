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

import br.com.stefanini.projstrutsmaven.entity.Prova;
import br.com.stefanini.projstrutsmaven.persistence.ProvaDao;

public class ProvaAction extends ActionSupport implements ModelDriven<Prova> {

	private static final long serialVersionUID = 1L;
	private Prova prova;
	HttpServletRequest request;
	HttpServletResponse response;
	ServletContext context;

	public void init() {
		request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		response = (HttpServletResponse) ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
	}

	public ProvaAction() {
		prova = new Prova();
	}

	@Override
	public Prova getModel() {
		return prova;
	}

	public String execute() throws Exception {
		return "success";
	}

	public String criarProva() {
		init();
		ProvaDao pd = new ProvaDao();
		HttpSession session = request.getSession(true);
		try {
			session.setAttribute("idProva", pd.createProva(prova));
			session.setAttribute("msg", "Prova criada com sucesso!");
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public String buscarProvas() {
		init();
		ProvaDao pd = new ProvaDao();
		HttpSession session = request.getSession(true);
		try {
			List<Prova> listaP = new ArrayList<>();
			listaP = pd.findAllProvas();
			session.setAttribute("provas", listaP);
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public String buscarProvasAluno() {
		init();
		ProvaDao pd = new ProvaDao();
		HttpSession session = request.getSession(true);
		try {
			List<Prova> listaP = new ArrayList<>();
			listaP = pd.findAllProvas();
			session.setAttribute("provas", listaP);
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

}
