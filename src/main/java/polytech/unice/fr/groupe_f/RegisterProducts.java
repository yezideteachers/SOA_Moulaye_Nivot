package polytech.unice.fr.groupe_f;

import java.util.Collection;
import java.util.HashMap;

public class RegisterProducts {
	
	public static HashMap<Integer, Product> col = new HashMap<Integer, Product>();

	public static void create(String name, int quantity, TYPE type, COLOR color,
			double price,WOOD wood) {
			Product pr = new Product(quantity, type, name, color, price, wood);
		col.put(pr.getId(),pr);
		Product.IdAtuIncr+=1;

	}

	public static Product read(int id) {
		return col.get(id);

	}

	public static void delete(int id) {
		col.remove(id);

	}


	public static void update(int id, TYPE type, COLOR color) {
		col.get(id).setType(type.toString());
		col.get(id).setColor(color.toString());
		
		
	}
	
	public static Collection<Product> getAvailableProducts() {
		return col.values();
	}
	
	static
	{
		RegisterProducts.create("chaise", 10,TYPE.CHAIR, COLOR.BLACK, 24.99, WOOD.ACACIA);
		RegisterProducts.create("porte", 20,TYPE.DOOR, COLOR.BLACK, 244.99, WOOD.ACACIA);
		RegisterProducts.create("bureau", 30,TYPE.DESKTOP, COLOR.BLACK, 444.99, WOOD.ACACIA);
	/*	RegisterProducts.create("porte", TYPE.DESKTOP, "red", 84.99, 25);
		RegisterProducts.create("placard", TYPE.CUPBOARD, "black", 254.0, 82);
		RegisterProducts.create("chaise2", TYPE.CHAIR, "green", 54.99, 22);
		RegisterProducts.create("bureau", TYPE.DESKTOP, "white", 854.99, 65);
		RegisterProducts.create("lit", TYPE.BED, "yellow", 244.99, 72);*/
	}

}
