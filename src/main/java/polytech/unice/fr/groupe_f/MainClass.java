package polytech.unice.fr.groupe_f;

import java.util.ArrayList;
import java.util.Collection;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "yezide";
		JSONObject jo = new JSONObject();
		jo.put("firstName", "John");
		jo.put("lastName", "Doe");
		jo.put("name", "kkk");

		JSONArray ja = new JSONArray();
		ja.put(jo);
		String [] st = {"kkl","hh"};

		
		
		Collection<Product> products = RegisterProducts.getAvailableProducts();
		ArrayList<String> list = new ArrayList<String>();
		for(Product c: products) {
		
			list.add(c.toString());
		}
		System.out.println(list);

	}

}
