/**
 * 
 */
package ui;

/**
 * @author CRISTHIAN CABEZAS
 *
 */
import java.util.Scanner;import com.sun.javafx.geom.AreaOp.AddOp;

import model.Clubs;
import model.Holding;
import model.Owner;
import model.Pet;
import java.io.*;
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
				msg= br.readLine();
				String x="";
				x=msg;
				for(int i=0;i<holding.getClubs().size();i++) {
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
