package com.indeko.alpha.client;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Start {
	
	Label begruessungsText = new Label("huhuuhuhuuh");
	
	
	public void setStartContent() {
		RootPanel.get("header").add(begruessungsText);
	}
}
