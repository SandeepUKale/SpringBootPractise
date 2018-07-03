package com.mission.desginPatterns.structural.bridge;

public interface Questions {
	public void nextQuestion();

	public void previousQuestion();

	public void newQuestion(String q);

	public void deleteQuestion(String q);

	public void displayQuestion();

	public void displayAllQuestions();
}
