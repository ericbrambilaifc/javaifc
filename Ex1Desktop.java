package br.edu.ifcvideira.Lista15;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex1Desktop extends Ex1Computador{
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	private double estabilizador;
	private double teclado;
	private double monitor;
	
	public Ex1Desktop() {
		
	}

	public double getEstabilizador() {
		return estabilizador;
	}

	public void setEstabilizador(double estabilizador) {
		this.estabilizador = estabilizador;
	}

	public double getTeclado() {
		return teclado;
	}

	public void setTeclado(double teclado) {
		this.teclado = teclado;
	}

	public double getMonitor() {
		return monitor;
	}

	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}
	
	
	public double calcula() {
		return super.calcula()+ this.getEstabilizador()+ this.getTeclado()+this.getMonitor();
}

	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Desktop escolhido \n"
					+ this.getConfig() + "\n" 
						+ "Valor Total: R$ " + calcula());
	}
	
	public void imprimeGarantia() {
		JOptionPane.showMessageDialog(null, "Dados do Desktop escolhido \n"
					+ this.getConfig() + "\n" 
						+ "Valor Total: R$ " + calculaGarantia());
	}
	
	
}