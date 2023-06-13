package bytebanlHerdado;

public class Gerente extends Funcionario{//Gerente eh um Funcionario //Gerente herda da class Funcionario

	private String nome;
	private String cpf;
	private double salario;
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
	
//	public double getBonificacap() {
//		return this.salario;
//	}
}
