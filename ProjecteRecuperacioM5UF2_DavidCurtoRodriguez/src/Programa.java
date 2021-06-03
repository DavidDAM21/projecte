/**

 * Aquesta clase es el main d'execució del programa

 * @author: David Curto Rodriguez

 * @version: 01/06/2021

 * @see <a href = "https://agora.xtec.cat/ies-sabadell/" /> Institut Sabadell – Cicle DAM clase C </a>

 */


public class Programa {

	/**
	 * Main del programa
	 * @param args
	 */
	
	public static void main(String[] args) {

		int numSuspens;
		double[] notes = Menu.visualitzar();
		numSuspens=Calcular.notes(notes);
		Menu.resultat(numSuspens);
			
		
	}

}
