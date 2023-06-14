package bytebanlHerdado;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Gerente g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entra no sistema!");
		} else {
			System.out.println("Não pode entra no sistema!");
		}
	}
}
