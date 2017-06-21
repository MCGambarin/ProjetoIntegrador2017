package api.projetointegrador2017.factory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe respons�vel por conter os m�todos de criar e fechar conex�o com banco
 * @author Matheus Gambarin
 *
 */
public class ConnectionFactory {
	
	//Caminho Banco
	private static String  DRIVER = "org.postgresql.Driver";
	private static String  URL = "jdbc:postgresql://localhost:5432/ProjetoIntegrador";
	private static String  USUARIO = "postgres";
	private static String  SENHA = "projetointegrador";

	/**
	 * M�todo respons�vel por criar conex�o com o banco
	 * @author Matheus Gambarin
	 * @return
	 */
	public Connection criarConexao(){
		Connection conexao = null;
		try{
			
			Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch(Exception e){
			System.out.println("Erro ao criar conex�o com o banco: " + URL);
			e.printStackTrace();
		}
		
		return conexao;
	}
}
