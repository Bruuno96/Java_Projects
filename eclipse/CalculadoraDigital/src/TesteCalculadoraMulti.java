import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TesteCalculadoraMulti {

	/*
	 * teste de soma com varias combinações de valores
	 */
	@Test
	public void testeMulti3com2() {
		int numero1 = 3;
		int numero2 = 2;
		int resultanteEsperado = 6;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.multiplicar(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
	}
	
	@Test
	public void testeMulti60com10() {
		int numero1 = 60;
		int numero2 = 10;
		int resultanteEsperado = 600;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.multiplicar(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
		
	}

}
