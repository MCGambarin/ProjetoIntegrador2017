package api.projetointegrador2017.resource;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import api.projetointegrador2017.controller.AnimalController;
import api.projetointegrador2017.model.Animal;

/**
 * Classe respons�vel por conter os met�dos rest de acesso ao webservice
 * @author Matheus Gambarin
 *
 */

@Path("/animal")
public class AnimalResource {

	
	
	@GET
	@Path("/listartodos")
	@Produces("application/json")
	public List<Animal>listarTodos(){
		return new AnimalController().listarTodos();
	}
}
