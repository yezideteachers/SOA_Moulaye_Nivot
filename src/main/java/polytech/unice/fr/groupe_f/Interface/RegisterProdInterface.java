package polytech.unice.fr.groupe_f.Interface;


import polytech.unice.fr.groupe_f.Client;
import polytech.unice.fr.groupe_f.Product;
import polytech.unice.fr.groupe_f.TYPE;


public interface RegisterProdInterface {
	
	//public void create(int id,String name,TYPE type,String color,double price,int size);
	
	public void read(String name);
	
	public void  delete(String name);
	
	public void update(String name,TYPE type,String color,int size);
}
