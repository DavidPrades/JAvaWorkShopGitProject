package main.workshopgitproject.classes;

public class ClientAddress {
	/**
	 * Description of the property streetName.
	 */
	private String streetName;
	/**
	 * Description of the property country.
	 */
	private String country;
	/**
	 * Description of the property village.
	 */
	private String village;
	/**
	 * Description of the property identifier.
	 */
	private int identifier;
	/**
	 * Description of the property province.
	 */
	private String province;

	public ClientAddress(String streetName, String country, String village, int identifier, String province) {
		this.streetName = streetName;
		this.country = country;
		this.village = village;
		this.identifier = identifier;
		this.province = province;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}