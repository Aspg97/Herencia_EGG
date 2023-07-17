package ej_02_electrodomestico;

import java.util.Scanner;

public class ServiceTelevisor {
	ServiceElectrodomestico tool = new ServiceElectrodomestico();
	Scanner leer = new Scanner(System.in);

	/*
	 * Método crearTelevisor(): este método llama a crearElectrodomestico() de la
	 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
	 * después llenamos los atributos del televisor.
	 */
	public Televisor crearTelevisor() {
		double resolucion;
		char posee;
		boolean sintonizador = false;
		Electrodomestico elec = tool.crearElectrodomestico();
		System.out.println("Ingrese la resolucion del televisor");
		resolucion = leer.nextDouble();
		leer.nextLine();
		System.out.println("Ingrese si tiene sintonizador TDT incorpordado. Seleccione una opcion Y(yes)/N(no)");
		posee = leer.next().charAt(0);
		posee = Character.toUpperCase(posee);
		if (posee == 'Y')
			sintonizador = true;
		else if (posee != 'N' || posee != 'Y')
			System.out.println("Ingreso erroneo se le pondra por defecto que no tiene");
		Televisor televisor = new Televisor(elec.getColor(), elec.getConsumo(), elec.getPrecio(), elec.getPeso(),
				resolucion, sintonizador);
		return televisor;
	}
	/*
	 * Método precioFinal(): este método será heredado y se le sumará la siguiente
	 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
	 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
	 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
	 * Electrodomestico también deben afectar al precio.
	 */
	public void precioFinal(Televisor televisor) {
		tool.precioFinal(televisor);
		double preFin = 0;
		if(televisor.getResolucion()>40 && televisor.getSintonizador()) {
			System.out.println("valores adicionales por resolucion y sintonizador");
			preFin += (televisor.getPrecio()*0.30)+televisor.getPrecio()+500;
			televisor.setPrecio(preFin);
		}else if(televisor.getResolucion()>40 && televisor.getSintonizador()==false) {
			System.out.println("valores adicionales por resolucion");
			preFin += (televisor.getPrecio()*0.30)+televisor.getPrecio();
			televisor.setPrecio(preFin);
		}else System.out.println("No se cobro valores adicionales por caracteristicas particulares");
	}
}
