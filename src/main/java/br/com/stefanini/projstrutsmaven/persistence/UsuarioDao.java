package br.com.stefanini.projstrutsmaven.persistence;

import com.mysql.jdbc.PreparedStatement;

import br.com.stefanini.projstrutsmaven.entity.Usuario;

public class UsuarioDao extends Dao {

	public Integer createUsuario(Usuario u) throws Exception {
		open();
		Integer chave = 0;
		stmt = con.prepareStatement("insert into usuario values (null, ?,?,?,?)",
				PreparedStatement.RETURN_GENERATED_KEYS);
		stmt.setString(1, u.getNome());
		stmt.setString(2, u.getEmail());
		stmt.setString(3, u.getSenha());
		stmt.setString(4, u.getPerfil());
		stmt.executeUpdate();
		rs = stmt.getGeneratedKeys();
		rs.next();
		chave = rs.getInt(1);
		stmt.close();
		close();
		return chave;
	}

	public Usuario findByLogin(Usuario u) throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario u where u.email=? and u.senha=?");
		stmt.setString(1, u.getEmail());
		stmt.setString(2, u.getSenha());
		rs = stmt.executeQuery();
		Usuario resp = null;
		if (rs.next()) {
			resp = new Usuario();
			resp.setIdUsuario(rs.getInt(1));
			resp.setNome(rs.getString(2));
			resp.setEmail(rs.getString(3));
			resp.setSenha(rs.getString(4));
			resp.setPerfil(rs.getString(5));
		}
		close();
		return resp;
	}

}
