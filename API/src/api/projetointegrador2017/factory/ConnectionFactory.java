package api.projetointegrador2017.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe respons�vel por conter os m�todos de criar e fechar conex�o com banco
 * 
 * @author Matheus Gambarin
 *
 */
public class ConnectionFactory {
	private static EntityManager entityManager;

	/**
	 * M�todo respons�vel por criar conex�o com o banco
	 * 
	 * @author Matheus Gambarin
	 * @return
	 */

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoIntegrador");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	/**
	 * @author Matheus Gambarin
	 * 
	 * 		M�todo respons�vel por fechar conex�o com o banco
	 */
	public static void fecharConexao() {
		if (entityManager != null) {
			entityManager.close();
		}
	}
}
