package com.indeko.alpha.client;

public class QuestionCounter {
	private int questionCounter;
	
	public QuestionCounter(int questionCounter) {
		this.questionCounter = questionCounter;
	}

	public int getQuestionCounter() {
		return questionCounter;
	}

	public void setQuestionCounter(int questionCounter) {
		this.questionCounter = questionCounter;
	}
	
	public String toString() {
		return Integer.toString(questionCounter);
	}
	
	
}
