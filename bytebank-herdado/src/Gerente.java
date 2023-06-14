
public class Gerente extends Funcionario {

	private double senha;

	// bonificação
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao de Gerente");
		return super.getBonificacao() + super.getSalario();
	}

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