package ej_03_complementoElectrodomentico;

import java.util.ArrayList;

/*
 TODO Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/

public class Main_03 {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
		ServiceLavadora tLa = new ServiceLavadora();
		ServiceTelevisor tTv = new ServiceTelevisor();
		System.out.println("////////////// Creacion de Lavadora ///////////////");
		Lavadora l1 = new Lavadora("blanco",'A',1000,52,85);
		Lavadora l2 = new Lavadora("rojo",'B',1000,70,45);
		System.out.println("////////////// Creacion de Televisor ///////////////");
		Televisor t1 = new Televisor("blanco",'C',1000,30,24,false);
		Televisor t2 = new Televisor("negro",'D',1000,70,90,true);
		electrodomesticos.add(l1);
		electrodomesticos.add(l2);
		electrodomesticos.add(t1);
		electrodomesticos.add(t2);
		double total = 0;
		for(Electrodomestico elec : electrodomesticos) {
			if(elec instanceof Lavadora) {
				tLa.precioFinal((Lavadora) elec);
				System.out.println("El precio del televisor es: "+elec.getPrecio());
			}else if(elec instanceof Televisor) {
				tTv.precioFinal((Televisor)elec);
				System.out.println("El precio del televisor es: "+elec.getPrecio());
			}else {
				System.out.println("No se hizo nada");
			}
			total += elec.getPrecio();
		}
		System.out.println("El valor total de los electrodomesticos es: " + total);
	}
}
