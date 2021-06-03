import java.util.Scanner;
public class Validar {

	/**
	 * Metode per validar
	 * @return la dada ja validada
	 */
	
	public static double dades() {
		Scanner reader = new Scanner(System.in);
		boolean correcte=false;
		double dada = 0;
		
		do {
			
			try {
				dada = reader.nextDouble();
				
				if (dada > 0 || dada < 10) {
					correcte = true;
				}
				
			} catch (Exception e) {
				System.out.println("Dada incorrecte, escriu-la de nou.");
				reader.nextLine();
			}
			
		} while (!correcte);
		return dada;
	}
}
