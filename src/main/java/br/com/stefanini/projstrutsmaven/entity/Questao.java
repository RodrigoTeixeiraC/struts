package br.com.stefanini.projstrutsmaven.entity;

public class Questao {

	private Integer idQuestao;
	private String pergunta;
	private String alternativaA;
	private String alternativaB;
	private String alternativaC;
	private String alternativaD;
	private String resposta;

	public Questao() {
	}

	public Questao(Integer idQuestao, String pergunta, String alternativaA, String alternativaB, String alternativaC,
			String alternativaD, String resposta) {
		super();
		this.idQuestao = idQuestao;
		this.pergunta = pergunta;
		this.alternativaA = alternativaA;
		this.alternativaB = alternativaB;
		this.alternativaC = alternativaC;
		this.alternativaD = alternativaD;
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "Questao [idQuestao=" + idQuestao + ", pergunta=" + pergunta + ", alternativaA=" + alternativaA
				+ ", alternativaB=" + alternativaB + ", alternativaC=" + alternativaC + ", alternativaD=" + alternativaD
				+ ", resposta=" + resposta + "]";
	}

	public Integer getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(Integer idQuestao) {
		this.idQuestao = idQuestao;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getAlternativaA() {
		return alternativaA;
	}

	public void setAlternativaA(String alternativaA) {
		this.alternativaA = alternativaA;
	}

	public String getAlternativaB() {
		return alternativaB;
	}

	public void setAlternativaB(String alternativaB) {
		this.alternativaB = alternativaB;
	}

	public String getAlternativaC() {
		return alternativaC;
	}

	public void setAlternativaC(String alternativaC) {
		this.alternativaC = alternativaC;
	}

	public String getAlternativaD() {
		return alternativaD;
	}

	public void setAlternativaD(String alternativaD) {
		this.alternativaD = alternativaD;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
