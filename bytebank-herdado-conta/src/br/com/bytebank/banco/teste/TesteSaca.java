
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1555, 2202);
		
		conta.deposita(200);
		try {
			conta.saca(201);
		} catch(SaldoInsuficenteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}

