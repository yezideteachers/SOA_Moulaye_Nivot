package polytech.unice.fr.groupe_f.service;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.json.JSONArray;

import polytech.unice.fr.groupe_f.Product;
import polytech.unice.fr.groupe_f.RegisterProducts;
import polytech.unice.fr.groupe_f.TYPE;

public class ProductImpl implements ProductService {

	public Response createNewProduct(int id, int size, TYPE type,
			String name, String color, double price) {
		if(RegisterProducts.read(name).getName() != null) {
			return Response.status(Response.Status.CONFLICT)
					       .entity("\"Existing name " + name + "\"")
					       .build();
		}
		RegisterProducts.create(id, name, type, color, price, size);
		return Response.ok().build();
	}

	public Response getAvailableProducts() {
		Collection<Product> products = RegisterProducts.getAvailableProducts();
		JSONArray result = new JSONArray();
		for(Product c: products) {
			result.put(c.toString());
		}
		return Response.ok().entity(result.toString(2)).build();
	}

	public Response deleteProduct(String name) {
		if(RegisterProducts.read(name) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		RegisterProducts.delete(name);
		return Response.ok().build();
	}

	public Response updateProduct(int size, String color) {
		// TODO Auto-generated method stub
		return null;
	}

	public Response getProduct(String name) {
		if(RegisterProducts.read(name) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		String value = RegisterProducts.read(name).toString();
		return Response.ok().entity("\""+value+"\"").build();
	}

	public Response filterBy(String name,String v) {
		Collection<Product> products = RegisterProducts.getAvailableProducts();
		
		JSONArray result = new JSONArray();
		
			if(name.equals("color")){
				for(Product c: products) {
					if(v.equals(c.getColor())){result.put(c.toString());}
				}
			}
			
			return Response.ok().entity(result.toString(2)).build();
	}

	
}
