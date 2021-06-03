public class Menu {

	/**
	 * Metode que mostra un a un el parametres indicats
	 * @return totes les notes intruduïdes per pantalla validades.
	 */
	
	public static double[] visualitzar() {
		
	
		double notes[] = new double[6];
		
		
		System.out.println("Introdeïx la nota del examen 1 de programació");
		notes[0]=Validar.dades();
		/**
		 * Validar dades es un metode de la clase validar que s'utiliza per a totes les dades que entren per parametre.
		*/
		System.out.println("Introdeïx la nota del projecte de programació");
		notes[1]=Validar.dades();
		System.out.println("Introdeïx la nota del examen 1 de bases de dades");
		notes[2]=Validar.dades();
		System.out.println("Introdeïx la nota del examen 2 de bases de dades");
		notes[3]=Validar.dades();
		System.out.println("Introdeïx la nota del treball de sistemes operatius");
		notes[4]=Validar.dades();
		System.out.println("Introdeïx la nota de l'exposició de sistemes operatius");
		notes[5]=Validar.dades();
		
		return notes;
	}

	/**
	 * Metode que mostra el resultat per pantalla
	 * @param numSuspens és el resultat de totes les operacions de la clase Calcular
	 */
	
	public static void resultat(int numSuspens) {
		System.out.println("Total de UF que hauras de repetir l'any vinent: "+numSuspens);
		
	}

}
