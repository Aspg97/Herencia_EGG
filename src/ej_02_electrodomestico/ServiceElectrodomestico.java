package ej_02_electrodomestico;

import java.util.Scanner;

public class ServiceElectrodomestico {
	Scanner leer = new Scanner(System.in);

	/*
	 * TODO Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
	 * correcta, sino es correcta usara la letra F por defecto. Este método se debe
	 * invocar al crear el objeto y no será visible.
	 */
	public char comprobarConsumoEnergetico(char letra) {
		char letraConsumo[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
		char letraFinalConsumo = '-';
		letra = Character.toUpperCase(letra);
		for (int i = 0; i < letraConsumo.length; i++) {
			if (letra == letraConsumo[i]) {
				letraFinalConsumo = letraConsumo[i];
				break;
			} else {
				letraFinalConsumo = 'F';
			}
		}
		return letraFinalConsumo;
	}
	/*
	 * TODO Método comprobarColor(String color): comprueba que el color es correcto,
	 * y si no lo es, usa el color blanco por defecto. Los colores disponibles para
	 * los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
	 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
	 * el objeto y no será visible.
	 */

	public String comprobarColor(String color) {
		String colorDefinido = "";
		String coloreDisponibles[] = new String[] { "blanco", "negro", "rojo", "azul", "gris" };
		for (int i = 0; i < coloreDisponibles.length; i++) {
			if (coloreDisponibles[i].equalsIgnoreCase(color)) {
				colorDefinido = coloreDisponibles[i];
			} else {
				colorDefinido = "Blanco";
			}
		}
		return colorDefinido;
	}
	/*
	 * TODO Metodo crearElectrodomestico(): le pide la información al usuario y
	 * llena el electrodoméstico, también llama los métodos para comprobar el color
	 * y el consumo. Al precio se le da un valor base de $1000.
	 */

	public Electrodomestico crearElectrodomestico() {
		String color;
		char consumo;
		double peso;
		System.out.println("<---- Creando Electrodomestico General---->");
		System.out.println("Ingrese el color del electrodomestico");
		color = leer.nextLine();
		System.out.println("Ingrese el consumo que tiene establecido de la A a la F");
		consumo = leer.next().charAt(0);
		System.out.println("Ingrese el peso del electrodomestico");
		peso = leer.nextDouble();
		leer.nextLine();
		System.out.println("<---- Terminando Creacion General ---->\n");
		Electrodomestico electrodomestico = new Electrodomestico(comprobarColor(color),
				comprobarConsumoEnergetico(consumo), 1000, peso);
		return electrodomestico;
	}
	/*
	 * TODO Método precioFinal(): según el consumo energético y su tamaño, aumentará
	 * el valor del precio. Esta es la lista de precios:
	 * LETRA PRECIO
	 * A $1000
	 * B $800
	 * C $600
	 * D $500
	 * E $300
	 * F $100
	 * 
	 * PESO PRECIO
	 * Entre 1 y 19kg $100
	 * Entre 20 y 49 kg $500
	 * Entre 50 y 79 kg $800
	 * Mayor que 80 kg $1000
	 */

	public void precioFinal(Electrodomestico elec) {
		double preFinal = 0;
		switch (elec.getConsumo()) {
		case 'A':
			preFinal = elec.getPrecio() + 1000;
			break;
		case 'B':
			preFinal = elec.getPrecio() + 800;
			break;
		case 'C':
			preFinal = elec.getPrecio() + 600;
			break;
		case 'D':
			preFinal = elec.getPrecio() + 500;
			break;
		case 'E':
			preFinal = elec.getPrecio() + 300;
			break;
		case 'F':
			preFinal = elec.getPrecio() + 100;
			break;
		}
		//System.out.println("precio al momento: "+preFinal);
		if (elec.getPeso() > 0 && elec.getPeso() < 20) {
			preFinal += 100;
		} else if (elec.getPeso() > 19 && elec.getPeso() < 50) {
			preFinal += 500;
		} else if (elec.getPeso() > 49 && elec.getPeso() < 80) {
			preFinal += 800;
		} else if (elec.getPeso() > 79) {
			preFinal += 1000;
		}
		//System.out.println("precio al momento: "+preFinal);
		elec.setPrecio(preFinal);
	}
}
