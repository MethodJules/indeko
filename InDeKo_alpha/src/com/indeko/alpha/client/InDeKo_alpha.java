package com.indeko.alpha.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
//import com.google.gwt.core.shared.GWT;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;



public class InDeKo_alpha implements EntryPoint {
	
	
	//Instanziiere Verbundprojekt Obejekt
	private Verbundprojekt verbundProjekt = new Verbundprojekt();
	
	//Kennen der praeview
	private RadioButton rb5_1 = new RadioButton("Q5_group","Ja");
	private RadioButton rb5_2 = new RadioButton("Q5_group","Nein");
	
	//Verbundprojekt
	private TextBox txtVerbundProjekt = new TextBox();
	
	//GfA Kongress 
	private RadioButton rb8_1 = new RadioButton("Q8_group","Ja, ich nehme am Frühjahrskongress teil.");
	private RadioButton rb8_2 = new RadioButton("Q8_group","Nein, ich nehme nicht am Frühjahrskongress teil.");
	private RadioButton rb8_3 = new RadioButton("Q8_1_group","Ja, ich nehme am Herbstskongress teil.");
	private RadioButton rb8_4 = new RadioButton("Q8_1_group","Nein, ich nehme nicht am Herbstkongress teil.");
	
	private RadioButton rb9_1 = new RadioButton("Q9_group","Ich nehme als TeilnehmerIn am Frühjahrskongress teil.");
	private RadioButton rb9_2 = new RadioButton("Q9_group","Ich nehme als ReferentIn am Frühjahrskongress teil.");
	private RadioButton rb9_3 = new RadioButton("Q9_1_group","Ich nehme als TeilnehmerIn am Herbstskongress teil.");
	private RadioButton rb9_4 = new RadioButton("Q9_1_group","Ich nehme als ReferentIn am Herbstkongress teil.");
	
	//BCC tagung
	private RadioButton rb10_1 = new RadioButton("Q10_group","Ja, ich nehme an der Dienstleistungstagung teil.");
	private RadioButton rb10_2 = new RadioButton("Q10_group","Nein, ich nehme nicht an der Dienstleistungstagung teil.");
	
	private RadioButton rb11_1 = new RadioButton("Q11_group", "Ich nehme als TeilnehmerIn an der Dienstleistungstagung teil.");
	private RadioButton rb11_2 = new RadioButton("Q11_group", "Ich nehme als ReferentIn an der Dienstleistungstagung teil.");
	
	//A+A  Tagung
	private RadioButton rb12_1 = new RadioButton("Q12_group","Ja, ich nehme an dem A+A Kongress teil.");
	private RadioButton rb12_2 = new RadioButton("Q12_group","Nein, ich nehme nicht an dem A+A Kongress teil.");
	
	private RadioButton rb13_1 = new RadioButton("Q13_group", "Ich nehme als TeilnehmerIn an dem A+A Kongress teil.");
	private RadioButton rb13_2 = new RadioButton("Q13_group", "Ich nehme als ReferentIn an dem A+A Kongress teil.");
	
	private FlowPanel content = new FlowPanel();
	private FlowPanel footer = new FlowPanel();
	private FlowPanel header = new FlowPanel();
	
	//Anmerkungen
	private TextArea textAreaAnmerkungen = new TextArea();
	
	//Danke
	
	private Label thankYou = new Label("Herzlichen Dank für Ihre Teilnahme! "
			+ "Die gesammelten Informationen erhalten Sie von uns bis Ende Februar.");
	//Test database
	private VerticalPanel helpPanel = new VerticalPanel();

	
	private String introTextHTML = "<p id=\"intro\">Mit diesem Service erhalten Sie von uns die aktuellsten News über Veranstaltungen, Publikationen und andere wichtige "
			+ "Informationen zum Forschungsschwerpunkt &bdquo;Betriebliches Kompetenzmanagement im demografischen Wandel.&rdquo; "
			+ "Zukünftig können Sie über News.Navi diese Informationen auf unserem gemeinsamen Forschungsportal selbst einstellen. "
			+ "Für den Start unseres Services benötigen wir an dieser Stelle Ihre Unterstützung, "
			+ "indem Sie bitte die folgenden Fragen beantworten. "
			+ "Dies nimmt nicht mehr als ein paar Minuten in Anspruch. "
			+ "Die gesammelten Informationen lassen wir Ihnen gerne zukommen, "
			+ "damit Sie sich auf den entsprechenden Veranstaltungen vernetzen können.<br/><br/>Ihr InDeKo.Navi-Team</p>";
	private HTMLPanel htmlPanel = new HTMLPanel(introTextHTML);
	
	
	
	
	private VeranstaltungenView veranstaltungenView = new VeranstaltungenView();
	private PublicationView publicationView = new PublicationView();
	private ZeitschriftenView zeitschriftenView = new ZeitschriftenView();

	
	
	private FooterView footerView = new FooterView();
	private HeaderView headerView = new HeaderView();
	private QuestionCounter questionCounter = new QuestionCounter(0);

	private final SaveDataServiceAsync saveDataService = GWT.create(SaveDataService.class);



	public void onModuleLoad() {
		

		
		System.out.println(GWT.getModuleBaseURL());
		System.out.println("Counter -> " + questionCounter);
		
		
		
		setContent(questionCounter.getQuestionCounter());
	
		
		
		
		this.footerView.weiterButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				footerView.weiter(questionCounter);
				
				setContent(questionCounter.getQuestionCounter()); 
			}
		});
		
		this.footerView.zurueckButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				footerView.zurueck(questionCounter);
				setContent(questionCounter.getQuestionCounter());
			}
		});
		
		
		//Listen for mouse events on the hinzufuegen button
		veranstaltungenView.addVeranstaltungButton.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						veranstaltungenView.addVeranstaltung();
						
					}
				});
		
		publicationView.addPublikationButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				publicationView.addPublication();
			}
		});
		
		zeitschriftenView.addZeitschriftButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				zeitschriftenView.addZeitschrift();
			}
		});

		
		
	}
	
	private void saveVerbundProjekt(final Verbundprojekt verbunProjekt) {
		//TODO saveDataService auf Verbundprojekt implementieren
	}
	
	
	private void saveData(final String data) {
		saveDataService.saveData(data, new AsyncCallback<Void>() {

			
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			
			public void onSuccess(Void result) {
				// TODO Auto-generated method stub
				Window.alert("Gespeichert");
			}
			
		});
	}
	
	
	public void setContent(int questionCounter) {
		switch(questionCounter){
		case 0:
			System.out.println("Status ist 0!!!");
			header.clear();
			
			content.clear();
			//content.add(veranstaltungenView.getMainPanel());
			
			
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			
		
			//RootPanel.get("header").add(header);
			RootPanel.get("intro_text").add(htmlPanel);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			//RootPanel.get("test").add(testPanel);
			break;
		case 1:
			//Veranstaltung
			RootPanel.get("intro_text").clear();
			System.out.println("case 1");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter)); 
			
			content.clear();
			content.add(veranstaltungenView.getMainPanel());
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 2:
			//Publikation
			System.out.println("case 2");
			//header.clear();
			header.add(headerView.setHeaderContent(questionCounter)); 
			
			
			content.clear();
			content.add(publicationView.getMainPanel());
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
			
		case 3:
			//Zeitschrift
			System.out.println("case 3");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			content.add(zeitschriftenView.getMainPanel());
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 4:
			//Kennen Sie die Praeview?
			System.out.println("case 4");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			
			
			helpPanel.clear();
			helpPanel.add(rb5_1);
			helpPanel.add(rb5_2);
			content.add(helpPanel);
			
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 5:
			final boolean answer_praeview_ja = rb5_1.getValue();
			final boolean answer_praeview_nein = rb5_2.getValue();
			
			System.out.println(answer_praeview_ja);
			System.out.println(answer_praeview_nein);
			verbundProjekt.setPreaview_bekannt(answer_praeview_ja);
			//EinleitungsText
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			
			
			
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 6:
			
		
			//Verbundprojekt
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(txtVerbundProjekt);
			content.add(helpPanel);
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 7:
			
			
			final String answer = txtVerbundProjekt.getText();
			System.out.println(answer);
			verbundProjekt.setName(answer);
			
			System.out.println("case 7");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(rb8_1);
			helpPanel.add(rb8_2);
			helpPanel.add(rb8_3);
			helpPanel.add(rb8_4);
			content.add(helpPanel);
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 8:
			final boolean answer_gfa_f_ja = rb8_1.getValue();
			final boolean answer_gfa_f_nein = rb8_2.getValue();
			final boolean answer_gfa_h_ja = rb8_3.getValue();
			final boolean answer_gfa_h_nein = rb8_4.getValue();
			//TODO wegspeichern
			System.out.println(answer_gfa_f_ja);
			System.out.println(answer_gfa_f_nein);
			System.out.println(answer_gfa_h_ja);
			System.out.println(answer_gfa_h_nein);
			verbundProjekt.setAnswer_gfa_f_ja(answer_gfa_f_ja);
			verbundProjekt.setAnswer_gfa_h_ja(answer_gfa_h_ja);
			
			
			System.out.println("case 8");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(rb9_1);
			helpPanel.add(rb9_2);
			helpPanel.add(rb9_3);
			helpPanel.add(rb9_4);
			content.add(helpPanel);
			
			
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 9:
			final boolean answer_gfa_f_teilnehmer = rb9_1.getValue();
			final boolean answer_gfa_f_referent = rb9_2.getValue();
			final boolean answer_gfa_h_teilnehmer = rb9_3.getValue();
			final boolean answer_gfa_h_referent = rb9_4.getValue();
			
			System.out.println(answer_gfa_f_teilnehmer);
			System.out.println(answer_gfa_f_referent);
			System.out.println(answer_gfa_h_teilnehmer);
			System.out.println(answer_gfa_h_referent);
			verbundProjekt.setAnswer_gfa_f_teilnehmer(answer_gfa_f_teilnehmer);
			verbundProjekt.setAnswer_gfa_f_referent(answer_gfa_f_referent);
			verbundProjekt.setAnswer_gfa_h_teilnehmer(answer_gfa_h_teilnehmer);
			verbundProjekt.setAnswer_gfa_h_referent(answer_gfa_h_referent);
			
			System.out.println("case 9");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(rb10_1);
			helpPanel.add(rb10_2);
			content.add(helpPanel);
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 10:
			//TODO wegspeichern
			final boolean answer_bcc_ja = rb10_1.getValue();
			final boolean answer_bcc_nein = rb10_2.getValue();
			
			System.out.println(answer_bcc_ja);
			System.out.println(answer_bcc_nein);
			verbundProjekt.setAnswer_bcc_ja(answer_bcc_ja);
			
			System.out.println("case 10");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(rb11_1);
			helpPanel.add(rb11_2);
			content.add(helpPanel);
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 11:
			//TODO wegspeichern
			final boolean answer_bcc_teilnehmer = rb11_1.getValue();
			final boolean answer_bcc_referent = rb11_2.getValue();
			System.out.println(answer_bcc_teilnehmer);
			System.out.println(answer_bcc_referent);
			verbundProjekt.setAnswer_bcc_teilnehmer(answer_bcc_teilnehmer);
			verbundProjekt.setAnswer_bcc_referent(answer_bcc_referent);
			
			System.out.println("case 11");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(rb12_1);
			helpPanel.add(rb12_2);
			content.add(helpPanel);
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 12:
			
			final boolean answer_aplusa_ja = rb12_1.getValue();
			final boolean answer_aplus_nein = rb12_2.getValue();
			
			verbundProjekt.setAnswer_aplusa_ja(answer_aplusa_ja);
			System.out.println(answer_aplusa_ja);
			System.out.println(answer_aplus_nein);
			System.out.println("case 12");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(rb13_1);
			helpPanel.add(rb13_2);
			content.add(helpPanel);
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 13:
			final boolean answer_aplusa_teilnehmer = rb13_1.getValue();
			final boolean answer_aplusa_referent = rb13_2.getValue();
			
			verbundProjekt.setAnswer_aplusa_teilnehmer(answer_aplusa_teilnehmer);
			verbundProjekt.setAnswer_aplusa_referent(answer_aplusa_referent);
			System.out.println(answer_aplusa_teilnehmer);
			System.out.println(answer_aplusa_referent);
			System.out.println("case 13");
			header.clear();
			header.add(headerView.setHeaderContent(questionCounter));
			
			content.clear();
			helpPanel.clear();
			
			helpPanel.add(textAreaAnmerkungen);
			content.add(helpPanel);
			
			footer.clear();
			footer.add(footerView.getFooterPanel());
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		case 14:
			String anmerkungen = textAreaAnmerkungen.getText();
			verbundProjekt.setAnmerkungen(anmerkungen);
			saveDataService.addVerbundprojekt(verbundProjekt, new AsyncCallback<Void>() {
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
				public void onSuccess(Void result) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			System.out.println("case 14");
			header.clear();
			
			content.clear();
			helpPanel.clear();
			helpPanel.add(thankYou);
			content.add(helpPanel);
			
			footer.clear();
			
			
			RootPanel.get("header").add(header);
			RootPanel.get("content").add(content);
			RootPanel.get("footer").add(footer);
			break;
		default:
			System.out.println("switch-case-default...");
				
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}