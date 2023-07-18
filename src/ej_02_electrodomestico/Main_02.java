package ej_02_electrodomestico;

/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
*/

public class Main_02 {

	public static void main(String[] args) {
		ServiceLavadora tLa = new ServiceLavadora();
		ServiceTelevisor tTv = new ServiceTelevisor();
		System.out.println("////////////// Creacion de Lavadora ///////////////");
		Lavadora l1 = tLa.crearLavadora();
		tLa.precioFinal(l1);
		System.out.println("////////////// Creacion de Televisor ///////////////");
		Televisor t1 = tTv.crearTelevisor();
		tTv.precioFinal(t1);
		System.out.println("El precio final de la lavadora es: "+l1.getPrecio()+"\nEl precio final del televisor es: "+t1.getPrecio());
	}
}
