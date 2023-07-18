package ej_04_formasGeometricas;

public class Circulo implements calculosFormas{
	private double diametro,radio;

	public Circulo(double diametro) {
		super();
		this.diametro = diametro;
		this.radio = diametro/2;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double area() {
		double area = 0;
		area = PI*Math.pow(this.radio, 2);
		return area;
	}
	
	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = PI*this.diametro;
		return perimetro;
	}
}
