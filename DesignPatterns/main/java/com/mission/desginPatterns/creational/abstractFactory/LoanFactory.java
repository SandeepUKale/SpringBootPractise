package com.mission.desginPatterns.creational.abstractFactory;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bankName) {
		return null;
	}

	@Override
	public Loan getLoan(String loanType) {
		switch (loanType.toLowerCase()) {
		case "personal":
			return new PersonalLoan();
		case "home":
			return new HomeLoan();
		case "educational":
			return new EducationalLoan();
		default:
			return null;
		}
	}

}
