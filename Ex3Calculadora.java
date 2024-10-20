package br.edu.ifcvideira.Lista15;

import javax.swing.JOptionPane;

public class Ex3Calculadora {
	private double alturaParede;
	private double larguraParede;
	private double alturaAzulejo;
	private double larguraAzulejo;
	private double area;
	
	public Ex3Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public double getAlturaParede() {
		return alturaParede;
	}

	public void setAlturaParede(double alturaParede) {
		this.alturaParede = alturaParede;
	}

	public double getLarguraParede() {
		return larguraParede;
	}

	public void setLarguraParede(double larguraParede) {
		this.larguraParede = larguraParede;
	}

	public double getAlturaAzulejo() {
		return alturaAzulejo;
	}

	public void setAlturaAzulejo(double alturaAzulejo) {
		this.alturaAzulejo = alturaAzulejo;
	}

	public double getLarguraAzulejo() {
		return larguraAzulejo;
	}

	public void setLarguraAzulejo(double larguraAzulejo) {
		this.larguraAzulejo = larguraAzulejo;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double calculaQuadrado() {
		this.setArea(this.getAlturaParede()*this.getLarguraParede() / this.getLarguraAzulejo() * this.getLarguraAzulejo());
		return this.getArea();
	}
	
	public double retangular() {
		this.setArea(this.getAlturaParede()*this.getLarguraParede() / this.getLarguraAzulejo() * this.getAlturaAzulejo());
		return this.getArea();
	}
	
	public double ladosIguais() {
		this.setArea(this.getLarguraParede()*this.getLarguraParede() / this.getLarguraAzulejo() * this.getLarguraAzulejo()/2);
		return this.getArea();
	}
	
	public double ladosDiferentes() {
		this.setArea(this.getAlturaParede()*this.getLarguraParede() / this.getLarguraAzulejo() * this.getLarguraAzulejo()/2);
		return this.getArea();
	}
	
	
	
}
