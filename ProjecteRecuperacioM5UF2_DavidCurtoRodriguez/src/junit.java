import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit {

	@Test
	void calcularSuspensos1() {

		double res = Calcular.notes(new double[] { 5, 5, 5, 5, 5, 5 });

		assertEquals(0, res);

	}

	@Test
	void calcularSuspensos2() {

		double res = Calcular.notes(new double[] { 3, 10, 5, 5, 5, 5 });

		assertEquals(0, res);

	}

	@Test
	void calcularSuspensos3() {

		double res = Calcular.notes(new double[] { 5, 4, 5, 5, 5, 5 });

		assertEquals(1, res);

	}

	@Test
	void calcularSuspensos4() {

		double res = Calcular.notes(new double[] { 10, 3.9, 5, 5, 5, 5 });

		assertEquals(1, res);

	}

	@Test
	void calcularSuspensos5() {

		double res = Calcular.notes(new double[] { 6.9, 3, 5, 5, 5, 5 });

		assertEquals(1, res);

	}

	@Test
	void calcularSuspensos6() {

		double res = Calcular.notes(new double[] { 6.9, 3, 5, 5, 5, 5 });

		assertEquals(1, res);

	}
	
	@Test
	void calcularSuspensos7() {

		double res = Calcular.notes(new double[] { 5, 5, 5, 5, 4, 10 });

		assertEquals(0, res);

	}
	
	@Test
	void calcularSuspensos8() {

		double res = Calcular.notes(new double[] {5, 5, 5, 5, 6, 4});

		assertEquals(0, res);

	}
	
	@Test
	void calcularSuspensos9() {

		double res = Calcular.notes(new double[] {5, 5, 5, 5, 10, 3.9});

		assertEquals(1, res);

	}
	
	@Test
	void calcularSuspensos10() {

		double res = Calcular.notes(new double[] {6.9, 3, 5, 5, 10, 3.9});

		assertEquals(2, res);

	}
	
	void calcularSuspensos11() {

		double res = Calcular.notes(new double[] {1,1,1,1,1,1});

		assertEquals(3, res);

	}
	
	void calcularSuspensos12() {

		double res = Calcular.notes(new double[] {4,4,4,4,4,4});

		assertEquals(3, res);

	}
	

}
