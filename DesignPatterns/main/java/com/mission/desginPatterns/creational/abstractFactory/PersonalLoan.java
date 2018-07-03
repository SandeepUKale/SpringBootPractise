package com.mission.desginPatterns.creational.abstractFactory;

public class PersonalLoan implements Loan {

	private float interestRate;

	public PersonalLoan() {
		this.interestRate = 14;
	}

	@Override
	public String toString() {
		return "HomeLoan [interestRate=" + interestRate + "]";
	}

	@Override
	public float getInterestRate() {
		// TODO Auto-generated method stub
		return this.interestRate;
	}

}
