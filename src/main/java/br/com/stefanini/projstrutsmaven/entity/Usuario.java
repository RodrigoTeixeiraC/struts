package br.com.stefanini.projstrutsmaven.entity;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private String senha;
	private String perfil;

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String email, String senha, String perfil) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", perfil=" + perfil + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
