package api.projetointegrador2017.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import api.projetointegrador2017.factory.ConnectionFactory;
import api.projetointegrador2017.model.Animal;
import api.projetointegrador2017.model.Usuario;

/**
 * Classe respons�vel pelo CRUD de USUARIO
 * 
 * @author Matheus Gambarin
 *
 */
public class UsuarioDAO extends ConnectionFactory {

	private static UsuarioDAO instance;

	/**
	 * met�do respons�vel por criar uma instancia de usu�rio
	 * 
	 * @author Matheus Gambarin
	 * @return
	 */
	public static UsuarioDAO getInstance() {
		if (instance == null)
			instance = new UsuarioDAO();
		return instance;
	}

	/**
	 * Met�do respons�vel por listar todos os usu�rios
	 * 
	 * @author Matheus Gambarin
	 * @return
	 */
	public ArrayList<Usuario> listarTodos() {
		return null;
	}

	public String Inserir(String usuario) {
		return null;
	}
}
