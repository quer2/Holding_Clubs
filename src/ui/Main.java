/**
 * 
 */
package ui;

/**
 * @author CRISTHIAN CABEZAS
 *
 */
import java.util.Scanner;
import java.util.Vector;

import com.sun.javafx.geom.AreaOp.AddOp;

import model.Clubs;
import model.Holding;
import model.Owner;
import model.Pet;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Main {

	private Holding holding;
	private Scanner scanner;
	private Clubs clubs;
	private Owner owner;
	private Pet petsPet;
	
	public Main() throws IOException {
		init();
	}
	public void init() throws IOException {
		scanner = new Scanner(System.in);
		holding = new Holding("Priece");
		
		//-----------------------------------------------------------------------------
		String msg="";
		try {
			FileReader fr = new FileReader("C:\\Users\\broly\\Desktop\\Laboratorio2\\text\\clubs");
			BufferedReader br = new BufferedReader(fr);
				
				for(int i=0;i<10;i++) {
					msg="";
					msg= br.readLine();
					String x="";
					x=msg;
					String []arreglo = x.split(",");
					holding.getClubs().get(i).setId(arreglo[0]);
					holding.getClubs().get(i).setName(arreglo[1]);
					holding.getClubs().get(i).setCreationDate(arreglo[2]);
					holding.getClubs().get(i).setType(arreglo[3]);
				}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		//----------------------------------------------------------------------------
		//public Owner(String id, String name, String secondName, String date, String type) {
			
		//Seriealizable Owners
		String msgOwner="";
		try {
			FileReader frReader = new FileReader("C:\\Users\\broly\\Desktop\\Laboratorio2\\text\\owners");
			BufferedReader brReader = new BufferedReader(frReader);
				for(int i=0;i<holding.getClubs().size();i++) {
					for(int j=0; j<100;j++) {
						msgOwner="";
						msgOwner= brReader.readLine();
						String xx="";
						xx=msgOwner;
						String []arregloO = xx.split(",");
						holding.getClubs().get(i).getOwners().get(j).setId(arregloO[0]);
						holding.getClubs().get(i).getOwners().get(j).setName(arregloO[1]);
						holding.getClubs().get(i).getOwners().get(j).setSecondName(arregloO[2]);
						holding.getClubs().get(i).getOwners().get(j).setDate(arregloO[3]);
						holding.getClubs().get(i).getOwners().get(j).setType(arregloO[4]);
					}
				}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try (ObjectOutputStream cos = new ObjectOutputStream(new FileOutputStream("\"C:\\Users\\broly\\Desktop\\Laboratorio2\\text\\serielizableOwners.ddr"))){
			for(int i=0;i<100;i++) {
				cos.writeObject(holding.getClubs().get(i).toString());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		//----------------------------------------------------------------------------
		//Seriealizable Pets
		String msgPets="";
		try {
			FileReader frReader2 = new FileReader("C:\\Users\\broly\\Desktop\\Laboratorio2\\text\\pets");
			BufferedReader brReader2 = new BufferedReader(frReader2);
				for(int i=0;i<holding.getClubs().size();i++) {
					for(int j=0; j<100;j++) {
						for(int f=0;f<1000 && holding.getClubs().get(i).getOwners().size()<100;f++) {
							msgPets="";
							msgPets= brReader2.readLine();
							String xxx="";
							xxx=msgOwner;
							String []arregloO0 = xxx.split(",");
							holding.getClubs().get(i).getOwners().get(j).getPets().get(f).setId(arregloO0[0]);
							holding.getClubs().get(i).getOwners().get(j).getPets().get(f).setName(arregloO0[1]);
							holding.getClubs().get(i).getOwners().get(j).getPets().get(f).setDate(arregloO0[2]);
							holding.getClubs().get(i).getOwners().get(j).getPets().get(f).setGender(arregloO0[3]);
							holding.getClubs().get(i).getOwners().get(j).getPets().get(f).setType(arregloO0[4]);
							
						}
					}
				}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try (ObjectOutputStream cosi = new ObjectOutputStream(new FileOutputStream("\"C:\\Users\\broly\\Desktop\\Laboratorio2\\text\\serielizablePets.ddr"))){
			for(int i=0;i<100;i++) {
				for(int j=0;j<1000&& holding.getClubs().get(i).getOwners().size()<100;j++)
				cosi.writeObject(holding.getClubs().get(i).getOwners().get(j));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	
	}
	public static void main(String[] args) {
		Main main = null;
		try {
			main = new Main();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		main.setUp();
		main.run();
	}
	public void setUp() {	
		//Leer archivo plano y serializado holding.setUp();
	}
	
	public int askInt(String prompt) {
		boolean asking = true;
		int rValue = 0;
		
		while(asking) {
			System.out.println(prompt);
			String str = scanner.nextLine();
			try {
				rValue = Integer.parseInt(str);
				asking = false;
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Please enter a number.");
			}

		}
		
		return rValue;
	}
	public double askDouble(String prompt) {
		boolean asking = true;
		double rValue = 0;
		
		while(asking) {
			System.out.println(prompt);
			String str = scanner.nextLine();
			try {
				rValue = Double.parseDouble(str);
				asking = false;
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Please enter a number.");
			}

		}
		
		return rValue;
	}
	
	public void run() {
		
		System.out.println("|| Welcome to"+ holding.getName()+" ||");
		
		boolean running = true;
		boolean asking = false;
		
		while(running) {
			System.out.println("||||||||||||||||||||||||||");
			System.out.println("||||||||||||||||||||||||||");
			System.out.println("\n Please pick an option: ");
			System.out.println("1. Generar listado de los clubes ordenados");
			System.out.println("2. Generar listado de los dueños ordenados");
			System.out.println("3. Generar listado de las mascotas ordenados");
			System.out.println("4. Generar listado de dueños de acuerdo a cantidad de mascotas");
			System.out.println("5. Generar listado de los clubes ordenado de acuerdo al numero de dueños");
			System.out.println("6. Buscar club de forma tradicional y binaria");
			System.out.println("7. Buscar dueño de forma tradicional y binaria");
			System.out.println("8.  Buscar mascota de forma tradicional y binaria");
			System.out.println("9. Registrar club");
			System.out.println("10. Registrar dueño");
			System.out.println("11. Registrar mascota");
			System.out.println("12. Eliminar club");
			System.out.println("13. Eliminar dueño");
			System.out.println("14. Eliminar mascota");
			System.out.println("15. Salir");
			System.out.println("||||||||||||||||||||||||||");
			System.out.println("||||||||||||||||||||||||||");
			
			String index = scanner.nextLine();
			int indexNum=0;
			
			try {
				indexNum = Integer.parseInt(index);
			} catch (NumberFormatException e) {
				System.out.println("Ingrese un valor valido");
			}
			String msg4;
			switch (indexNum) {
			
			case 1:
				String[] msg1;
				System.out.println("||||||||||||||||||||||||||");
				System.out.println("\n Please pick an option: ");
				System.out.println("1. Ordenar por Id");
				System.out.println("2. Ordenar por nombres");
				System.out.println("3. Ordenar por Fecha");
				String opcion1 = scanner.nextLine();
				int opcion1int =0;
				try {
					opcion1int = Integer.parseInt(opcion1);
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un valor valido");
				}
				switch (opcion1int) {
				case 1:
					msg4="";
					msg1=holding.recolectarToString();
					msg4=holding.ordenarClubsporId(msg1);
					System.out.println(msg4);
					break;
					
				case 2:
					msg4="";
					msg1=holding.recolectarToString();
					msg4=holding.ordenarClubsporNombre(msg1);
					System.out.println(msg4);
					break;
					
				case 3:
					msg4="";
					msg1=holding.recolectarToString();
					msg4=holding.ordenarClubsporFecha(msg1);
					System.out.println(msg4);
					break;
				default:
					break;
				}
				break;
				
			case 2:
				String[] msg2;
				System.out.println("||||||||||||||||||||||||||");
				System.out.println("\n Please pick an option: ");
				System.out.println("1. Ordenar por Id");
				System.out.println("2. Ordenar por Apellido");
				System.out.println("3. Ordenar por Nombre");
				System.out.println("2. Ordenar por Fecha");
				String opcion2 = scanner.nextLine();
				int opcion1int2 =0;
				try {
					opcion1int2 = Integer.parseInt(opcion2);
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un valor valido");
				}
				switch (opcion1int2) {
					case 1:
						msg4="";
						msg2=holding.recolectarToStringOwner();
						msg4=holding.ordenarOwnerporId(msg2);
						System.out.println(msg4);
						break;
					
					case 2:
						msg4="";
						msg2=holding.recolectarToStringOwner();
						msg4=holding.ordenarOwnerporApellido(msg2);
						System.out.println(msg4);
						break;
					
					case 3:
						msg4="";
						msg2=holding.recolectarToStringOwner();
						msg4=holding.ordenarOwnerporNombre(msg2);	
						System.out.println(msg4);
						break;
					case 4:
						msg4="";
						msg2=holding.recolectarToStringOwner();
						msg4=holding.ordenarOwnerporFecha(msg2);
						System.out.println(msg4);
						break;
					default:
						break;
				}
			case 3:
				String[] msg3;
				System.out.println("||||||||||||||||||||||||||");
				System.out.println("\n Please pick an option: ");
				System.out.println("1. Ordenar por Id");
				System.out.println("3. Ordenar por Nombre");
				System.out.println("2. Ordenar por Fecha");
				String opcion3 = scanner.nextLine();
				int opcion1int3 =0;
				try {
					opcion1int3 = Integer.parseInt(opcion3);
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un valor valido");
				}
				switch (opcion1int3) {
					case 1:
						msg4="";
						msg3=holding.recolectarToStringPets();
						msg4=holding.ordenarPetporId(msg3);
						System.out.println(msg4);
						break;
					
					case 2:
						msg4="";
						msg3=holding.recolectarToStringPets();
						msg4=holding.ordenarPetporNombre(msg3);
						System.out.println(msg4);
						break;
					
					case 3:
						msg4="";
						msg3=holding.recolectarToStringPets();
						msg4=holding.ordenarPetporfecha(msg3);
						System.out.println(msg4);
						break;
					default:
						break;
				}
			break;
			
			case 4:
				msg4="";
				msg4=holding.ordenarCantidadMascotas();
				System.out.println(msg4);
			break;
			
			case 5:
				msg4="";
				msg4=holding.ordenarCantidadDueños();
				System.out.println(msg4);
				break;
				
			case 6:
				msg4="";
				String[] listaClub;
				listaClub=holding.recolectarToString();
				System.out.println("digite Id");
				String Id = scanner.nextLine();
				msg4=holding.buscarxClubBinaries(listaClub, Id);
				break;
				
			case 7:	
				msg4="";
				String[] listaOwner;
				listaOwner=holding.recolectarToStringOwner();
				System.out.println("digite Id");
				String Id1 = scanner.nextLine();
				msg4=holding.buscarxOwnerBinaries(listaOwner, Id1);
				break;
				
			case 8:
				msg4="";
				String[] listaPet;
				listaPet=holding.recolectarToStringPets();
				System.out.println("digite Id");
				String Id2 = scanner.nextLine();
				msg4=holding.buscarxOwnerBinaries(listaPet, Id2);
				break;
				
			case 9:
				msg4="";
				System.out.println("digite Id");
				String idC = scanner.nextLine();
				
				System.out.println("digite nombre");
				String nombreC = scanner.nextLine();
				
				System.out.println("digite fecha de nacimiento");
				String fechaC = scanner.nextLine();
				
				System.out.println("digite tipo de animales");
				String tipoC = scanner.nextLine();
				msg4= holding.ingresarClub(idC, nombreC, fechaC, tipoC);
				System.out.println(msg4);
				break;
				
			case 10:
				msg4="";
				System.out.println("digite Id");
				String idO = scanner.nextLine();
				
				System.out.println("digite nombre");
				String nombreO = scanner.nextLine();
				
				System.out.println("digite apellido");
				String apellidoO = scanner.nextLine();
				
				System.out.println("digite fecha de nacimiento");
				String fechaO = scanner.nextLine();
				
				System.out.println("digite animal favorito");
				String tipoO = scanner.nextLine();
				msg4= holding.ingresarOwner(idO, nombreO, apellidoO, fechaO, tipoO);
				System.out.println(msg4);
				break;
				
			case 11:
				msg4="";
				System.out.println("digite Id");
				String idM = scanner.nextLine();
				
				System.out.println("digite nombre");
				String nombreM = scanner.nextLine();
				
				System.out.println("digite apellido");
				String fechaM = scanner.nextLine();
				
				System.out.println("digite fecha de nacimiento");
				String generoM = scanner.nextLine();
				
				System.out.println("digite animal favorito");
				String tipoM = scanner.nextLine();
				
				msg4= holding.ingresarPet(idM, nombreM, fechaM, generoM, tipoM);
				System.out.println(msg4);
				break;
				
			case 12:
				msg4="";
				System.out.println("digite id");
				String idE = scanner.nextLine();
				msg4=holding.eliminarclub(idE);
				break;
				
			case 13:
				msg4="";
				System.out.println("digite id");
				String idEO = scanner.nextLine();
				msg4=holding.eliminarOwner(idEO);
				break;
				
			case 14:
				msg4="";
				System.out.println("digite id");
				String idEM = scanner.nextLine();
				msg4=holding.eliminarMascota(idEM);
				break;
				
				default:
					System.out.println("what up man?");
					break;
				
		}
	}
}
}
