
public class Gerente extends Funcionario {

	private int senha;

	// bonificação
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao de Gerente");
		return super.getSalario();
	}

	// setters
	public void setSenha(int senha) {
		this.senha = senha;
	}


	// autenticar a senha
	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}