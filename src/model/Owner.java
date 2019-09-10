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
	
	//arraylist
	private ArrayList<Pet>pets;
	
	public Owner(String id, String name, String secondName, String date, String type) {
		this.id=id;
		this.name=name;
		this.secondName=secondName;
		this.date=date;
		this.type=type;
		pets = new ArrayList<Pet>();
	}
	
	public void addPet(String name, String type, String date, int id, char gender) {
		pets.add(new Pet(name, type, date, id, gender));
	}
	

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", secondName=" + secondName + ", date=" + date + ", type=" + type
				+ ", pets=" + pets + "]";
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
	public ArrayList<Pet> getPets() {
		return pets;
	}

	/**
	 * @param pets the pets to set
	 */
	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}
}
