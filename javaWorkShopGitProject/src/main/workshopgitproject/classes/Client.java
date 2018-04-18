/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Client.
 * 
 * @author alu20908719v
 */
public class Client {
	/**
	 * Description of the property invoices.
	 */
	public HashSet<Invoice> invoices = new HashSet<Invoice>();

	/**
	 * Description of the property StreetNumber.
	 */
	private int StreetNumber = 0;

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property dni.
	 */
	private String dni = "";

	/**
	 * Description of the property surname.
	 */
	private String surname = "";

	private ClientAddress addressClient = new ClientAddress("", "", "", 0, "");

	

	// Start of user code (user defined attributes for Client)

	// End of user code

	/**
	 * The constructor.
	 */
	public Client() {
		// Start of user code constructor for Client)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Client)

	// End of user code
	/**
	 * Returns invoices.
	 * @return invoices 
	 */
	public HashSet<Invoice> getInvoices() {
		return this.invoices;
	}

	/**
	 * Returns streetName.
	 * @return streetName 
	 */
	public String getStreetName() {
		return this.addressClient.getStreetName();
	}

	/**
	 * Sets a value to attribute streetName. 
	 * @param newStreetName 
	 */
	public void setStreetName(String newStreetName) {
		this.addressClient.setStreetName(newStreetName);
	}

	/**
	 * Returns StreetNumber.
	 * @return StreetNumber 
	 */
	public int getStreetNumber() {
		return this.StreetNumber;
	}

	/**
	 * Sets a value to attribute StreetNumber. 
	 * @param newStreetNumber 
	 */
	public void setStreetNumber(int newStreetNumber) {
		this.StreetNumber = newStreetNumber;
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns country.
	 * @return country 
	 */
	public String getCountry() {
		return this.addressClient.getCountry();
	}

	/**
	 * Sets a value to attribute country. 
	 * @param newCountry 
	 */
	public void setCountry(String newCountry) {
		this.addressClient.setCountry(newCountry);
	}

	/**
	 * Returns dni.
	 * @return dni 
	 */
	public String getDni() {
		return this.dni;
	}

	/**
	 * Sets a value to attribute dni. 
	 * @param newDni 
	 */
	public void setDni(String newDni) {
		this.dni = newDni;
	}

	/**
	 * Returns village.
	 * @return village 
	 */
	public String getVillage() {
		return this.addressClient.getVillage();
	}

	/**
	 * Sets a value to attribute village. 
	 * @param newVillage 
	 */
	public void setVillage(String newVillage) {
		this.addressClient.setVillage(newVillage);
	}

	/**
	 * Returns identifier.
	 * @return identifier 
	 */
	public int getIdentifier() {
		return this.addressClient.getIdentifier();
	}

	/**
	 * Sets a value to attribute identifier. 
	 * @param newIdentifier 
	 */
	public void setIdentifier(int newIdentifier) {
		this.addressClient.setIdentifier(newIdentifier);
	}

	/**
	 * Returns surname.
	 * @return surname 
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Sets a value to attribute surname. 
	 * @param newSurname 
	 */
	public void setSurname(String newSurname) {
		this.surname = newSurname;
	}

	/**
	 * Returns province.
	 * @return province 
	 */
	public String getProvince() {
		return this.addressClient.getProvince();
	}

	/**
	 * Sets a value to attribute province. 
	 * @param newProvince 
	 */
	public void setProvince(String newProvince) {
		this.addressClient.setProvince(newProvince);
	}

}
