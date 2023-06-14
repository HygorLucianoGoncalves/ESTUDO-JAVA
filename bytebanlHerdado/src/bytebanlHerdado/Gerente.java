package bytebanlHerdado;

public class Gerente extends Funcionario {// Gerente eh um Funcionario //Gerente herda da class Funcionario

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do gerente ");
		return super.getSalario();//super utilizar os metodo da class mãe 
	}
}
