package com.gabrielortis.contaBanco;

public class MyApp {
	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");

		contaSimples.depositar(100);

		realizarSaque(contaSimples, 50);

		realizarSaque(contaSimples, 70);

		System.out.println(contaSimples);

		System.out.println("\n*** Teste ContaPoupanca ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupança");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(8);

		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);

		realizarSaque(contaPoupanca, 70);

		novoSaldoRendimento(contaPoupanca, 0.08);

		System.out.println(contaPoupanca);

		System.out.println("\n*** Teste ContaEspecial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta Especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(500);

		contaEspecial.depositar(100);

		realizarSaque(contaEspecial, 50);

		realizarSaque(contaEspecial, 70);

		System.out.println(contaEspecial);

	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque realizado com sucesso.\nO salto atual é de: R$" + conta.getSaldo());
		} else {
			System.out.println("Impossível realizar o saque no valor de R$" + valor
					+ ". Saldo insuficiente\nO salto atual é de: R$" + conta.getSaldo());
		}
	}

	private static void novoSaldoRendimento(ContaPoupanca conta, double valor) {
		if (conta.calcularNovoSaldo(valor)) {
			System.out.println("O saldo atual, com o rendimento é de: R$" + conta.getSaldo());
		} else {
			System.out.println("Saldo não atualizado.");
		}
	}

}
