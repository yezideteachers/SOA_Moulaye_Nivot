package polytech.unice.fr.groupe_f.service;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.core.Response;

import org.json.JSONArray;

import polytech.unice.fr.groupe_f.Cart;
import polytech.unice.fr.groupe_f.Client;
import polytech.unice.fr.groupe_f.RegisterClients;

public class CartImpl implements CartService {

	public Response getAllCommande() {
		// TODO Auto-generated method stub
		Collection<ArrayList> cart = Cart.mapCart.values();
		JSONArray result = new JSONArray();
		for(ArrayList el: cart) {
			result.put(el.toString());
		}
		return Response.ok().entity(result.toString(2)).build();
	}

	public Response getCommande(int id) {
		ArrayList commande = Cart.mapCart.get(id);
		return Response.ok().entity(commande.toString()).build();
	}

}
