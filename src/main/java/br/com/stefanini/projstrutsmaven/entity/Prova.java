package br.com.stefanini.projstrutsmaven.entity;

import java.util.ArrayList;
import java.util.List;

public class Prova {

	private Integer idProva;
	private String materia;
	private List<Questao> questoes = new ArrayList<>();

	public Prova() {
		
	}

	public Prova(Integer idProva, String materia, List<Questao> questoes) {
		super();
		this.idProva = idProva;
		this.materia = materia;
		this.questoes = questoes;
	}

	@Override
	public String toString() {
		return "Prova [idProva=" + idProva + ", materia=" + materia + ", questoes=" + questoes + "]";
	}

	public Integer getIdProva() {
		return idProva;
	}

	public void setIdProva(Integer idProva) {
		this.idProva = idProva;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

}
