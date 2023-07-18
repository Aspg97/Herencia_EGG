package ej_03_complementoElectrodomentico;

import java.util.Scanner;

public class ServiceLavadora {
	ServiceElectrodomestico tool = new ServiceElectrodomestico();
	Scanner leer = new Scanner(System.in);

	/*
	 * • Método crearLavadora (): este método llama a crearElectrodomestico() de la
	 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
	 * después llenamos el atributo propio de la lavadora.
	 */
	public Lavadora crearLavadora() {
		Electrodomestico elec = tool.crearElectrodomestico();
		System.out.println("Ingrese la carga que tendra la lavadora");
		double carga = leer.nextDouble();
		leer.nextLine();
		Lavadora lavadora = new Lavadora(elec.getColor(), elec.getConsumo(), elec.getPrecio(), elec.getPeso(), carga);
		return lavadora;
	}

	/*
	 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
	 * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en
	 * $500, si la carga es menor o igual, no se incrementará el precio. Este método
	 * debe llamar al método padre y añadir el código necesario. Recuerda que las
	 * condiciones que hemos visto en la clase Electrodoméstico también deben
	 * afectar al precio.
	 */
	 public void precioFinal(Lavadora lavadora) {
		 tool.precioFinal(lavadora);
		 double preFin = 0;
		 if(lavadora.getCarga()>30) {
			 preFin += lavadora.getPrecio()+500;
			 lavadora.setPrecio(preFin);
		 }else System.out.println("No se agregaron valores adicionales a la lavadora");
		 
	 }
	
}
