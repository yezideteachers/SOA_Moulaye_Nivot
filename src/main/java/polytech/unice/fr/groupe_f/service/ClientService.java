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

import org.json.JSONArray;

import polytech.unice.fr.groupe_f.Client;

@Path("/clients")
//Here we generate JSON data from scratch, one should use a framework instead
@Produces(MediaType.APPLICATION_JSON)
public interface ClientService {

	
	
	@POST
	@Path("/create/{name}/{adress}/{mail}")
	public Response registerNewClient(@PathParam("name") String name,@PathParam("adress") String adress,
			@PathParam("mail") String mail);
	
	@GET
	public Response getAvailableClients() ;
	
	
	@DELETE
	@Path("/delete/{name}")
	public Response deleteClient(@PathParam("name") String name);
	
	@PUT
	@Path("/update/{name}/{adress}/{mail}")
	public Response updateClient(@PathParam("name") String name,@PathParam("adress") String adress,
					@PathParam("mail") String mail);
	
	@GET
	@Path("/search/{name}")
	public Response getClient(@PathParam("name")  String name);
	

	
	@GET
	@Path("/search/filter/{name}/{value}")
	public Response filterBy(@PathParam("name") String name, @PathParam("value") String v);
	
	@POST
	@Path("/order/{client}/{product}")
	public Response order(@PathParam("client") String client, @PathParam("product") String product);
}
