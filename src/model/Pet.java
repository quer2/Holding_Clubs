/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Pet implements Serializable {
	//attributes
	public static final String CAT = "cat";
	public static final String DOG = "dog";
	public static final String BIRD = "bird";
	public static final String OTHER = "other";
	
	private String name;
	private String type;
	private String date;
	private int id;
	private char gender;
	private String variable;

	public Pet(String name, String type, String date, int id, char gender) {
		this.name=name;
		this.type=type;
		this.date=date;
		this.id=id;
		this.gender=gender;
		
	}
	
	public String fullReport() {
		String report= "";
		report+="Name: "+ id +"\n";
		report+="Type: "+name+"\n";
		report+="Age: "+type +"\n";
		report+="Weight"+date+"\n";
		report+="height"+gender+"\n";
		
		return report;	
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		variable="Pet [name=" + name + ", type=" + type + ", date=" + date + ", id=" + id + ", gender=" + gender + "]";
		return variable;
	}

	public void settoString(String variable) {
		this.variable=variable;
		
	}

	
	
}
