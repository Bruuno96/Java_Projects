import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TesteCalculadoraSomas {

	/*
	 * teste de soma com varias combinações de valores
	 */
	@Test
	public void testeSoma3com2() {
		int numero1 = 3;
		int numero2 = 2;
		int resultanteEsperado = 5;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.somar(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
	}
	
	@Test
	public void testeSoma60com70() {
		int numero1 = 60;
		int numero2 = 70;
		int resultanteEsperado = 130;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.somar(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
		
	}
}