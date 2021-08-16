package br.com.stefanini.projstrutsmaven.dto;

import br.com.stefanini.projstrutsmaven.entity.Questao;

public class QuestaoProvaDto {

	private Questao questao;
	private Integer idProva;
	private String resposta;

	public QuestaoProvaDto() {
	}

	public QuestaoProvaDto(Questao questao, Integer idProva, String resposta) {
		super();
		this.questao = questao;
		this.idProva = idProva;
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "QuestaoProvaDto [questao=" + questao + ", idProva=" + idProva + ", resposta=" + resposta + "]";
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public Integer getIdProva() {
		return idProva;
	}

	public void setIdProva(Integer idProva) {
		this.idProva = idProva;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
