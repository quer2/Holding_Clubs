/**
 * 
 */
package model;

import java.security.acl.Owner;
import java.util.ArrayList;

/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Holding {

	private String name;
	
	private Clubs clubs[];
	public Holding(String name, Clubs clubs[]) {
		this.name=name;
		this.clubs=clubs;
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
	public void generateClubList() {
		for(int i=0; i<clubs.size();i++) {
			for(int j=0;j<clubs.size() && i != j;j++) {
				if(clubs.get(i).getName().compareToIgnoreCase(clubs.get(j).getName())<0) {
					String aux = clubs.get(i).getName();
					clubs.get(i).getName()=club.get(j).getName;			
				}
			}
		}
		
	}

}
