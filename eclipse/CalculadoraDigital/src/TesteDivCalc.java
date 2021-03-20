import static org.junit.Assert.assertEquals; 

import org.junit.Test;
public class TesteDivCalc {

	/*
	 * teste de soma com varias combinações de valores
	 */
	@Test
	public void testeDiv4com2() {
		int numero1 = 4;
		int numero2 = 2;
		int resultanteEsperado = 2;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.dividir(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
	}
	
	@Test
	public void testeDiv60com10() {
		int numero1 = 60;
		int numero2 = 10;
		int resultanteEsperado = 6;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.dividir(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
		
	}

}
