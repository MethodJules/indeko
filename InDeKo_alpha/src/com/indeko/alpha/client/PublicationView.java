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

public class PublicationView extends Composite {
	/** Main panel of the publication view **/
	private VerticalPanel mainPanel = new VerticalPanel();
	
	/**Main horizontal panel of the publication view **/
	private HorizontalPanel horizontalPanel = new HorizontalPanel();
	
	/** Left vertical panel of the publication view **/
	private VerticalPanel leftVerticalPanel = new VerticalPanel();
	
	/** Right vertical panel of the publication view **/
	private VerticalPanel rightVerticalPanel = new VerticalPanel();
	
	
	
	private Label lblPublikationName = new Label("Name: ");
	private TextBox txtPublikationName = new TextBox();
	
	private Label lblPublikationJahr = new Label("Jahr: ");
	private TextBox txtPublikationJahr = new TextBox();
	
	private Label lblPublikationTitel = new Label("Titel: ");
	private TextBox txtPublikationTitel = new TextBox();
	
	private Label lblPublikationOrt = new Label("Ort: ");
	private TextBox txtPublikationOrt = new TextBox();
	
	public Button addPublikationButton = new Button("Publikation hinzufügen (+)");
	
	//Flex Table Publikationen
	private FlexTable publikationFlexTable = new FlexTable();
	private ArrayList<String> arrPublikationTitel = new ArrayList<String>();
	
	private final SaveDataServiceAsync saveDataService = GWT.create(SaveDataService.class);
	
	public PublicationView() {
		//Create Table for publikationen
//		publikationFlexTable.setText(0, 0, " Name des/der Autors/Autorin ");
//		publikationFlexTable.setText(0, 1, " Jahr der Publikation ");
//		publikationFlexTable.setText(0, 2, " Titel des Buchs/Artikels/Beitrags ");
//		publikationFlexTable.setText(0, 3, " Ort der Veröffentlichung ");
		
		//Create 2nd question
		
		
		leftVerticalPanel.add(lblPublikationName);
		leftVerticalPanel.add(txtPublikationName);
		leftVerticalPanel.add(lblPublikationJahr);
		leftVerticalPanel.add(txtPublikationJahr);
		leftVerticalPanel.add(lblPublikationTitel);
		leftVerticalPanel.add(txtPublikationTitel);
		leftVerticalPanel.add(lblPublikationOrt);
		leftVerticalPanel.add(txtPublikationOrt);
		leftVerticalPanel.add(addPublikationButton);
		rightVerticalPanel.add(publikationFlexTable);
		
		horizontalPanel.add(leftVerticalPanel);
		horizontalPanel.add(rightVerticalPanel);
		mainPanel.add(horizontalPanel);
	}
	public void addPublication() {
		final String publikationName = txtPublikationName.getText();
		final String publikationJahr = txtPublikationJahr.getText();
		final String publikationTitel = txtPublikationTitel.getText();
		final String publikationOrt = txtPublikationOrt.getText();
		
		if(publikationName == null || publikationName.length() == 0) {
			Window.alert("Bitte geben Sie einen Publikationsnamen ein!");
			return;
		}
		txtPublikationName.setFocus(true);
		
		//check duplicate
		if(arrPublikationTitel.contains(publikationTitel)) {
			return;
		}
		
		int row = publikationFlexTable.getRowCount();
		arrPublikationTitel.add(publikationTitel);
		
		publikationFlexTable.setText(row, 0, publikationName);
		publikationFlexTable.setText(row,1,publikationJahr);
		publikationFlexTable.setText(row,2,publikationTitel);
		publikationFlexTable.setText(row, 3, publikationOrt);
		
		
		addPublication(publikationName, publikationJahr,publikationTitel, publikationOrt);
		
		//remove button
		Button removePublikationButton = new Button("X");
		removePublikationButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				int removedIndex = arrPublikationTitel.indexOf(publikationTitel);
				arrPublikationTitel.remove(removedIndex);
				publikationFlexTable.removeRow(removedIndex + 1);
			}
		});
		
		publikationFlexTable.setWidget(row, 4, removePublikationButton);
		
	}
	
	
	public void addPublication(String autor, String jahr, String titel, String ort) {
		saveDataService.addPublication(autor, jahr, titel, ort, new AsyncCallback<Void>() {

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
