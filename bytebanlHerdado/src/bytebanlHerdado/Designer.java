package bytebanlHerdado;

public class Designer extends Funcionario {// Gerente eh um Funcionario //Gerente herda da class Funcionario

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao de Desinger ");
		return 200; // super utilizar os metodo da class mãe
	}
}
