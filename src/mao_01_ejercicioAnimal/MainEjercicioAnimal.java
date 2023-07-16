package mao_01_ejercicioAnimal;

import java.util.ArrayList;

public class MainEjercicioAnimal {
	public static void main (String [] args) {
		Animal a = new Animal();
		Animal b = new Perro();
		Animal c = new Gato();
		ArrayList<Animal> animales = new ArrayList<>();
		animales.add(a);
		animales.add(b);
		animales.add(c);
		for(Animal animal : animales) {
			System.out.println(animal.hacerRuido());
		}
	}
}
