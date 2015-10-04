package polytech.unice.fr.groupe_f;

import java.util.Collection;
import java.util.HashMap;

public class RegisterClients{

	
private static HashMap<String, Client> stor = new HashMap<String, Client>();

public static void create(String name, String adress) {
	stor.put(name, new Client(name, adress));
	
}

public static Client read(String name) {
	return stor.get(name);
	
}

public static void delete(String name) {
	stor.remove(name);
	
}

public static void update(String name,String adress) {
	stor.get(name).setAdress(adress);
	
}

public static Collection<Client> getAvailableClients() {
	return stor.values();
}

static{
	RegisterClients.create("user1", "20");
	RegisterClients.create("user2", "02");
}	
	
}
