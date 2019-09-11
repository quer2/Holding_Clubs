/**
 * 
 */
package model;
import java.util.ArrayList;
/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Clubs {

	//Attributes
	private String id;
	private String name;
	private String creationDate;
	private String type;
	private String variable;
	
	private Owner[] owners;
	
	public Clubs(String id, String name, String creationDate, String type) {
		this.id=id;
		this.name=name;
		this.creationDate=creationDate;
		this.type=type;
		owners = new Owner[10000];
	}
	
	

	@Override
	public String toString() {
		variable="Clubs [id=" + id + ", name=" + name + ", creationDate=" + creationDate + ", type=" + type + ", owners="
				+ owners + "]";
		return variable;
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
	public Owner[] getOwners() {
		return owners;
	}



	/**
	 * @param owners the owners to set
	 */
	public void setOwners(Owner[] owners) {
		this.owners = owners;
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
	 * @return the owners
	 */
	public String generateOwnerList() {
		String report="";
		for(int i=0; i<owners.length;i++) {
			for(int j=1;j<owners.length && i != j;j++) {
				if(owners[i].toString().compareToIgnoreCase(owners[j].toString())<0) {
					String aux = owners[i].toString();
					owners[i].settoString(owners[j].toString());
					owners[j].settoString(aux);
					}
				}
			}
		for(int i=0;i<10;i++) {
			report =owners[i].toString();
		}
		return report;
		}
}
