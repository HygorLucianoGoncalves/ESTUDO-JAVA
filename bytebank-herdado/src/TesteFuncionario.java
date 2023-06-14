
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("nome do FUncionario adosdosandajndsaçkod");
		nico.setCpf("123.456.789-12");
		nico.setSalario(3000.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
