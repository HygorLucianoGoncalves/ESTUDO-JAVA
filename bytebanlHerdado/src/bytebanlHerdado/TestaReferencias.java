package bytebanlHerdado;

public class TestaReferencias {

	public static void main(String[] args) {
		
		 Gerente g1 = new Gerente();
		 g1.setNome("Marcos");
		 g1.setSalario(5000.0);
		 
		 Funcionario f1 = new Funcionario();
		 f1.setNome("Bruno");
		 f1.setSalario(2000.0);
		 
		 EditorDeVideo ev = new EditorDeVideo();
		 ev.setNome("teste dp nome");
		 ev.setSalario(2500.0);
		 
		 ControleBonificacao controle = new ControleBonificacao();
		 controle.registra(g1);
		 controle.registra(f1);
		 controle.registra(ev);
		 
		 System.out.println(controle.getSoma());
	}

}
