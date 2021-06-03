public class Calcular {
	
	/**
	 * Notes es un metode que calucla la mitjana de totes les qualificacións e indica el numero d'assignatures
	 * que s'han de repetir
	 * @param notes 
	 * array de index 6 on estan les notes 
	 * @return 
	 * retornara el numSuspens.
	 */

	public static int notes(double[] notes) {

		int numSuspens=0;
		
		if (notes[1] < 5 && notes[5] < 4) {

			numSuspens = 2;

			double notaUF2 = ufCalculator(notes, 2, 3);

			if (notaUF2 < 5) {

				numSuspens = 3;

			}

		} else if (notes[5] < 4) {

			numSuspens = 1;

			double notaUF1 = ufCalculator(notes, 0, 1);

			double notaUF2 = ufCalculator(notes, 2, 3);

			if (notaUF2 < 5 && notaUF1 < 5) {

				numSuspens = 3;

			} else if (notaUF2 < 5) {

				numSuspens = 2;

			} else if (notaUF1 < 5) {

				numSuspens = 2;

			}

		} else if (notes[1] < 5) {

			numSuspens = 1;

			double notaUF3 = ufCalculator(notes, 4, 5);

			double notaUF2 = ufCalculator(notes, 2, 3);

			if (notaUF2 < 5 && notaUF3 < 5) {

				numSuspens = 3;

			} else if (notaUF2 < 5) {

				numSuspens = 2;

			} else if (notaUF3 < 5) {

				numSuspens = 2;

			}

		} else {

			double notaUF3 = ufCalculator(notes, 4, 5);

			double notaUF2 = ufCalculator(notes, 2, 3);

			double notaUF1 = ufCalculator(notes, 0, 1);

			if (notaUF1 < 5) {
				numSuspens++;
			}
			if (notaUF2 < 5) {
				numSuspens++;
			}
			if (notaUF3 < 5) {
				numSuspens++;
			}

		}

		return numSuspens;
	}

	/**
	 * UfCalculator calcula la mitjana de les UF's indicant aixo si el index on es troben les notes en l'array de notes
	 * @param notes
	 * @param i1
	 * @param i2
	 * @return retorna la nota de la uf selecionada
	 */
	
	public static double ufCalculator(double[] notes, int i1, int i2) {

		double notaUF, per1, per2;

		if (i1 == 0 && i2 == 1) {
			per1 = 0.7;
			per2 = 0.3;
		} else if (i1 == 2 && i2 == 3) {
			per1 = 0.5;
			per2 = 0.5;
		} else {
			per1 = 0.6;
			per2 = 0.4;
		}

		notaUF = ((notes[i1] * per1) + (notes[i2] * per2));

		return notaUF;
	}

}
