package bytebank_herdado;

public class ControleBonificacao {
    
	private double soma;
	

	public void registra(Funcionario f) {
    	this.soma = f.getBonificacao();
    	//this.soma = this.soma + boni;
    }
	

	public double getSoma() {
		return soma;
	}
}
