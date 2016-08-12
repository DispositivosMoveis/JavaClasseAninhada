package br.edu.principal;

import br.edu.pacoteUm.Conta;

/**
 * Uso da classe conta criada no pacote br.edu.pacoteUm
 * @author welder
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();

		conta.Depositar(500.00);
		conta.Depositar(100.00);
		conta.Sacar(300.00);
		conta.Depositar(1000.00);
		conta.Sacar(4000.00);
		conta.Depositar(10000.00);
		
	}

}
