package polytech.unice.fr.groupe_f.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cart")
//Here we generate JSON data from scratch, one should use a framework instead
@Produces(MediaType.APPLICATION_JSON)
public interface CartService {

	@GET
	public Response getAllCommande();
	
	@GET
	@Path("/name/{id}")
	public Response getCommande(@PathParam("id") int id);
}
