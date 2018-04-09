package com.gabrielortis.contaBanco;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nContaPoupanca\ndiaRendimento: " + diaRendimento + "";
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
}
