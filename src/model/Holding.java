/**
 * 
 */
package model;

import java.util.ArrayList;
import model.Clubs;
import model.Pet;
import model.Owner;
/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Holding {

	private String name;
	
	private Clubs[] clubs;
	private Owner[] owners;
	private Pet[] pets;
	
	private String [] copyClubs;
	private String [] copyOwners;
	private String [] copyPets;
	
	private Clubs c;
	
	
	public Holding(String name, Clubs[] clubs, Owner[] owners, Pet[] pets) {
		this.name=name;
		clubs = new Clubs[9];
		copyClubs = new String[9];
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
	public String generateClubList() {
		for(int i=0; i<clubs.length;i++) {
			for(int j=1;j<clubs.length && i != j;j++) {
				if(clubs[i].toString().compareToIgnoreCase(clubs[j].toString())<0) {
					String aux = clubs[i].toString();
					clubs[i].settoString(clubs[j].toString());
					clubs[j].settoString(aux);
				}
			}
		}
		String report=" ";
		for(int i=0;i<10;i++) {
			report =copyClubs[i];
		}
		return report;
	}
	public String generateOwnerList() {
		String msg="";
		msg=c.generateOwnerList();
		return msg;
		}
	
	public String generatePetsList() {
		String report="";
		for(int i=0; i<pets.length;i++) {
			for(int j=1;j<pets.length && i != j;j++) {
				if(pets[i].toString().compareToIgnoreCase(pets[j].toString())<0) {
					String aux = pets[i].toString();
					pets[i].settoString(pets[j].toString());
					pets[j].settoString(aux);
					}
				}
			}
		for(int i=0;i<10;i++) {
			report =copyPets[i];
		}
		return report;
		}
}
