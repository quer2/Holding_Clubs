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
	private Clubs[] clubs2;
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
	/**
	 * @return the clubs2
	 */
	public Clubs[] getClubs2() {
		return clubs2;
	}
	/**
	 * @param clubs2 the clubs2 to set
	 */
	public void setClubs2(Clubs[] clubs2) {
		this.clubs2 = clubs2;
	}
	public Holding(String name) {
		this.name=name;
		clubs = new ArrayList<Clubs>();
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
	
}
