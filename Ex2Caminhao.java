package br.edu.ifcvideira.Lista15;

import javax.swing.JOptionPane;

public class Ex2Caminhao extends Ex2Veiculo {
    private double capacidadeToneladas;

    public Ex2Caminhao() {

    }
    
    
    

    public double getCapacidadeToneladas() {
		return capacidadeToneladas;
	}




	public void setCapacidadeToneladas(double capacidadeToneladas) {
		this.capacidadeToneladas = capacidadeToneladas;
	}




	public double calculaIPVA() {
        
		int anosUso = 2024 - this.getAno(); 
        double percentual = 0;

        if (anosUso > 15) {
            return 0; 
        } else {
        	if (capacidadeToneladas <= 50) {
            percentual = 0.04; 
        	} else {
            percentual = 0.03; 
        	}
        }

        return this.getValor() * percentual; 
    }
    
	public double calculaTotal() {
	        
		int anosUso = 2024 - this.getAno(); 
	
	        if (anosUso > 0) {
	            return this.getValor() - (this.getAno()*0.035*this.getValor());
	            	
	        } else {
	    	return this.getValor();
	    	
	        }
	}
	
	public double calculaSeguro() {
		return this.getCapacidadeToneladas() / 10.0 * 500;
	}
    
  

    public void imprime() {
        JOptionPane.showMessageDialog(null, "Valor Total do Caminhão: " + calculaTotal()  + "Valor IPVA do Caminhão: " + calculaIPVA());
    }


}
