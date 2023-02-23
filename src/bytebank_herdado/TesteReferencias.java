package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
				g1.setNome("Marcio");
				g1.setSalario(5000.0);
				
		Funcionario f = new Funcionario();
				f.setNome("Alexandre");
				f.setSalario(2000.0);
				
	    EditorDeVideo ev = new EditorDeVideo();
				ev.setNome("Elton");
				ev.setSalario(2500.0);
				
				ControleBonificacao controle = new ControleBonificacao();
				controle.registra(g1);
				controle.registra(f);
				controle.registra(ev);
				
				System.out.println(controle.getSoma());
	}
}
