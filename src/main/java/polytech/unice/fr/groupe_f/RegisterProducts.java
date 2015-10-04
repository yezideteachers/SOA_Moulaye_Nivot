package polytech.unice.fr.groupe_f;

import java.util.Collection;
import java.util.HashMap;

public class RegisterProducts {
	
	public static HashMap<String, Product> col = new HashMap<String, Product>();

	public static void create(int id, String name, TYPE type, String color,
			double price, int size) {
		col.put(name, new Product(id, 1, size, type, name, color, price));

	}

	public static Product read(String name) {
		return col.get(name);

	}

	public static void delete(String name) {
		col.remove(name);

	}


	public static void update(String name, TYPE type, String color, int size) {
		col.get(name).setType(type);
		col.get(name).setColor(color);
		col.get(name).setSize(size);
		
	}
	
	public static Collection<Product> getAvailableProducts() {
		return col.values();
	}
	
	static
	{
		RegisterProducts.create(1, "chaise", TYPE.CHAISE, "blue", 24.99, 12);
		RegisterProducts.create(1, "porte", TYPE.PORTE, "red", 84.99, 25);
		RegisterProducts.create(1, "placard", TYPE.PLACARD, "black", 254.0, 82);
		RegisterProducts.create(1, "chaise2", TYPE.CHAISE, "green", 54.99, 22);
		RegisterProducts.create(1, "bureau", TYPE.BUREAU, "white", 854.99, 65);
		RegisterProducts.create(1, "lit", TYPE.LIT, "yellow", 244.99, 72);
	}

}
