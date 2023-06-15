//Gerente eh um Funcionairo, Gerente herda da class Funcionario,assinar o contrado Autenticavel, e um Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	// bonificação
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao de Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}