package com.indeko.alpha.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Thankyou extends Composite{
	
	
	/** Main panel of the publication view **/
	private VerticalPanel mainPanel = new VerticalPanel();
	private Label thanksLabel = new Label("Herzlichen Dank für ihre Teilnahme! Die gesammelten Informationen erhalten "
			+ "Sie von uns bis Ende Februar.");
	
	
	public Thankyou() {
		mainPanel.add(thanksLabel);
		
		
	}
	
	public VerticalPanel getMainPanel() {
		return mainPanel;
	}
}
