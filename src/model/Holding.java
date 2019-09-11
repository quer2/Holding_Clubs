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
	private String [] copyClubs;
	private String [] copyOwners;
	private String [] copyPets;
	private Owner owner;
	
	public Holding(String name) {
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
				if(clubs[i].getName().compareToIgnoreCase(clubs[j].getName())<0) {
					String aux = clubs[i].getName();
					copyClubs[i]=clubs[j].getName();
					clubs[j].setName(aux);
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
		String report="";
		for(int i=0; i<owner.;i++) {
			for(int j=1;j<clubs.length && i != j;j++) {
				if(clubs[i].getName().compareToIgnoreCase(clubs[j].getName())<0) {
					String aux = clubs[i].getName();
					copyOwners[i]=clubs[j].getName();
					clubs[j].setName(aux);
					}
				}
			}
		for(int i=0;i<10;i++) {
			report =copyOwners[i];
		}
		return report;
		}
	public String generatePetsList() {
		String report="";
		for(int i=0; i<clubs.length;i++) {
			for(int j=1;j<clubs.length && i != j;j++) {
				if(clubs[i].getName().compareToIgnoreCase(clubs[j].getName())<0) {
					String aux = clubs[i].getName();
					copyPets[i]=clubs[j].getName();
					clubs[j].setName(aux);
					}
				}
			}
		for(int i=0;i<10;i++) {
			report =copyPets[i];
		}
		return report;
		}
}
