package polytech.unice.fr.groupe_f.Interface;

import java.util.Collection;

import polytech.unice.fr.groupe_f.Client;

public interface RegisterClientsInterface {
	
	//public void create(String s,String adresse);
	
	public Client read(String name);
	
	public void  delete(String name);
	
	public void update(String name,String adress);
	
	public Collection<Client> getAvailableClients();

}
