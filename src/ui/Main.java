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
			System.out.println("2. Generar listado de los due�os ordenados");
			System.out.println("3. Generar listado de las mascotas ordenados");
			System.out.println("4. Generar listado de due�os de acuerdo a cantidad de mascotas");
			System.out.println("5. Generar listado de los clubes ordenado de acuerdo al numero de due�os");
			System.out.println("6. Buscar club de forma tradicional y binaria");
			System.out.println("7. Buscar due�o de forma tradicional y binaria");
			System.out.println("8.  Buscar mascota de forma tradicional y binaria");
			System.out.println("9. Registrar club");
			System.out.println("10. Registrar due�o");
			System.out.println("11. Registrar mascota");
			System.out.println("12. Salir");
			System.out.println("||||||||||||||||||||||||||");
			System.out.println("||||||||||||||||||||||||||");
			
			String index = scanner.nextLine();
			int indexNum=0;
			
			try {
				indexNum = Integer.parseInt(index);
			} catch (NumberFormatException e) {
				System.out.println("Ingrese un valor valido");
			}
			
			switch (indexNum) {
			case 1:
				String msg1=" ";
		//		msg1=holding.generateClubList();
				break;

			default:
				break;
			}
		}
	}
}
