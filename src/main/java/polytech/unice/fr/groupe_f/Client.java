package polytech.unice.fr.groupe_f;

public class Client {

	private String name;
	private String adress;
	
	public Client(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", adress=" + adress + "]";
	}
	
	
}
