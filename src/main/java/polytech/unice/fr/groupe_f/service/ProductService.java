package polytech.unice.fr.groupe_f.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import polytech.unice.fr.groupe_f.TYPE;



@Path("/products")
//Here we generate JSON data from scratch, one should use a framework instead
@Produces(MediaType.APPLICATION_JSON)
public interface ProductService {
	
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response createNewProduct(int id, int size, TYPE type, String name,String color, double price);
	
	@GET
	public Response getAvailableProducts();
	
	
	@DELETE
	public Response deleteProduct(String name);

	@PUT
	public Response updateProduct(int size , String color);
	
	
	@GET
	@Path("/name")
	public Response getProduct(@PathParam("/name") String name);
	
	@GET
	@Path("/name/filter")
	public Response filterBy(@PathParam("/name/filter") String name,String v);
		

}
