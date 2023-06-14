package bytebanlHerdado;

public class Gerente extends FuncionarioAutentical{// Gerente eh um Funcionario //Gerente herda da class Funcionario

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do gerente ");
		return super.getSalario();//super utilizar os metodo da class mãe 
	}
}
