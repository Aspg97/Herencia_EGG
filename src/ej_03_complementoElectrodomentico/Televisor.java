package ej_03_complementoElectrodomentico;

/*
TODO Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
*/

public class Televisor extends Electrodomestico {
	private double resolucion;
	private boolean sintonizador;

	public Televisor() {

	}

	public Televisor(String color, char consumo, double precio, double peso, double resolucion,boolean sintonizador) {
		super(color, consumo, precio, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean getSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
}
