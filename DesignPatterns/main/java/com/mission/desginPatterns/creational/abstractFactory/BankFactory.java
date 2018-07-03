package com.mission.desginPatterns.creational.abstractFactory;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String name) {
		switch (name.toLowerCase()) {
		case "sbi":
			return new SBI();
		case "hdfc":
			return new HDFC();
		case "icici":
			return new ICICI();
		default:
			return null;
		}
	}

	@Override
	public Loan getLoan(String loanType) {
		return null;
	}

}
