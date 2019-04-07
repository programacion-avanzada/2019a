package tpa.pruebas;

public class CalculadoraConMemoria {

	private int resultado;
	
	public CalculadoraConMemoria() {
		this.resultado = 0;
	}
	
	public int obtenerResultado() {
		return this.resultado;
	}
	
	public void borrarMemoria() {
		this.resultado = 0;
	}
	
	public void sumar(int operando) {
		this.resultado += operando;
	}
}
