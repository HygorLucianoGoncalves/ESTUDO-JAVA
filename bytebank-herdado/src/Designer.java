
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação de Desing ");
		return super.getBonificacao() + 200;
	}
}
