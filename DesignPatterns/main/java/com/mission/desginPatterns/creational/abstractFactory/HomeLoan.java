package com.mission.desginPatterns.creational.abstractFactory;

public class HomeLoan implements Loan {

	private float interestRate;

	public HomeLoan() {
		this.interestRate = 9;
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
