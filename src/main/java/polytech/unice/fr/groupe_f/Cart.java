package polytech.unice.fr.groupe_f;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Cart {

	private String nameClient;
	private String nameProduct;
	public static Integer id=0;
	
	public static HashMap<Integer, ArrayList> mapCart = new HashMap<Integer, ArrayList>();
	//public static HashMap<String, Product> mapClient = new HashMap<String, Product>();
	
	
	public Cart(String nameClient, String nameProduct) {
		this.nameClient = nameClient;
		this.nameProduct = nameProduct;
		
	}




	public static void AddCommande(String nameClient,String nameProduct){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(nameClient);al.add(nameProduct);
		mapCart.put(id,al);
		id++;
	}
	
	public static HashMap<Integer, ArrayList> sendCommandes(){
		return mapCart;
	}
	
	static{
		Cart.AddCommande("yezide", "tel");
		Cart.AddCommande("yez", "port");
	}
}
