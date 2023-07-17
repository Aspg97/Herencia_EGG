package ej_02_electrodomestico;

/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados. Los constructores que se
implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados.
Recuerda que debes llamar al constructor
de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
 */

public class Lavadora extends Electrodomestico{
	private double carga;

	public Lavadora() {
	}

	public Lavadora(String color, char consumo, double precio, double peso, double carga) {
		super(color, consumo, precio, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
}
