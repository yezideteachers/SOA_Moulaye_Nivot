package polytech.unice.fr.groupe_f;

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

		JSONObject mainObj = new JSONObject();
		mainObj.put("employees", ja);
		Cart.AddCommande("yez", "tel");
		System.out.println(Cart.mapCart.get(Cart.id-1));

	}

}