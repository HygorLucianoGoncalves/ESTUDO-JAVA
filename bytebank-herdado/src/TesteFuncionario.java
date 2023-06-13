
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("nome do FUncionario adosdosandajndsaçkod");
		funcionario1.setCpf("123.456.789-12");
		funcionario1.setSalario(3000.0);
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getCpf());
		System.out.println(funcionario1.getSalario());
		System.out.println(funcionario1.getBonificacao());
	}
}
