package polytech.unice.fr.groupe_f.service;

import java.util.Collection;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.json.JSONArray;

import polytech.unice.fr.groupe_f.Client;
import polytech.unice.fr.groupe_f.RegisterClients;

public class ClientImpl implements ClientService{

	public Response registerNewClient(String name) {
		/*if(RegisterClients.read("user4").getName() != null) {
			return Response.status(Response.Status.CONFLICT)
					       .entity("\"Existing name " + "user4" + " ; " + "adress1" + "\"")
					       .build();
		}*/
		RegisterClients.create(name, "adress4");
		return Response.ok().build();
	}

	public Response getAvailableClients() {
		RegisterClients.create("user7", "adress3");
		Collection<Client> clients = RegisterClients.getAvailableClients();
		JSONArray result = new JSONArray();
		for(Client c: clients) {
			result.put(c.toString());
		}
		return Response.ok().entity(result.toString(2)).build();
	}

	public Response deleteClient(String name) {
		if(RegisterClients.read(name) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		RegisterClients.delete(name);
		return Response.ok().build();
	}

	public Response updateClient(String name,String adress) {
		// TODO Auto-generated method stub
		RegisterClients.read("user7").setName("4545");
		return null;
	}

	public Response getClient(String name) {
		if(RegisterClients.read(name) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		String value = RegisterClients.read(name).toString();
		return Response.ok().entity("\""+value+"\"").build();
	}

	public Response filterBy(String name,String v) {

		Collection<Client> clients = RegisterClients.getAvailableClients();
		
		JSONArray result = new JSONArray();
		
			if(name.equals("name")){
				for(Client c: clients) {
					if(v.equals(c.getName())){result.put(c.toString());}
				}
			}
			else if(name.equals("adress")){
				for(Client c: clients) {
					if(v.equals(c.getAdress())){result.put(c.toString());}
				}
			}
			return Response.ok().entity(result.toString(2)).build();
	}

	
}
