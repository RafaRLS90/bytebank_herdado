package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
				g1.setNome("Marcio");
				g1.setSalario(5000.0);
				
				ControleBonificacao controle = new ControleBonificacao();
				controle.registra(g1);
	}
}
