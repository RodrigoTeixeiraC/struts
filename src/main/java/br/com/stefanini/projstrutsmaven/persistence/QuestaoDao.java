package br.com.stefanini.projstrutsmaven.persistence;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.stefanini.projstrutsmaven.dto.QuestaoProvaDto;
import br.com.stefanini.projstrutsmaven.entity.Questao;

public class QuestaoDao extends Dao {

	public Integer createQuestao(QuestaoProvaDto q) throws Exception {
		open();
		Integer chave = 0;
		stmt = con.prepareStatement("insert into questao values (null, ?, ?, ?, ?, ?, ?, ?)",
				PreparedStatement.RETURN_GENERATED_KEYS);
		stmt.setString(1, q.getQuestao().getPergunta());
		stmt.setString(2, q.getQuestao().getAlternativaA());
		stmt.setString(3, q.getQuestao().getAlternativaB());
		stmt.setString(4, q.getQuestao().getAlternativaC());
		stmt.setString(5, q.getQuestao().getAlternativaD());
		stmt.setString(6, q.getQuestao().getResposta());
		stmt.setInt(7, q.getIdProva());
		stmt.executeUpdate();
		rs = stmt.getGeneratedKeys();
		rs.next();
		chave = rs.getInt(1);
		stmt.close();
		close();
		return chave;
	}

	public List<Questao> findQuestoesByProva(Integer idProva) throws Exception {
		open();
		stmt = con.prepareStatement("select * from questao where id_prova = ?");
		stmt.setInt(1, idProva);
		rs = stmt.executeQuery();
		List<Questao> questoes = new ArrayList<>();
		Questao questao = null;
		while (rs.next()) {
			questao = new Questao();
			questao.setIdQuestao(rs.getInt(1));
			questao.setPergunta(rs.getString(2));
			questao.setAlternativaA(rs.getString(3));
			questao.setAlternativaB(rs.getString(4));
			questao.setAlternativaC(rs.getString(5));
			questao.setAlternativaD(rs.getString(6));
			questao.setResposta(rs.getString(7));
			questoes.add(questao);
		}
		return questoes;
	}
	
	public void deleteQuestao(Integer id) throws Exception {
		open();
		stmt = con.prepareStatement("delete from prova where id = ?");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
	}
	
	public Integer updateQuestao(QuestaoProvaDto q) throws Exception {
		open();
		Integer chave = 0;
		stmt = con.prepareStatement("update questao set pergunta = ?, alternativaA = ?, alternativaB = ?, alternativaC = ?, "
				+ "alternativaD = ?, resposta = ?, id_prova = ? where id = ?)",
				PreparedStatement.RETURN_GENERATED_KEYS);
		stmt.setString(1, q.getQuestao().getPergunta());
		stmt.setString(2, q.getQuestao().getAlternativaA());
		stmt.setString(3, q.getQuestao().getAlternativaB());
		stmt.setString(4, q.getQuestao().getAlternativaC());
		stmt.setString(5, q.getQuestao().getAlternativaD());
		stmt.setString(6, q.getQuestao().getResposta());
		stmt.setInt(7, q.getIdProva());
		stmt.setInt(8, q.getQuestao().getIdQuestao());
		stmt.executeUpdate();
		rs = stmt.getGeneratedKeys();
		rs.next();
		chave = rs.getInt(1);
		stmt.close();
		close();
		return chave;
	}

}
