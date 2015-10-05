package polytech.unice.fr.groupe_f;

import java.util.Collection;
import java.util.HashMap;

public class RegisterProducts {
	
	public static HashMap<String, Product> col = new HashMap<String, Product>();

	public static void create(String name, TYPE type, String color,
			double price, int size) {
		col.put(name, new Product(10, size, type, name, color, price));

	}

	public static Product read(String name) {
		return col.get(name);

	}

	public static void delete(String name) {
		col.remove(name);

	}


	public static void update(String name, TYPE type, String color) {
		col.get(name).setType(type);
		col.get(name).setColor(color);
		
		
	}
	
	public static Collection<Product> getAvailableProducts() {
		return col.values();
	}
	
	static
	{
		RegisterProducts.create("chaise", TYPE.CHAISE, "blue", 24.99, 12);
		RegisterProducts.create("porte", TYPE.PORTE, "red", 84.99, 25);
		RegisterProducts.create("placard", TYPE.PLACARD, "black", 254.0, 82);
		RegisterProducts.create("chaise2", TYPE.CHAISE, "green", 54.99, 22);
		RegisterProducts.create("bureau", TYPE.BUREAU, "white", 854.99, 65);
		RegisterProducts.create("lit", TYPE.LIT, "yellow", 244.99, 72);
	}

}
