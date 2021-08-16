package br.com.stefanini.projstrutsmaven.persistence;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.stefanini.projstrutsmaven.entity.Prova;

public class ProvaDao extends Dao {

	public Integer createProva(Prova p) throws Exception {
		open();
		Integer chave = 0;
		stmt = con.prepareStatement("insert into prova values (null, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
		stmt.setString(1, p.getMateria());
		stmt.executeUpdate();
		rs = stmt.getGeneratedKeys();
		rs.next();
		chave = rs.getInt(1);
		stmt.close();
		close();
		return chave;
	}

	public List<Prova> findAllProvas() throws Exception {
		open();
		stmt = con.prepareStatement("select * from prova");
		rs = stmt.executeQuery();
		List<Prova> provas = new ArrayList<>();
		Prova prova = null;
		while (rs.next()) {
			prova = new Prova();
			prova.setIdProva(rs.getInt(1));
			prova.setMateria(rs.getString(2));
			provas.add(prova);
		}
		close();
		return provas;
	}

}
