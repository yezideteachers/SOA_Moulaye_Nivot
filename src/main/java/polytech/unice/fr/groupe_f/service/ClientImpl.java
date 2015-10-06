package polytech.unice.fr.groupe_f.service;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import polytech.unice.fr.groupe_f.Cart;
import polytech.unice.fr.groupe_f.Client;
import polytech.unice.fr.groupe_f.Product;
import polytech.unice.fr.groupe_f.RegisterClients;
import polytech.unice.fr.groupe_f.RegisterProducts;

public class ClientImpl implements ClientService{

	public Response registerNewClient(String name,String adress,String mail) {
		/*if(RegisterClients.read("user4").getName() != null) {
			return Response.status(Response.Status.CONFLICT)
					       .entity("\"Existing name " + "user4" + " ; " + "adress1" + "\"")
					       .build();
		}*/
		RegisterClients.create(name, adress,mail);
		return Response.ok().build();
	}
	
	public Response getAvailableClients() {
		
		Collection<Client> clients = RegisterClients.getAvailableClients();
		JSONArray result = new JSONArray();
		ArrayList<Client> list = new ArrayList<Client>();
		for(Client c: clients) {
			list.add(c);
		}
		JSONObject jso = new JSONObject();
		jso.put("list of clients", list);
		return Response.ok().entity(jso.toString(2)).build();
	}

	public Response deleteClient(String name) {
		if(RegisterClients.read(name) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		RegisterClients.delete(name);
		return Response.ok().build();
	}

	public Response updateClient(String name,String adress,String mail) {
		
		RegisterClients.update(name,adress,mail,RegisterClients.read(name).getNbCommande());
		return Response.ok().build();
		
	}

	public Response getClient(String nameClient) {
		if(RegisterClients.read(nameClient) == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		
		}
		String name = RegisterClients.read(nameClient).getName();
		String mail = RegisterClients.read(nameClient).getMail();
		String address = RegisterClients.read(nameClient).getAdress();
		int nbCommande = RegisterClients.read(nameClient).getNbCommande();
		JSONObject jo = new JSONObject();
		jo.put("name", name);
		jo.put("mail", mail);
		jo.put("address", address);
		jo.put("nbOfCommande", nbCommande);
		return  Response.ok().entity(jo.toString()).build();
	}

	public Response filterBy(String name,String v) {

		Collection<Client> clients = RegisterClients.getAvailableClients();
		ArrayList<Client> list = new ArrayList<Client>();
		JSONArray result = new JSONArray();
		
			if(name.equals("name")){
				for(Client c: clients) {
					if(v.equals(c.getName())){list.add(c);}
				}
			}
			else if(name.equals("adress")){
				for(Client c: clients) {
					if(v.equals(c.getAdress())){list.add(c);}
				}
			}
			else if(name.equals("mail")){
				for(Client c: clients) {
					if(v.equals(c.getMail())){list.add(c);}
				}
			}
			else if(name.equals("nbCommande")){
				for(Client c: clients) {
					if(v.equals(c.getNbCommande())){list.add(c);}
				}
			}
			return Response.ok().entity(result.toString(2)).build();
		}

	public Response order(String client, String product) {
		/*try {
			RegisterClients.read(client);
			RegisterProducts.read(product);
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}*/
		
		JSONObject js=new JSONObject();
		return Response.ok().entity(js).build();
	}

	
}
