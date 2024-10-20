package br.edu.ifcvideira.Lista15;

import javax.swing.JOptionPane;

public class Ex1Notebook extends Ex1Computador{
	private double carregador;
	private double pasta;
	
	public Ex1Notebook() {
		
	}

	public double getCarregador() {
		return carregador;
	}

	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}

	public double getPasta() {
		return pasta;
	}

	public void setPasta(double pasta) {
		this.pasta = pasta;
	}
	
	public double calcula() {
		return super.calcula()+this.getCarregador()+this.getPasta();
	}
	
	public double calculaGarantia() {
		return calcula() * 1.12;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do notebook escolhido \n"
					+ this.getConfig() + "\n" 
						+ "Valor Total: R$ " + calcula());
	}
	
	public void imprimeGarantia() {
		JOptionPane.showMessageDialog(null, "Dados do notebook escolhido \n"
					+ this.getConfig() + "\n" 
						+ "Valor Total: R$ " + calculaGarantia());
	}
}
