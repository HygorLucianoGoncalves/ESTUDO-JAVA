
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação de EditorVideo ");
		return super.getBonificacao() + 100;
	}
}
