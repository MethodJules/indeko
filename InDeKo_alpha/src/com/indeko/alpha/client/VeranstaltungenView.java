package com.indeko.alpha.client;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;


public class VeranstaltungenView extends Composite {
	
	
	
	
	/** Main panel of the function view **/
	private VerticalPanel mainPanel = new VerticalPanel();
	
	/**Main horizontal panel of the function view **/
	private HorizontalPanel horizontalPanel = new HorizontalPanel();
	
	/** Left vertical panel of the function view **/
	private VerticalPanel leftVerticalPanel = new VerticalPanel();
	
	/** Right vertical panel of the function view **/
	private VerticalPanel rightVerticalPanel = new VerticalPanel();
	
	/** Horizontal Panel for Name **/
	private HorizontalPanel nameHorizontalPanel = new HorizontalPanel();
	
	/** Horizontal Panel for Titel **/
	private HorizontalPanel titleHorizontalPanel = new HorizontalPanel();
	
	/** Horizontal Panel for Ort **/
	private HorizontalPanel ortHorizontalPanel = new HorizontalPanel();
	
	/** Horizontal Panel for Datum **/
	private HorizontalPanel datumHorizontalPanel = new HorizontalPanel();
	
	/** Horizontal Panel for Datum **/
	private HorizontalPanel infoHorizontalPanel = new HorizontalPanel();
	
	//elements in left vertical panel
	
	
	private Label lblVeranstaltungName = new Label(" Name: ");
	private TextBox txtVeranstaltungsName = new TextBox();
	
	private Label lblVeranstaltungTitel = new Label(" Titel: ");
	private TextBox txtVeranstaltungsTitel = new TextBox();
	
	private Label lblVeranstaltungsOrt = new Label(" Ort: ");
	private TextBox txtVeranstaltungsOrt = new TextBox();
	
	private Label lblVeranstaltungsDatum = new Label(" Datum: ");
	private TextBox txtVeranstaltungsDatum = new TextBox();
	
	private Label lblVeranstatlungWeitereInfo = new Label(" Weitere Informationen: ");
	private TextBox txtVeranstaltungWeitereInfo = new TextBox();
	
	Button addVeranstaltungButton = new Button("Veranstaltung hinzufügen (+)");
	
	private DateBox dateVeranstaltung = new DateBox();
	
	String breakHTMLCode = "<br/>";
	private HTMLPanel breakHTML = new HTMLPanel(breakHTMLCode); 
	
	//Flex Table Veranstaltung
	private FlexTable veranstaltungFlexTable = new FlexTable();
	private ArrayList<String> arrVeranstaltungenName = new ArrayList<String>();
	
	
	private final SaveDataServiceAsync saveDataService = GWT.create(SaveDataService.class);
	
	
	public VeranstaltungenView() {

		
	
		
//		veranstaltungFlexTable.setText(0, 0, "Name");
//		veranstaltungFlexTable.setText(0, 1, "Titel");
//		veranstaltungFlexTable.setText(0, 2, "Ort");
//		veranstaltungFlexTable.setText(0, 3, "Datum");
//		veranstaltungFlexTable.setText(0, 4, "Infos");
		
//		veranstaltungFlexTable.setText(0, 0, "");
//		veranstaltungFlexTable.setText(0, 1, "");
//		veranstaltungFlexTable.setText(0, 2, "");
//		veranstaltungFlexTable.setText(0, 3, "");
//		veranstaltungFlexTable.setText(0, 4, "");
		
		
		

		
		
		leftVerticalPanel.add(lblVeranstaltungName);
		leftVerticalPanel.add(txtVeranstaltungsName);

//		titleHorizontalPanel.add(lblVeranstaltungTitel);
//		titleHorizontalPanel.add(txtVeranstaltungsTitel);
//		leftVerticalPanel.add(titleHorizontalPanel);
		leftVerticalPanel.add(lblVeranstaltungTitel);
		leftVerticalPanel.add(txtVeranstaltungsTitel);
		
//		ortHorizontalPanel.add(lblVeranstaltungsOrt);
//		ortHorizontalPanel.add(txtVeranstaltungsOrt);
//		leftVerticalPanel.add(ortHorizontalPanel);
		leftVerticalPanel.add(lblVeranstaltungsOrt);
		leftVerticalPanel.add(txtVeranstaltungsOrt);
		
		
		
//		datumHorizontalPanel.add(lblVeranstaltungsDatum);
//		datumHorizontalPanel.add(txtVeranstaltungsDatum);
//		leftVerticalPanel.add(datumHorizontalPanel);
		leftVerticalPanel.add(lblVeranstaltungsDatum);
		//leftVerticalPanel.add(txtVeranstaltungsDatum);
		dateVeranstaltung.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getShortDateFormat()));
		leftVerticalPanel.add(dateVeranstaltung);
		
		
//		infoHorizontalPanel.add(lblVeranstatlungWeitereInfo);
//		infoHorizontalPanel.add(txtVeranstaltungWeitereInfo);

		leftVerticalPanel.add(lblVeranstatlungWeitereInfo);
		leftVerticalPanel.add(txtVeranstaltungWeitereInfo);
		
		
		
		
		rightVerticalPanel.add(veranstaltungFlexTable);
		
		horizontalPanel.add(leftVerticalPanel);
		horizontalPanel.add(rightVerticalPanel);
		
		mainPanel.add(horizontalPanel);
		//mainPanel.add(breakHTML);
		mainPanel.add(addVeranstaltungButton);
		
	
	}
	
	void addVeranstaltung() {
		if (dateVeranstaltung.getValue() == null) {
			Window.alert("Bitte geben Sie ein Datum ein!");
			return;
		}
		
		//adding veranstaltung
		final String veranstaltungsName = txtVeranstaltungsName.getText();
		final String veranstaltungsTitel = txtVeranstaltungsTitel.getText();
		final String veranstaltungsOrt = txtVeranstaltungsOrt.getText();
		//final String veranstaltungsDatum = txtVeranstaltungsDatum.getText();
		final Date veranstaltungsDate = dateVeranstaltung.getValue();
		final String veranstaltungsDatum = dateVeranstaltung.getValue().toString();
		final String veranstaltungsInfo = txtVeranstaltungWeitereInfo.getText();
		
		txtVeranstaltungsName.setFocus(true);
		
		if(veranstaltungsName == null || veranstaltungsName.length() == 0){
			Window.alert("Bitte geben Sie einen Veranstaltungsnamen ein!");
			return;
		}
		
		
		
		if(arrVeranstaltungenName.contains(veranstaltungsName)) {
			return;
		}
		
		int row = veranstaltungFlexTable.getRowCount();
		arrVeranstaltungenName.add(veranstaltungsName); //TODO erweitern
		veranstaltungFlexTable.setText(row, 0, veranstaltungsName);
		veranstaltungFlexTable.setText(row, 1, veranstaltungsTitel);
		veranstaltungFlexTable.setText(row, 2, veranstaltungsOrt);
		veranstaltungFlexTable.setText(row, 3, veranstaltungsDatum);
		veranstaltungFlexTable.setText(row, 4, veranstaltungsInfo);
		
		addVeranstaltung(veranstaltungsName,  veranstaltungsTitel, 
			 veranstaltungsOrt,  veranstaltungsDate,  veranstaltungsInfo);
		
		
		//Add a remove Button
		Button removeVeranstaltungButton = new Button("X");
		removeVeranstaltungButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				int removedIndex = arrVeranstaltungenName.indexOf(veranstaltungsName);
				arrVeranstaltungenName.remove(removedIndex);
				veranstaltungFlexTable.removeRow(removedIndex + 1);
			}
		});
		
		veranstaltungFlexTable.setWidget(row, 5, removeVeranstaltungButton);
		
		
		
	}
	
	private void addVeranstaltung(String veranstaltungsName, String veranstaltungsTitel, 
			String veranstaltungsOrt, Date veranstaltungsDate, String weitereInfo) {
		saveDataService.addVeranstaltung(veranstaltungsName, veranstaltungsTitel, 
				veranstaltungsOrt, veranstaltungsDate, weitereInfo, new AsyncCallback<Void>() {
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			
			public void onSuccess(Void result) {
				// TODO Auto-generated method stub
				//Window.alert("Gespeichert");
			}
		});
	}
		
		
		
		
	public VerticalPanel getMainPanel() {
		return mainPanel;
	}
		
}
