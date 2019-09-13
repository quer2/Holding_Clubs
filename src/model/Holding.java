/**
 * 
 */
package model;

import java.util.ArrayList;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import model.Clubs;
import model.Pet;
import model.Owner;
/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Holding {

	private String name;
	String[] arreglo = new String[9];
	String[] arregloOwner = new String[99];
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
	
	//---------------------------------------------------------
	public void ordenarClubsporId() {
		for(int i=0;i<recolectarToString().length;i++) {
			for(int j=1;j<recolectarToString().length;j++) {
				if(clubs.get(i).getId().compareToIgnoreCase(clubs.get(i).getId())<0) {
					String aux = arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
					
				}
			}
		}
	}
	
	//------------------------------------------------------------
	public String[] recolectarToString() {
		for(int i=0; i<clubs.size();i++) {
			arreglo[i]=clubs.get(i).toString();
		}
		return  arreglo;
	}
//------------------------------------------------------------------
	
	public String ordenarClubsporNombre() {
		String msg="";
		for(int i=0;i<recolectarToString().length;i++) {
			for(int j=1;j<recolectarToString().length;j++) {
				if(clubs.get(i).getName().compareToIgnoreCase(clubs.get(i).getName())<0) {
					String aux = arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
				}
			}
		}
		for(int g=0;g<arreglo[g].length();g++) {
			msg=arreglo[g];
		}
		return msg;
	}
	//----------------------------------------------------------------
	public String ordenarClubsporFecha() {
		String msg="";
		for(int i=0;i<recolectarToString().length;i++) {
			for(int j=1;j<recolectarToString().length;j++) {
				if(clubs.get(i).getCreationDate().compareToIgnoreCase(clubs.get(i).getCreationDate())<0) {
					String aux = arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
				}
			}
		}
		for(int g=0;g<arreglo[g].length();g++) {
			msg+=arreglo[g];
		}
		return msg;
	}
	//------------------------------------------------------------------
	
	public String[] recolectarToStringOwner() {
		for(int i=0; i<clubs.size();i++) {
			arregloOwner[i]=clubs.get(i).getOwners().get(i).toString();
		}
		return  arregloOwner;
	}
	//-------------------------------------------------------------------
	public String ordenarOwnerporId() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			for(int j=0;j<arregloOwner.length;j++) {
				for(int f=1;f<arregloOwner.length;f++) {
					if(clubs.get(i).getOwners().get(j).getId().compareToIgnoreCase(clubs.get(i).getOwners().get(f).getId())<0) {
						String aux = arregloOwner[j];
						arregloOwner[j]=arregloOwner[f];
						arregloOwner[f]=aux;
					}
				}	
			}
		}
		for(int g=0;g<arregloOwner[g].length();g++) {
			msg+=arregloOwner[g];
		}
		return msg;
	}
	
	
	
	
}
