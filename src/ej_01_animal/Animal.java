package ej_01_animal;

/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
*/

public class Animal {

	protected String nombre, alimento, raza;
	protected int edad;

	public Animal(String nombre, String alimento, String raza, int edad) {
		this.nombre = nombre;
		this.alimento = alimento;
		this.raza = raza;
		this.edad = edad;
	}

	public void alimentarse() {
		System.out.println("El alimento de "+this.nombre+" es: "+this.alimento);
	}
}
