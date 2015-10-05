package polytech.unice.fr.groupe_f;

import java.util.Collection;
import java.util.HashMap;

public class RegisterClients{

	
private static HashMap<String, Client> stor = new HashMap<String, Client>();

public static void create(String name,String adress,String mail) {
	stor.put(name, new Client(name, adress, mail, 0));
	
}

public static Client read(String name) {
	return stor.get(name);
	
}

public static void delete(String name) {
	stor.remove(name);
	
}

public static void update(String name,String adress,String mail,int nbCommande) {
	stor.get(name).setAdress(adress);
	stor.get(name).setMail(mail);
	stor.get(name).setNbCommande(nbCommande);
	
}

public static Collection<Client> getAvailableClients() {
	return stor.values();
}

static{
	RegisterClients.create("user1", "01","mail1");
	RegisterClients.create("user2", "02","mail2");
	RegisterClients.create("user3", "03","mail3");
}	
	
}
