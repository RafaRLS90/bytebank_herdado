package bytebank_herdado;

public class EditorDeVideo extends Funcionario {
	 
	    public double getBonificacao() {
	    	System.out.println("Chamando o metodo de bonificacao do Editor de video");
	    	return 150; //no lugar de this, super, referencia a classe mãe
	    }
}
