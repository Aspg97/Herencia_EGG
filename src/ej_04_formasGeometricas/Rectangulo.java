package ej_04_formasGeometricas;

public class Rectangulo implements calculosFormas{
	private double alto,ancho;

	public Rectangulo(double alto, double ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public double area() {
		double area = 0;
		area = this.alto*this.ancho;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = (this.alto+this.ancho)*2;
		return perimetro;
	}
	
	
}
