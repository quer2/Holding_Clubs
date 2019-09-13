/**
 * 
 */
package model;

import java.util.ArrayList;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import model.Clubs;
import model.Pet;
import sun.security.util.Length;
import model.Owner;
/**
 * @author CRISTHIAN CABEZAS
 *
 */
public class Holding {

	private String name;
	String[] arreglo = new String[9];
	String[] arregloOwner = new String[99];
	String[] arregloPet = new String[999];
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
			arreglo[i]=clubs.get(i).toString()+"\n";
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
		int j;
		int valor=0;
		for(int i=0; i<clubs.size();i++) {
			for(j=valor;j<clubs.get(i).getOwners().size() && clubs.get(i).getOwners().size()<10;j++) {
				valor++;
				arregloOwner[j]=clubs.get(i).getOwners().get(j).toString()+"\n";
			}
		}
		return  arregloOwner;
	}
	//-------------------------------------------------------------------
	//Burbuja
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
	
	//--------------------------------------------------------------------
	//Insercion
	public String ordenarOwnerporNombre() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			for(int j=0;j<arregloOwner.length;j++) {
				for(int f=1;f<arregloOwner.length;f++) {
					if(clubs.get(i).getOwners().get(j).getName().compareToIgnoreCase(clubs.get(i).getOwners().get(f).getName())<0) {
						int pos = j;
						String aux = arregloOwner[j];
						while((pos>0) && (arregloOwner[pos-1].compareTo(aux))>0) {
							arregloOwner[pos]=arregloOwner[pos-1];
							pos--;
						}
						arregloOwner[pos]=aux;
					}
				}	
			}
		}
		for(int g=0;g<arregloOwner[g].length();g++) {
			msg+=arregloOwner[g];
		}
		return msg;
	}
	
	//----------------------------------------------------------------------
	//Seleccion
	public String ordenarOwnerporApellido() {
		String msg="";
		int contador =1;
		for(int i=0;i<clubs.size();i++) {
			for(int j=0;j<arregloOwner.length;j++) {
				int min =j;
				for(int f=i+1;f<arregloOwner.length;f++) {
					contador++;
					if(clubs.get(i).getOwners().get(min).getSecondName().compareToIgnoreCase(clubs.get(i).getOwners().get(f).getSecondName())<0) {
						min=f;
					}
					if(j!=min) {
						String aux = arregloOwner[j];
						arregloOwner[j]=arregloOwner[min];
						arregloOwner[min]=aux;
					}
				}	
			}
		}
		for(int g=0;g<arregloOwner[g].length();g++) {
			msg+=arregloOwner[g];
		}
		return msg;
	}
	
	//---------------------------------------------------------------------------
	
	public String ordenarCantidadMascotas() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			for(int j=0;j<arregloOwner.length;j++) {
				for(int f=1;f<arregloOwner.length;f++) {
					if(clubs.get(i).getOwners().get(j).getPets().size()<clubs.get(i).getOwners().get(f).getPets().size()) {
						String aux=arregloOwner[j];
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
	
	//-------------------------------------------------------------------------------
	public String ordenarOwnerporFecha() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			for(int j=0;j<arregloOwner.length;j++) {
				for(int f=1;f<arregloOwner.length;f++) {
					if(clubs.get(i).getOwners().get(j).getDate().compareToIgnoreCase(clubs.get(i).getOwners().get(f).getDate())<0) {
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
	
	//-------------------------------------------------------------------------------
	
	public String ordenarPetporId() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			for(int h=0;h<clubs.get(i).getOwners().size();h++) {
				for(int j=0;j<arregloPet.length;j++) {
					for(int f=1;f<arregloPet.length;f++) {
						if(clubs.get(i).getOwners().get(h).getPets().get(j).getId().compareToIgnoreCase(clubs.get(i).getOwners().get(h).getPets().get(f).getId())<0) {
							String aux = arregloPet[j];
							arregloPet[j]=arregloPet[f];
							arregloPet[f]=aux;
						}
					}	
				}
			}
		}
		for(int g=0;g<arregloPet[g].length();g++) {
			msg+=arregloPet[g];
		}
		return msg;
	}
	
	//--------------------------------------------------------------------------------

	public String[] recolectarToStringPets() {
		int f;
		int valor=0;
		for(int i=0;i<clubs.size();i++) {
			for(int h=0;h<clubs.get(i).getOwners().size();h++) {
				for( f=valor;f<clubs.get(i).getOwners().get(h).getPets().size() && clubs.get(i).getOwners().get(h).getPets().size()<10;f++) {
					valor++;
					arregloPet[f]=clubs.get(i).getOwners().get(h).getPets().toString();			
				}
			}
		}
		return  arregloPet;
	}
	
	//----------------------------------------------------------------------------------
	
	public String ordenarPetporNombre() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			for(int h=0;h<clubs.get(i).getOwners().size();h++) {
				for(int j=0;j<arregloPet.length;j++) {
					for(int f=1;f<arregloPet.length;f++) {
						if(clubs.get(i).getOwners().get(h).getPets().get(j).getName().compareToIgnoreCase(clubs.get(i).getOwners().get(h).getPets().get(f).getName())<0) {
							String aux = arregloPet[j];
							arregloPet[j]=arregloPet[f];
							arregloPet[f]=aux;
						}
					}	
				}
			}
		}
		for(int g=0;g<arregloPet[g].length();g++) {
			msg+=arregloPet[g];
		}
		return msg;
	}
	
	//------------------------------------------------------------------------------------
	public String ordenarPetporfecha() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			for(int h=0;h<clubs.get(i).getOwners().size();h++) {
				for(int j=0;j<arregloPet.length;j++) {
					for(int f=1;f<arregloPet.length;f++) {
						if(clubs.get(i).getOwners().get(h).getPets().get(j).getDate().compareToIgnoreCase(clubs.get(i).getOwners().get(h).getPets().get(f).getDate())<0) {
							String aux = arregloPet[j];
							arregloPet[j]=arregloPet[f];
							arregloPet[f]=aux;
						}
					}	
				}
			}
		}
		for(int g=0;g<arregloPet[g].length();g++) {
			msg+=arregloPet[g];
		}
		return msg;
	}
	
	//----------------------------------------------------------------------------------
	
	public String ordenarCantidadDueños() {
		String msg="";
		for(int i=0;i<clubs.size();i++) {
			if(clubs.get(i).getOwners().size()<clubs.get(i+1).getOwners().size()) {
				String aux=arreglo[i];
				arreglo[i]=arreglo[i+1];
				arreglo[i+1]=aux;
			}
		}	
		for(int g=0;g<arreglo[g].length();g++) {
			msg+=arreglo[g];
		}
		return msg;
	}
	
	//-----------------------------------------------------------------------------------
	
	public Owner buscarxOwner(String id) {
		Owner obj=null;
		for(int i=0;i<clubs.size();i++) {
			for(int j=0;j<clubs.get(i).getOwners().size();j++)
			if(clubs.get(i).getOwners().get(j).getId().equalsIgnoreCase(id)) {
				obj=clubs.get(i).getOwners().get(j);
			}
		}
		return obj;
	}
	
	//-------------------------------------------------------------------------------------
	
	public String ingresarOwner(String Id, String nombre, String apellido, String fecha, String tipo) {
		String msg="";
		Owner objOwner=buscarxOwner(Id);
		if(objOwner==null) {
			for(int i=0; i<clubs.size();i++) {
				for(int j=0; j<clubs.get(i).getOwners().size();j++)
					clubs.get(i).addOwners(Id,nombre,apellido,fecha,tipo);
					msg="Ha sido agregado";
			}
		}else {
			msg="Hay un owner ya existente";
		}
		return msg;
	}
	
	//-----------------------------------------------------------------------------------
	
		public Clubs buscarxClub(String id) {
			Clubs obj=null;
			for(int i=0;i<clubs.size();i++) {
				if(clubs.get(i).getId().equalsIgnoreCase(id)) {
					obj=clubs.get(i);
				}
			}
			return obj;
		}
		
		//-------------------------------------------------------------------------------------
		
		public String ingresarClub(String Id, String nombre, String fecha, String tipo) {
			String msg="";
			Clubs objOwner=buscarxClub(Id);
			if(objOwner==null) {
				for(int i=0; i<clubs.size();i++) {
					Clubs clubs1 = new Clubs(Id, nombre, fecha, tipo);
						clubs.add(clubs1);
						msg="Ha sido agregado";
				}
			}else {
				msg="Hay un owner ya existente";
			}
			return msg;
		}
		
		//-----------------------------------------------------------------------------------
		
		public Pet buscarxPet(String id) {
			Pet obj=null;
			for(int i=0;i<clubs.size();i++) {
				for(int j=0;j<clubs.get(i).getOwners().size();j++) {
					for(int f=0;f<clubs.get(i).getOwners().get(j).getPets().size();f++) {
						if(clubs.get(i).getOwners().get(j).getId().equalsIgnoreCase(id)) {
							obj=clubs.get(i).getOwners().get(j).getPets().get(f);
						}
					}
				}
			}
			return obj;
		}
		
		//-------------------------------------------------------------------------------------
		
		public String ingresarPet(String Id, String nombre, String fecha, String genero, String tipo) {
			String msg="";
			Pet objPet=buscarxPet(Id);
			if(objPet==null) {
				for(int i=0; i<clubs.size();i++) {
					for(int j=0; j<clubs.get(i).getOwners().size();j++)
						for(int f=0;f<clubs.get(i).getOwners().get(j).getPets().size();f++) {
							Pet pets1 = new Pet(Id, nombre, fecha, genero, tipo);
							clubs.get(i).getOwners().get(j).getPets().add(pets1);
							msg="Ha sido agregado";
						}
					}
				}else {
				msg="Hay un owner ya existente";
			}
			return msg;
		}
	
	
	
	
	
	
	
}
