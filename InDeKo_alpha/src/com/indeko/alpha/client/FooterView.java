package com.indeko.alpha.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class FooterView extends Composite {
	HorizontalPanel footerPanel = new HorizontalPanel();
	Button weiterButton = new Button("Weiter");
	Button zurueckButton = new Button("Zurück");
	
	
	
	
	
	
	public FooterView() {
		footerPanel.add(zurueckButton);
		footerPanel.add(weiterButton);
		
	}
	
	
	public HorizontalPanel getFooterPanel() {
		return footerPanel;
	}
	
	public void weiter(QuestionCounter questionCounter) {
		System.out.println("Weiter");
		
		questionCounter.setQuestionCounter(questionCounter.getQuestionCounter()+1);
		
		System.out.println("QuestionCouner = " + questionCounter);
		
			
	}
	
	public void zurueck(QuestionCounter questionCounter) {
		System.out.println("Zurück");
		if (questionCounter.getQuestionCounter() > 0) {
			questionCounter.setQuestionCounter(questionCounter.getQuestionCounter()-1);
			System.out.println("QuestionCounter = " + questionCounter);
		}
	}

	
}
