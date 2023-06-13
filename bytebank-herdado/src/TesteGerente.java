
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("nome do gerente: naab abdusbhds");
		gerente1.setCpf("145242255");
		gerente1.setSalario(5000.0);

		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());

		gerente1.setSenha(2222);
		boolean senhacerta = gerente1.autenticar(2222);

		System.out.println(senhacerta);
	}
}
