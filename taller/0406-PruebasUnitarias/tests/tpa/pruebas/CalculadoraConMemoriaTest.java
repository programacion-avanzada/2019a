package tpa.pruebas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraConMemoriaTest {

	CalculadoraConMemoria calculadora;

	@Before
	public void setUp() {
		calculadora = new CalculadoraConMemoria();
	}

	@Test
	public void queIniciaEnCero() {
		Assert.assertEquals(0, calculadora.obtenerResultado());
	}

	@Test
	public void queSumaPositivos() {
		calculadora.sumar(2);
		Assert.assertEquals(2, calculadora.obtenerResultado());
	}

	@Test
	public void queSumaPositivosDesdeLaMemoria() {
		calculadora.sumar(2);
		calculadora.sumar(3);
		Assert.assertEquals(5, calculadora.obtenerResultado());
	}
}
