
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {//Contrudore não são hedados da class mãe 
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
