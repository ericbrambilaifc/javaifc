package br.edu.ifcvideira.Lista15;

import javax.swing.JOptionPane;

public class Ex2Moto extends Ex2Veiculo {
	 
	 int anosFabricacao;
	 int anosUso = 2024 - anosFabricacao; // conta de anos de uso
     double percentual = 0;
	
     public Ex2Moto() {
   
     }

    public double calculaIPVA() {
      

        if (anosUso > 10) {
            return 0; // 
        } else if (anosUso > 5) {
            percentual = 0.03; // 3% 
        } else {
            percentual = 0.04; // 4% 
        }

        return this.getValor() * percentual;
    }
    
    public double calculaTotal() {
    	int anosUso = 2024 - this.getAno(); 
		
        if (anosUso > 0) {
            return this.getValor() - (this.getAno()*0.8*this.getValor());
            	
        } else {
    	return this.getValor();
    	
        }
    }

    public void imprime() {
        JOptionPane.showMessageDialog(null, "Valor Total da Moto: " + this.calculaValor()+ "\nSeguro: Sem seguro pois confiamos no seu potencial");
    }
}
