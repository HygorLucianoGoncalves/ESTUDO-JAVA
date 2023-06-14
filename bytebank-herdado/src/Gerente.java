
public class Gerente extends Funcionario {

	private double senha;

	// bonificação
//	public double getBonificacao() {
//		return this.salario * 0.1;
//	}

	// setters
	public void setSenha(double senha) {
		this.senha = senha;
	}

	// gettess
	public double getSenha() {
		return senha;
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