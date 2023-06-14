
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) { //Contrudore não são hedados da class mãe 
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
}
