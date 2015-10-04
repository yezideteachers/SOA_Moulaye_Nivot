package polytech.unice.fr.groupe_f.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/clients")
//Here we generate JSON data from scratch, one should use a framework instead
@Produces(MediaType.APPLICATION_JSON)
public interface ClientService {

	
	
	@POST
	public Response registerNewClient(String name) ;
	
	@GET
	public Response getAvailableClients() ;
	
	
	@DELETE
	public Response deleteClient(String name);
	
	@PUT
	public Response updateClient(String name, String adress);
	
	@GET
	@Path("/name")
	public Response getClient(@PathParam("/name") String name);
	
	@GET
	@Path("/name/filter")
	public Response filterBy(@PathParam("/name/filter") String name,String v);

}
