
public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 222);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(333, 333);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("Saldo da conta poupança: " + cp.getSaldo());
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
	}
}
