package com.gabrielortis.contaBanco;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial\nlimite: R$" + limite + "\n" + super.toString();
	}

	public boolean sacar(double valor) {
		double saldoComLimite = super.getSaldo() + this.limite;

		if ((saldoComLimite - valor) >= 0) {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		}

		return false;
	}

}
