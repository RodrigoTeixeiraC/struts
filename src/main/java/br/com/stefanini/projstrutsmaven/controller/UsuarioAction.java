package br.com.stefanini.projstrutsmaven.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import br.com.stefanini.projstrutsmaven.entity.Usuario;
import br.com.stefanini.projstrutsmaven.persistence.UsuarioDao;

public class UsuarioAction extends ActionSupport implements ModelDriven<Usuario> {

	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	HttpServletRequest request;
	HttpServletResponse response;
	ServletContext context;

	public void init() {
		request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		response = (HttpServletResponse) ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
	}

	public UsuarioAction() {
		usuario = new Usuario();
	}

	@Override
	public Usuario getModel() {
		return usuario;
	}

	public String execute() {
		return "success";
	}

	public String login() {
		init();
		UsuarioDao ud = new UsuarioDao();
		try {
			HttpSession session = request.getSession(true);
			Usuario resp = ud.findByLogin(usuario);
			if (resp != null & resp.getPerfil().equals("prf")) {
				usuario = resp;
				session.setAttribute("usuario", usuario);
				request.setAttribute("msg", "Professor logado");
				return LOGIN;
			} else if (resp != null & resp.getPerfil().equals("alu")) {
				usuario = resp;
				session.setAttribute("usuario", usuario);
				request.setAttribute("msg", "Usuario logado");
				return SUCCESS;
			} else {
				throw new IllegalArgumentException("Erro de acesso");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public String cadastrar() {
		init();
		UsuarioDao ud = new UsuarioDao();
		try {
			HttpSession session = request.getSession(true);
			ud.createUsuario(usuario);
			session.setAttribute("usuario", usuario);
			request.setAttribute("msg", "Usuário cadastrado");
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg", ex.getMessage());
			return ERROR;
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
