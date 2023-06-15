
public class Gerente extends FuncionarioAutenticavel {

	// bonificação
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao de Gerente");
		return super.getSalario();
	}
	
}