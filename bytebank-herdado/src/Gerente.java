//Gerente eh um Funcionairo, Gerente herda da class Funcionario,assinar o contrado Autenticavel, e um Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	// bonificação
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao de Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autenticar(int senha) {
		return this.autenticador.autenticar(senha);

	}

}