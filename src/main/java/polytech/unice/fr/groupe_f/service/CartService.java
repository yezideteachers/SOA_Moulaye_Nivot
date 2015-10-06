package polytech.unice.fr.groupe_f.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/carts")
//Here we generate JSON data from scratch, one should use a framework instead
@Produces(MediaType.APPLICATION_JSON)
public interface CartService {

	@GET
	public Response getAllCommande();
	
	@GET
	@Path("/get/{idProd}")
	public Response getPanier(@PathParam("id") int id);
	
	@POST
	@Path("/addToCart/{idProd}")
	public Response addToCart(@PathParam("idProd") int id);
	
	@DELETE
	@Path("/delete/{idProd}")
	public Response deleteToCart(@PathParam("idProd") int id);
}
