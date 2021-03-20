//import static org.junit.jupiter.api.Assertions.*; 

//import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals; 

import org.junit.Test;
public class TesteCalculadoraSub {

	/*
	 * teste de soma com varias combinações de valores
	 */
	@Test
	public void testeSub10com2() {
		int numero1 = 10;
		int numero2 = 2;
		int resultanteEsperado = 8;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.subtrair(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
	}
	
	@Test
	public void testeSub60com20() {
		int numero1 = 60;
		int numero2 = 20;
		int resultanteEsperado = 40;
		Calculadora calc = new Calculadora();
		int numeroResultanteReal = calc.subtrair(numero1, numero2);
		assertEquals(resultanteEsperado, numeroResultanteReal);
//		assertEquals(resultanteEsperado, numeroResultanteReal, "Concluido");
		
	}

}
