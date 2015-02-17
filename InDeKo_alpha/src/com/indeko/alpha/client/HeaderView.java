package com.indeko.alpha.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HeaderView extends Composite {
	VerticalPanel mainPanel = new VerticalPanel();
	
	
	/**Intro  **/
	private Label introText = new Label("Um Austauschprozesse und Vernetzung unter den Verbünden bei einschlägigen Veranstaltungen "
			+ "anzustoßen, würden wir Ihnen gerne eine (vorläufige) Teilnahmeliste zu den 3 großen "
			+ "Veranstaltungen diesen Jahres zur Verfügung stellen. "
			+ "Dafür benötigen wir die folgenden Informationen von Ihnen.");
	/** Question 1 **/
	private Label question1 = new Label();
	private Label helpTextQuestion1 = new Label();
	
	
	/** Question 2 **/
	private Label question2 = new Label();
	private Label helpTextQuestion2 = new Label();
	
	/** Question 3 **/
	private Label question3 = new Label();
	
	/** Question 4 **/
	private Label question4 = new Label();
	
	/** Question 5 **/
	private Label question5 = new Label();
	
	/** Question 6 **/
	private Label question6 = new Label();
	private Label helpTextQuestion6 = new Label();
	private Label helpTextQuestion6_1 = new Label();
	
	/** Question 7 **/
	private Label question7 = new Label();
	
	/** Question 8 **/
	private Label question8 = new Label();
	private Label helpTextQuestion8 = new Label();
	
	/** Question 9 **/
	private Label question9 = new Label();
	
	/** Question 10 **/
	private Label question10 = new Label();
	private Label helpTextQuestion10 = new Label();
	
	/** Question 11 **/
	private Label question11 = new Label();
	
	/** Question 12 **/
	private Label question12 = new Label();
	
	/** Thank You **/
	private Label thankYou = new Label();
	
	Verbundprojekt verbundprojekt = new Verbundprojekt();
	
	private String praeviewHTML ="Infos zur <a href=\"http://www.zeitschrift-praeview.de/\" target=\"_blank\">PRAEVIEW</a>.<br/>";
	private HTMLPanel htmlPanelPraeview = new HTMLPanel(praeviewHTML);
	
	//private String gfaFruehjahrHTML ="<a href=\"http://www.gesellschaft-fuer-arbeitswissenschaft.de/veranstaltungen_fruehjahrskongresse-gesellschaft-fuer-arbeitswissenschaft-gfa.htm/\" target=\"_blank\">GfA Frühjahrskongress</a><br/>";
	//private HTMLPanel htmlGfaFruehjahr = new HTMLPanel(gfaFruehjahrHTML);
	
	private String gfaFruehjahrHTML ="Der <a href=\"http://www.gesellschaft-fuer-arbeitswissenschaft.de/veranstaltungen_fruehjahrskongresse-gesellschaft-fuer-arbeitswissenschaft-gfa.htm/\" target=\"_blank\">Frühjahrskongress</a> der GfA findet am 25.-27.02.2015 in Karlsruhe zu "
				+ "dem Thema &bdquo;VerANTWORTung für die Arbeit der Zukunft&rdquo; statt. <br/>";
	private HTMLPanel htmlGfaFruehjahr = new HTMLPanel(gfaFruehjahrHTML);
	
	
	private String gfaHerbstHTML ="Die <a href=\"http://www.gesellschaft-fuer-arbeitswissenschaft.de/veranstaltungen_herbstkonferenzen-gesellschaft-fuer-arbeitswissenschaft-gfa.htm/\" target=\"_blank\">Herbstkonferenz</a> der GfA findet am 21.-22.09.2015 in Karlsruhe zu "
				+ "dem Thema &bdquo;Arbeitswissenschaft mit Interdisziplinarität und Methodenvielfalt&rdquo; statt. <br/>";
	private HTMLPanel htmlGfaHerbst = new HTMLPanel(gfaHerbstHTML);
	
	private String bmbfTagungHTML ="Die <a href=\"http://pt-ad.pt-dlr.de/de/1607.php\" target=\"_blank\">Fachtagung</a> findet am 28./29.05.2015 in Berlin im <a href=\"http://www.bcc-berlin.de\" target=\"_blank\">BCC</a> zum "
				+ "Thema &bdquo;Arbeit in der digitalisierten Welt&rdquo; statt.";
	private HTMLPanel htmlBmbfTagung = new HTMLPanel(bmbfTagungHTML);
	
	private String aplusaKongressHTML ="Die 34. internationale Fachmesse mit Kongress für Arbeitsschutz und Arbeitsmedizin<a href=\"http://www.aplusa.de/\" target=\"_blank\"> &bdquo;A+A Messe&rdquo;</a> "
				+ " findet vom 27.-30.10.2015 in Düsseldorf statt.";
	private HTMLPanel htmlAplusAKongress = new HTMLPanel(aplusaKongressHTML);
	
	
	
	
	public VerticalPanel setHeaderContent(int status) {
	switch(status){
	case 0:
		System.out.println(status);
		mainPanel.add(introText);
		return mainPanel;
	case 1:
		
		System.out.println("setHeader Status = " + status);
		question1.setText("Auf welche Veranstaltung möchten Sie uns und andere Verbünde "
				+ "im Forschungsschwerpunkt bereits jetzt hinweisen?");
		question1.addStyleName("content");
		helpTextQuestion1.setText("Bitte geben Sie den Namen der Veranstaltung, das Thema (Titel), den Ort, das Datum "
				+ "und ggf. einen Link zu weiteren Informationen ein.");
		
		mainPanel.clear();
		mainPanel.add(question1);
		mainPanel.add(helpTextQuestion1);
		
		
		break;

	case 2:
		System.out.println("setHeader Status = " + status);
		question2.setText("Gibt es bereits Publikationen (von Ihnen oder Anderen) auf die Sie aufmerksam machen möchten?");
		helpTextQuestion2.setText("Bitte geben Sie den Namen der Autoren/Autorinnen, das Jahr, "
				+ "den Titel des Buches/Artikels/Beitrags an und wo es veröffentlicht wurde.");
		
		mainPanel.clear();
		mainPanel.add(question2);
		mainPanel.add(helpTextQuestion2);
		
		
		break;
	
	
	case 3:
		question3.setText("Welche Zeitschriften würden Sie für den Bereich des Kompetenzmanagements "
				+ "zum Lesen und Publizieren empfehlen?");
		
		mainPanel.clear();
		mainPanel.add(question3);
		break;
	
	case 4:
		question4.setText("Kennen Sie z.B. die PRAEVIEW?");
		
		mainPanel.clear();
		mainPanel.add(question4);
		mainPanel.add(htmlPanelPraeview);

		break;
		
		
	case 5:
		mainPanel.clear();
		mainPanel.add(introText);
		break;
		
	case 6:
		question5.setText("Welches Verbundprojekt vertreten Sie?");
		
		mainPanel.clear();
		mainPanel.add(question5);
		

		break;
		
	case 7:
		question6.setText("Nehmen Sie an dem Kongress der Gesellschaft für Arbeitswissenschaft e.V. (GfA) teil?"); 
		helpTextQuestion6.setText("Der Frühjahrskongress der GfA findet am 25.-27.02. in Karlsruhe zu "
				+ "dem Thema \"VerANTWORTung für die Arbeit der Zukunft\" statt.");
		helpTextQuestion6_1.setText("Die Herbstkonferenz der GfA findet am 21.-22.09. in Karlsruhe zu "
				+ "dem Thema \"Arbeitswissenschaft mit Interdisziplinarität und Methodenvielfalt \" statt.");
		
		mainPanel.clear();
		mainPanel.add(question6);
		//mainPanel.add(helpTextQuestion6);
		mainPanel.add(htmlGfaFruehjahr);
		//mainPanel.add(helpTextQuestion6_1);
		mainPanel.add(htmlGfaHerbst);
		break;
		
	case 8:
		question7.setText("Nehmen Sie als TeilnehmerIn oder ReferentIn an der GfA teil?");
		mainPanel.clear();
		mainPanel.add(question7);
		break;
	case 9:
		question8.setText("Nehmen Sie an der Dienstleistungs-Tagung des Bundesministeriums für Bildung und Forschung (BMBF) teil?");
		helpTextQuestion8.setText("Die Tagung findet am 28./29.05 in Berlin im BCC (www.bcc-berlin.de) zum "
				+ "Thema \"Digitalisierung von Arbeit\" statt.");
		mainPanel.clear();
		mainPanel.add(question8);
		//mainPanel.add(helpTextQuestion8);
		mainPanel.add(htmlBmbfTagung);
		break;
	case 10:
		question9.setText("Nehmen Sie als TeilnehmerIn oder ReferentIn an der Dienstleistungs-Tagung teil?");
		mainPanel.clear();
		mainPanel.add(question9);
		break;
	case 11:
		question10.setText("Nehmen Sie an der A+A Fachmesse teil?");
//		helpTextQuestion10.setText("Der 34. internationale Kongress für Arbeitsschutz und Arbeitsmedizin "
//				+ "findet vom 27.-30.10. in Düsseldorf statt.");
		
		mainPanel.clear();
		mainPanel.add(question10);
		//mainPanel.add(helpTextQuestion10);
		mainPanel.add(htmlAplusAKongress);
		break;
	case 12:
		question11.setText("Nehmen Sie als TeilnehmerIn oder ReferentIn an der A+A-Tagung teil?");
		mainPanel.clear();
		mainPanel.add(question11);
		break;
	case 13:
		question12.setText("Falls Sie Anmerkungen oder ergänzende Fragen zu unserem News.Navi haben, "
				+ "können Sie dies gerne in dem folgenen Textfeld angeben. "
				+ "Wir freuen uns über Ideen und Rückmeldungen.");
		mainPanel.clear();
		mainPanel.add(question12);
		break;
	
		
	case 14:
		mainPanel.clear();
		break;
		
	}	
	return mainPanel;	
	}
}
