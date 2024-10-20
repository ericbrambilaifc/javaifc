package br.edu.ifcvideira.Lista15;

import javax.swing.JOptionPane;

public class Ex2Veiculo {
	private String modelo;
	private double ano;
	private double valor;
	private double valorAtual;
	private int anoFabricacao;
	
	public Ex2Veiculo() {
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return (int) ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	public double getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(double valorAtual) {
		this.valorAtual = valorAtual;
	}

	public double getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(double anoFabricacao) {
		this.anoFabricacao = (int) anoFabricacao;
	}

	public double calculaValor() {
		return getValor();
	}
	
	public double calculaSeguro() {
		return 0;
	}
	
	public double calculaIPVA() {
		return 0;
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, "Valor atual: R$" + calculaValor() + "\n"
				+ "Valor do seguro: R$" + calculaSeguro() + "\n" + "Valor do IPVA: R$" + calculaIPVA());
	       
	}

	public void imprime() {
		// TODO Auto-generated method stub
		
	}
	
}
