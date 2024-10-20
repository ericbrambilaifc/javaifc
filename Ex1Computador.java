package br.edu.ifcvideira.Lista15;

import javax.swing.JOptionPane;

public class Ex1Computador {
		private double processador;  //double pois sera o valor
		private double memoria;
		private double hd;
		private double placaMae;
		private double placaVideo;
		private int volumes;
		private int garantia;
		private String config;
		
		
		public Ex1Computador() {
			
		}


		public double getProcessador() {
			return processador;
		}


		public void setProcessador(double processador) {
			this.processador = processador;
		}


		public double getMemoria() {
			return memoria;
		}


		public void setMemoria(double memoria) {
			this.memoria = memoria;
		}


		public double getHd() {
			return hd;
		}


		public void setHd(double hd) {
			this.hd = hd;
		}


		public double getPlacaMae() {
			return placaMae;
		}


		public void setPlacaMae(double placaMae) {
			this.placaMae = placaMae;
		}


		public double getPlacaVideo() {
			return placaVideo;
		}


		public void setPlacaVideo(double placaVideo) {
			this.placaVideo = placaVideo;
		}


		public int getVolumes() {
			return volumes;
		}


		public void setVolumes(int volumes) {
			this.volumes = volumes;
		}


		public int getGarantia() {
			return garantia;
		}


		public void setGarantia(int garantia) {
			this.garantia = garantia;
		}


		public String getConfig() {
			return config;
		}


		public void setConfig(String config) {
			this.config = config;
		}
		
		public double calcula() {
			return this.getProcessador()+this.getMemoria()+this.getHd()+this.getPlacaMae()+this.getPlacaVideo();
		}
		
		public double calculaGarantia() {
			return calcula() * 1.1;
		}
		
		public void imprime() {
			JOptionPane.showMessageDialog(null, "Dados do Computador escolhido \n"
						+ this.getConfig() + "\n" 
							+ "Valor Total: R$ " + calcula());
		}
		
		public void imprimeGarantia() {
			JOptionPane.showMessageDialog(null, "Dados do Computador escolhido \n"
						+ this.getConfig() + "\n" 
							+ "Valor Total: R$ " + calculaGarantia());
		}
		
	
}
