package api.projetointegrador2017.controller;

import java.util.ArrayList;

import api.projetointegrador2017.dao.UsuarioDAO;
import api.projetointegrador2017.model.Usuario;

/**
 * Classe respons�vel por ser o controlador de usu�rios entre o resource e DAO
 * @author Matheus Gambarin
 *
 */
public class UsuarioController {

	public ArrayList<Usuario> listarTodos() {
		return UsuarioDAO.getInstance().listarTodos();
	}

	public String Inserir(String usuario) {	
		return UsuarioDAO.getInstance().Inserir(usuario);
	}
}
