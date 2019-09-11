/**
 * 
 */
package ui;

/**
 * @author CRISTHIAN CABEZAS
 *
 */
import java.util.Scanner;

import com.sun.org.apache.xml.internal.security.Init;

import model.Clubs;
import model.Holding;
public class Main {

	private Holding holding;
	private Scanner scanner;
	
	public Main() {
		init();
	}
	public void init() {
		scanner = new Scanner(System.in);
		
		Clubs clubs1 = new Clubs("1321321", "juan", "21/12/10", "perros");
		Clubs clubs2 = new Clubs("1321321", "juan", "21/12/10", "perros");
		Clubs clubs3 = new Clubs("1321321", "juan", "21/12/10", "perros");
		Clubs[] clubs = {clubs1,clubs2,clubs3 };
	}
	public static void main(String[] args) {
		Main main = new Main();
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
				msg1=holding.generateClubList();
				break;

			default:
				break;
			}
		}
	}
}
