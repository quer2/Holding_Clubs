/**
 * 
 */
package model;
import java.util.ArrayList;
import java.util.Comparator;
/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Clubs implements Comparator<Clubs>{

	//Attributes
	private String id;
	private String name;
	private String creationDate;
	private String type;
	private String variable;
	
	private ArrayList<Owner> owners;
	
	
	public Clubs(String id, String name, String creationDate, String type) {
		this.id=id;
		this.name=name;
		this.creationDate=creationDate;
		this.type=type;
		owners = new ArrayList<Owner>(999);
	}
	
	

	@Override
	public String toString() {
		variable="Clubs [id=" + id + ", name=" + name + ", creationDate=" + creationDate + ", type=" + type +"]";
		return variable;
	}
	/**
	 * @return the owners
	 */
	public ArrayList<Owner> getOwners() {
		return owners;
	}



	/**
	 * @param owners the owners to set
	 */
	public void setOwners(ArrayList<Owner> owners) {
		this.owners = owners;
	}



	public void settoString(String variable) {
		this.variable=variable;
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
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the owners
	 */
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
	public void addOwners(Owner  owner1){
		owners.add(owner1);
	}



	@Override
	public int compare(Clubs clubs1, Clubs clubs2) {
		int r;
		r= clubs1.getName().compareTo(clubs2.getName());
		if(r==0) {
			r=clubs1.getId().compareTo(clubs2.getId());
		}
		return r;
	}
}
