
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.depositar();
		} catch(MinhaExcecao ex) {
			System.out.println("tese");
		}
	}
}
