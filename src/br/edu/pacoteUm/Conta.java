package br.edu.pacoteUm;

public final class Conta {

	private double saldo;
	/**
	 * Para acessar os elementos da classe SaldoConta, ela deve
	 * ser instanciada na classe Conta (Classe Externa)
	 */
	private SaldoConta saldoConta = new SaldoConta();
	
	/**
	 * A partir de cada deposito ou saque será mostrado o estado da conta.
	 * @param valor
	 */
	
	public void Depositar(double valor){
		if (valor > 0){
			saldo = saldo + valor;
		}
		System.out.println(saldoConta.SituacaoConta());
	}
	
	public void Sacar(double valor){
		saldo = saldo - valor;
		System.out.println(saldoConta.SituacaoConta());
	}
	
	/**
	 * Classe SaldoConta permite verificar a situação do estado da conta
	 * a partir das movimentacões realizadas.
	 * Esta classe só tem visibilidade dentro da classe conta.
	 * Os atributos da classe conta são visíveis dentro da classe SaldoConta
	 * O contrário não é verdadeiro
	 * @author welder
	 *
	 */
	private class SaldoConta {
		
		public String SituacaoConta(){
			if (saldo > 1000.00)
				return "Conta de cliente especial";
			else if (saldo > 0 && saldo <= 1000.00)
				return "Conta de cliente comum";
			else
				return "Conta está inativa"; 
		}
		
	}
	
	
}
