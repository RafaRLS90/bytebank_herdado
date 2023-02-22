package bytebank_herdado;

public class Gerente extends Funcionario {
	 private int senha;

	    public boolean autentica(int senha) {
	        if(this.senha == senha) {
	            return true;
	        } else {
	            return false;
	        }

	    }
	    
	    public void setSenha(int senha) {
	       this.senha = senha;
	    }
	    
	    public double getBonificacao() {
	    	return super.getBonificacao() + super.getSalario(); //no lugar de this, super, referencia a classe mãe
	    }
}