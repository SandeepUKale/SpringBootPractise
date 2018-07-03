package com.mission.desginPatterns.creational.abstractFactory;

public class EducationalLoan implements Loan {

	private float interestRate;

	public EducationalLoan() {
		this.interestRate = 12;
	}

	@Override
	public String toString() {
		return "EducationalLoan [interestRate=" + interestRate + "]";
	}

	@Override
	public float getInterestRate() {
		// TODO Auto-generated method stub
		return this.interestRate;
	}

}
