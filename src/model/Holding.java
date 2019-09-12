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
	
	private ArrayList<Clubs> clubs;
	
	public Holding(String name) {
		this.name=name;
		clubs = new ArrayList<Clubs>(9);
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
	 * @return the clubs
	 */
	/**
	 * @return the clubs
	 */
	public ArrayList<Clubs> getClubs() {
		return clubs;
	}
	/**
	 * @param clubs the clubs to set
	 */
	public void setClubs(ArrayList<Clubs> clubs) {
		this.clubs = clubs;
	}
	public void addClubs(Clubs  clubs1){
		clubs.add(clubs1);
	}
}
