package bytebank_herdado;

public class Gerente extends Funcionario {
	 
	
	    
	    public double getBonificacao() {
	    	System.out.println("Chamando o metodo de bonificacao do Gerente");
	    	return super.getSalario(); //no lugar de this, super, referencia a classe mãe
	    }
}