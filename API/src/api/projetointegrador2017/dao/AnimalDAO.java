package api.projetointegrador2017.dao;

import java.util.List;

import javax.persistence.EntityManager;


import api.projetointegrador2017.factory.ConnectionFactory;
import api.projetointegrador2017.model.Animal;
import sun.net.www.content.text.plain;

/**
 * Classe respons�vel por conter os metodos do CRUD
 * 
 * @author Matheus Gambarin
 *
 */
public class AnimalDAO extends ConnectionFactory {

	private static AnimalDAO instance;
	private EntityManager entityManager;

	/**
	 * M�todo responsavel por criar uma instancia
	 * 
	 * @author Matheus Gambarin
	 * @return
	 */
	public static AnimalDAO getInstance() {
		if (instance == null)
			instance = new AnimalDAO();
		return instance;
	}

	/**
	 * Met�do respons�vel por listar todos os animais
	 * 
	 * @author Matheus Gambarin
	 * @return
	 */

	public List<Animal> listarTodos() {
		entityManager = getEntityManager();
		@SuppressWarnings("unchecked")
		List<Animal> animais = entityManager.createQuery("FROM " + Animal.class.getTypeName()).getResultList();
		return animais;

	}

}
