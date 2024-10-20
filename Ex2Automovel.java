package br.edu.ifcvideira.Lista15;

import javax.swing.JOptionPane;

public class Ex2Automovel extends Ex2Veiculo {

    int anoFabricacao;
	int anosUso = 2024 - this.getAno(); 


	    public Ex2Automovel() {
	    }

	    public double calculaIPVA() {
			int anosUso = 2024 - this.getAno(); 
	        double percentual = 0;

	    
	        if (anosUso > 20) {
	            return 0;
	        } else if (anosUso > 10) {
	            percentual = 0.04; 
	        } else {
	            percentual = 0.05;
	        }

	        return this.getValor() * percentual; 
	    }
	    
	    public double calculaTotal() {
	        
			int anosUso = 2024 - this.getAno(); 
		
		        if (anosUso > 0) {
		            return this.getValor() - (this.getAno()*0.5*this.getValor());
		            	
		        } else {
		    	return this.getValor();
		    	
		        }
		}
		
		public double calculaSeguro() {
			if(anosUso > 5) {
				return this.getValor() * 0.045;
			} else if (anosUso > 5 && anosUso < 10) {
				return this.getValor() * 0.5;
			} else if (anosUso > 10) {
				return this.getValor() * 0.55;
			}
			
			return 0;
		} 
		

	    public void imprime() {
	        JOptionPane.showMessageDialog(null, "Valor Total do Automóvel: " + calculaTotal()  +  "\n" +
	        						"Valor do IPVA" + calculaIPVA() + "\n" + "Valor do Seguro " + calculaSeguro());
	    }
	}
