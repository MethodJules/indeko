package com.indeko.alpha.client;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ZeitschriftenView extends Composite {
	
	/** Main panel of the publication view **/
	private VerticalPanel mainPanel = new VerticalPanel();
	
	/**Main horizontal panel of the publication view **/
	private HorizontalPanel horizontalPanel = new HorizontalPanel();
	
	/** Left vertical panel of the publication view **/
	private VerticalPanel leftVerticalPanel = new VerticalPanel();
	
	/** Right vertical panel of the publication view **/
	private VerticalPanel rightVerticalPanel = new VerticalPanel();
	
	private Label lblZeitschrift = new Label("Zeitschrift: ");
	private TextBox txtZeitschrift = new TextBox();
	
	public Button addZeitschriftButton = new Button("Zeitschrift hinzufügen (+)");
	
	//FlexTable Zeitschriften
	private FlexTable zeitschriftFlexTable = new FlexTable();
	private ArrayList<String> arrZeitschriftTitel = new ArrayList<String>();
	
	private Label question3 = new Label("Welche Zeitschriften würden Sie für den Bereich des Kompetenzmanagements zum Lesen und Publizieren empfehlen?");
	
	private final SaveDataServiceAsync saveDataService = GWT.create(SaveDataService.class);
	
	public ZeitschriftenView() {
//		zeitschriftFlexTable.setText(0, 0, " Titel der Zeitschrift ");
		
		leftVerticalPanel.add(lblZeitschrift);
		leftVerticalPanel.add(txtZeitschrift);
		leftVerticalPanel.add(addZeitschriftButton);
		rightVerticalPanel.add(zeitschriftFlexTable);
		
		horizontalPanel.add(leftVerticalPanel);
		horizontalPanel.add(rightVerticalPanel);
		
		mainPanel.add(horizontalPanel);
	}
	
	
	public void addZeitschrift() {
		final String zeitschriftTitel = txtZeitschrift.getText();
		System.out.println(zeitschriftTitel);
		if(zeitschriftTitel == null || zeitschriftTitel.length() == 0) {
			Window.alert("Bitte geben Sie einen Zeitschriftentitel ein!");
			return;
		}
		
		if(arrZeitschriftTitel.contains(zeitschriftTitel)) {
			return;
		}
		
		txtZeitschrift.setFocus(true);
		
		int row = zeitschriftFlexTable.getRowCount();
		arrZeitschriftTitel.add(zeitschriftTitel);
		
		zeitschriftFlexTable.setText(row, 0, zeitschriftTitel);
		
		
		addZeitschrift(zeitschriftTitel);
		//Remove button
		Button removeZeitschriftButton = new Button("X");
		removeZeitschriftButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				int removedIndex = arrZeitschriftTitel.indexOf(zeitschriftTitel);
				arrZeitschriftTitel.remove(removedIndex);
				zeitschriftFlexTable.removeRow(removedIndex + 1);
			}
		});
		
		zeitschriftFlexTable.setWidget(row, 1, removeZeitschriftButton);
		
		
	}
	
	
	private void addZeitschrift(String titel) {
		saveDataService.addZeitschrift(titel, new AsyncCallback<Void>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(Void result) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	
	public VerticalPanel getMainPanel() {
		return mainPanel;
	}
}
