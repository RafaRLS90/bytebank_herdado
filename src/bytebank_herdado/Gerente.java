package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel{
	 
		private int senha;
	    
	    public double getBonificacao() {
	    	System.out.println("Chamando o metodo de bonificacao do Gerente");
	    	return super.getSalario(); //no lugar de this, super, referencia a classe mãe
	    }

	    private AutenticacaoUtil autenticador;


		public Gerente() {
			this.autenticador = new AutenticacaoUtil();
		}
		
	   
		
	 
		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}


		@Override
		public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		}

			
	}
