
public class SistemeInterno {

	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou =  fa.autenticar(this.senha);
		if (autenticou) {
			System.out.println("pode entra no sistema");
		} else {
			System.out.println("Não pode entra no sistema");
		}
	}
}
