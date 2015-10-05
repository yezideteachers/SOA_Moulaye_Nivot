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
	@Path("/create/{size},{type},{name},{color},{price}")
	
	public Response createNewProduct(@PathParam("size")int size, @PathParam("type") TYPE type,
			@PathParam("name") String name,@PathParam("color") String color, 
			@PathParam("price") double price);
	
	@GET
	public Response getAvailableProducts();
	
	
	@DELETE
	public Response deleteProduct(String name);

	@PUT
	public Response updateProduct(int size , String color);
	
	
	@GET
	@Path("/search/{name}")
	public Response getProduct(@PathParam("name") String name);
	
	@GET
	@Path("/search/filter/{kind},{value}")
	public Response filterBy(@PathParam("kind") String name, @PathParam("value") String v);
		

}
