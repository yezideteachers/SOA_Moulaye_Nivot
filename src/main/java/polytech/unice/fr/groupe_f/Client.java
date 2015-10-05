package polytech.unice.fr.groupe_f;

public class Client {

	// Fields
	private static int id=0;
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private String address;
	private int postalCode;
	private String town;
	private String country;
	private String mail;
	private int phone;
	private int nbCommande;
	
	// Constructor
	public Client(String firstName, String lastName, int birthyear, String address, 
			int postalCode, String town, String country, String mail, int phone,  int nbCommande) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthyear;
		this.address = address;
		this.postalCode = postalCode;
		this.town = town;
		this.country = country;
		this.mail = mail;
		this.phone = phone;
		this.nbCommande = nbCommande;
	}
	
	// Constructor test
	public Client(String firstName, String address, String mail) {
		this.firstName = firstName;
		this.address = address;
		this.mail = mail;
	}
	
	// Getters & Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getBrithYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getNbCommande() {
		return nbCommande;
	}

	public void setNbCommande(int nbCommande) {
		this.nbCommande = nbCommande;
	}
	
	// toString
	@Override
	public String toString() {
		return "Client [name=" + name + ", adress=" + adress + ", mail="
				+ mail + ", numberOfCommande=" + nbCommande + "]";
	}
}
