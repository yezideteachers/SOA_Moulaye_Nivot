package polytech.unice.fr.groupe_f;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Cart {

	private String nameClient;
	private int idProduct;
	private int idPanier;
	public static Integer id=0;
	
	public static HashMap<Integer, Cart> mapCart = new HashMap<Integer, Cart>();
	
	
	public Cart(int idProduct) {
		this.idProduct=idProduct;
		this.idPanier=id;
		
		
	}
	public static void create(int idProduct){
		mapCart.put(idProduct, new Cart(idProduct));
		id+=1;
	}
	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdPanier() {
		return idPanier;
	}

	@Override
	public String toString() {
		return ", idPanier : " + idPanier +
				", idProduct : " + idProduct;
	}
	
	static{
		Cart.create(2);
		Cart.create(1);
	}

	
}
