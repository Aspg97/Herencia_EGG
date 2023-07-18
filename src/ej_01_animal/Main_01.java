package ej_01_animal;

public class Main_01 {
	public static void main (String [] args) {
		Animal perro1 = new Perro("Stich","Carnivoro","Doberman",15);
		Animal perro2 = new Perro("Teddy","Croquetas","Chihuahua",10);
		Animal gato = new Gato("Pelusa","Galletas","Siames",15);
		Animal caballo = new Caballo("Spark","Pasto","Fino",25);
		
		perro1.alimentarse();
		perro2.alimentarse();
		gato.alimentarse();
		caballo.alimentarse();
	}
}
