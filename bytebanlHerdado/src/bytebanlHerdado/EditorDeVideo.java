package bytebanlHerdado;

public class EditorDeVideo extends Funcionario {// Gerente eh um Funcionario //Gerente herda da class Funcionario

	public double getBonificacao() {
		System.out.println("Chamando o método de bonidicacao de EdiditoDeVideo");
		return 150; // super utilizar os metodo da class mãe
	}
}
