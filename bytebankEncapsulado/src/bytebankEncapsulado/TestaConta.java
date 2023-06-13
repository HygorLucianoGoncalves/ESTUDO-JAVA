package bytebankEncapsulado;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 233435);
		
		conta.deposita(200);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(1335);
		
		System.out.println("Agora a agencia é : " + conta.getAgencia());
		
		System.out.println("O total de contas criada no banco é : " + Conta.getTotal());
	}
}
