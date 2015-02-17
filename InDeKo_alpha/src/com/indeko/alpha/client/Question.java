//package com.indeko.alpha.client;
//
//import java.util.ArrayList;
//
//import com.google.gwt.user.client.Window;
//import com.google.gwt.user.client.ui.Button;
//import com.google.gwt.user.client.ui.FlexTable;
//import com.google.gwt.user.client.ui.HTML;
//import com.google.gwt.user.client.ui.HorizontalPanel;
//import com.google.gwt.user.client.ui.Label;
//import com.google.gwt.user.client.ui.TextBox;
//import com.google.gwt.user.client.ui.VerticalPanel;
//
//public class Question {
//	
//	private VerticalPanel question1Panel = new VerticalPanel();
//
//	private HorizontalPanel question1HorizontalPanel = new HorizontalPanel();
//	private VerticalPanel question1VerticalPanel_left = new VerticalPanel();
//	private VerticalPanel question1VerticalPanel_right = new VerticalPanel();
//	
//	private Label question1 = new Label();
//	private Label helpTextQuestion1 = new Label();
//	
//	//Veranstaltungen
//		private Label lblVeranstaltungName = new Label();
//		private TextBox txtVeranstaltungsName = new TextBox();
//		
//		private Label lblVeranstaltungTitel = new Label();
//		private TextBox txtVeranstaltungsTitel = new TextBox();
//		
//		private Label lblVeranstaltungsOrt = new Label();
//		private TextBox txtVeranstaltungsOrt = new TextBox();
//		
//		private Label lblVeranstaltungsDatum = new Label();
//		private TextBox txtVeranstaltungsDatum = new TextBox();
//		
//		private Label lblVeranstatlungWeitereInfo = new Label();
//		private TextBox txtVeranstaltungWeitereInfo = new TextBox();
//		
//		private Button addVeranstaltungButton = new Button("Veranstaltung hinzufügen (+)");
//		
//		
//	
//		
//		//Question 2
//		private VerticalPanel question2Panel = new VerticalPanel();
//		
//		private HorizontalPanel question2HorizontalPanel = new HorizontalPanel();
//		private VerticalPanel question2VerticalPanel_left = new VerticalPanel();
//		private VerticalPanel question2VerticalPanel_right = new VerticalPanel();
//		
//		private Label question2 = new Label();
//		private Label helpTextQuestion2 = new Label();
//		
//		//Publikationen
//		private Label lblPublikationName = new Label();
//		private TextBox txtPublikationName = new TextBox();
//		
//		private Label lblPublikationJahr = new Label();
//		private TextBox txtPublikationJahr = new TextBox();
//		
//		private Label lblPublikationTitel = new Label();
//		private TextBox txtPublikationTitel = new TextBox();
//		
//		private Label lblPublikationOrt = new Label();
//		private TextBox txtPublikationOrt = new TextBox();
//		
//		//Flex Table Publikationen
//		private FlexTable publikationFlexTable = new FlexTable();
//		private ArrayList<String> arrPublikationTitel = new ArrayList<String>();
//		
//		private Button addPublikationButton = new Button("Publikation hinzufügen (+)");
//		
//		
//		//Question3
//		private VerticalPanel question3Panel = new VerticalPanel();
//		private Button addZeitschriftButton = new Button("Zeitschrift hinzufügen (+)");
//		private Label question3 = new Label();
//		private HorizontalPanel question3HorizontalPanel = new HorizontalPanel();
//		private VerticalPanel question3VerticalPanel_left = new VerticalPanel();
//		private VerticalPanel question3VerticalPanel_right = new VerticalPanel();
//		
//		private Label lblZeitschrift = new Label();
//		private TextBox txtZeitschrift = new TextBox();
//		
//		//FlexTable Zeitschriften
//		private FlexTable zeitschriftFlexTable = new FlexTable();
//		private ArrayList<String> arrZeitschriftTitel = new ArrayList<String>();
//		
//		
//		/**
//		 * Methode erzeugt Frage 1 und gibt diese ueber ein 
//		 * @return VerticalPanel zurueck
//		 */
//		public VerticalPanel createQuestion1() {
//		veranstaltungFlexTable.setText(0, 0, "Name");
//		veranstaltungFlexTable.setText(0, 1, "Titel");
//		veranstaltungFlexTable.setText(0, 2, "Ort");
//		veranstaltungFlexTable.setText(0, 3, "Datum");
//		veranstaltungFlexTable.setText(0, 4, "Infos");
//		
//		//Create first question
//				question1.setText("Auf welche Veranstaltung möchten Sie uns und andere Verbünde "
//						+ "im Forschungsschwerpunkt bereits jetzt hinweisen");
//				helpTextQuestion1.setText("Bitte geben Sie den Namen der Veranstaltung, das Thema (Titel), den Ort, das Datum"
//						+ "und ggf. einen Link zu weiteren Informationen.");
//				
//				
//				//Question 1
//				//Vertical Panel
//				question1VerticalPanel_left.add(lblVeranstaltungName);
//				question1VerticalPanel_left.add(txtVeranstaltungsName);
//				question1VerticalPanel_left.add(lblVeranstaltungTitel);
//				question1VerticalPanel_left.add(txtVeranstaltungsTitel);
//				question1VerticalPanel_left.add(lblVeranstaltungsOrt);
//				question1VerticalPanel_left.add(txtVeranstaltungsOrt);
//				question1VerticalPanel_left.add(lblVeranstaltungsDatum);
//				question1VerticalPanel_left.add(txtVeranstaltungsDatum);
//				question1VerticalPanel_left.add(lblVeranstatlungWeitereInfo);
//				question1VerticalPanel_left.add(txtVeranstaltungWeitereInfo);
//				question1VerticalPanel_left.add(addVeranstaltungButton);
//				question1VerticalPanel_right.add(veranstaltungFlexTable);
//				//Horizontal Panel
//				question1HorizontalPanel.add(question1VerticalPanel_left);
//				question1HorizontalPanel.add(question1VerticalPanel_right);
//				
//				question1Panel.add(question1);
//				question1Panel.add(helpTextQuestion1);
//				question1Panel.add(question1HorizontalPanel);
//				
//				return question1Panel;
//				
//	}
//
//
//		public VerticalPanel createQuestion2() {
//			//Create Table for publikationen
//			publikationFlexTable.setText(0, 0, "Name der Autor/Autorin");
//			publikationFlexTable.setText(0, 1, "Jahr der Publikation");
//			publikationFlexTable.setText(0, 2, "Titel des Buchs/Artikels/Beitrags");
//			publikationFlexTable.setText(0, 3, "Ort der Veröffentlichung");
//			
//			//Create 2nd question
//			question2.setText("Gibt es bereits Publikationen (von Ihnen oder Anderen) auf die Sie aufmerksam machen möchten?");
//			helpTextQuestion2.setText("Bitte geben Sie den Namen der Autoren/Autorin, das Jahr, den Titel des Buches/Artikels/Beitrags und wo es veröffentlicht wurde.");
//			
//			question2VerticalPanel_left.add(lblPublikationName);
//			question2VerticalPanel_left.add(txtPublikationName);
//			question2VerticalPanel_left.add(lblPublikationJahr);
//			question2VerticalPanel_left.add(txtPublikationJahr);
//			question2VerticalPanel_left.add(lblPublikationTitel);
//			question2VerticalPanel_left.add(txtPublikationTitel);
//			question2VerticalPanel_left.add(lblPublikationOrt);
//			question2VerticalPanel_left.add(txtPublikationOrt);
//			question2VerticalPanel_left.add(addPublikationButton);
//			question2VerticalPanel_right.add(publikationFlexTable);
//			
//			question2HorizontalPanel.add(question2VerticalPanel_left);
//			question2HorizontalPanel.add(question2VerticalPanel_right);
//			question2Panel.add(question2HorizontalPanel);
//			
//			return question2Panel;
//			
//		}
//		
//		public VerticalPanel createQuestion3() {
//			lblZeitschrift.setText("Zeitschrift:");
//			//Create Table for Zeitschrift
//			zeitschriftFlexTable.setText(0, 0, "Titel der Zeitschrift");
//			question3.setText("Welche Zeitschriften würden Sie für den Bereich des Kompetenzmanagements zum Lesen und Publizieren empfehlen?");
//			
//			question3VerticalPanel_left.add(lblZeitschrift);
//			question3VerticalPanel_left.add(txtZeitschrift);
//			question3VerticalPanel_left.add(addZeitschriftButton);
//			question3VerticalPanel_right.add(zeitschriftFlexTable);
//			
//			question3HorizontalPanel.add(question3VerticalPanel_left);
//			question3HorizontalPanel.add(question3VerticalPanel_right);
//			
//			question3Panel.add(question3HorizontalPanel);
//			
//			return question3Panel;
//			
//		}
//		
//		//TODO auslagern
//		public HTML checkAdditionalInfo(String additionalInfo) {
//			if (additionalInfo.contains("www")) {
//				//TODO change Text to Hyperlink
//				
//				String linkText = "<a href=\"" + additionalInfo + "\" target=\"_blank\">" + additionalInfo + "</a>";
//				Window.alert(linkText);
//				HTML link = new HTML(linkText);
//				
//				return link;
//				
//				
//			}
//			return null;
//		}
//}