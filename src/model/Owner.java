/**
 * 
 */
package model;
import java.util.ArrayList;
/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Owner {
	
	//Atributes 
	private String id;
	private String name;
	private String secondName;
	private String date;
	private String type;
	private String variable;
	
	//arraylist
	private Pet[] pets;
	private String[] reports;
	
	public Owner(String id, String name, String secondName, String date, String type) {
		this.id=id;
		this.name=name;
		this.secondName=secondName;
		this.date=date;
		this.type=type;
		pets = new Pet[1000];
		}
	

	

	@Override
	public String toString() {
		variable= "Owner [id=" + id + ", name=" + name + ", secondName=" + secondName + ", date=" + date + ", type=" + type
				+ ", pets=" + pets + "]";
		return variable;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the pets
	 */
	public Pet[] getPets() {
		return pets;
	}
	/**
	 * @param pets the pets to set
	 */
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}




	public void settoString(String variable) {
		this.variable=variable;
		
	}

	/**
	 * @return the pets
	 */
	public String ordenarlist() {
		
		return null;
	}
	public String[] generatePetsList() {
		reports = null;
		for(int i=0;i<10;i++) {
			reports[i] =pets[i].toString()+"\n";
		}
		return reports;
		 }
}
