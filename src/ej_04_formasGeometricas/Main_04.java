package ej_04_formasGeometricas;

/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.

Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
*/

public class Main_04 {

	public static void main(String[] args) {
		Circulo c = new Circulo(20);
		Rectangulo r = new Rectangulo(20, 10);
		System.out.println("Los calculos correspondientes al circulo son:\nDiametro: " + c.getDiametro() + "\nRadio: "
				+ c.getRadio() + "\nArea: " + c.area() + "\nPerimetro: " + c.perimetro());
		System.out.println("\nLos calculos correspondiente al rectangulo son:\nAlto: " + r.getAlto() + "\nAncho: "
				+ r.getAncho() + "\nArea: " + r.area() + "\nPerimetro: " + r.perimetro());
	}

}
