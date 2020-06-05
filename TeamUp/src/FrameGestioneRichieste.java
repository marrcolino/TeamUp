import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class FrameGestioneRichieste {
	
	private JFrame frame;
	
	private JLabel labelGestioneRichieste;
	private JLabel labelEmail;
	private JLabel labelCompetenze;
	private JLabel labelEmailVuoto;
	private JLabel labelCompetenzeVuoto;
	private JPanel pannello2;
	private JPanel pannello3;
	
	private JPanel pannello;
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem item1;
	private JMenuItem item2;
	
	private JButton bottoneAnnulla;
	private JButton bottoneAccettaRichiesta;
	private JButton bottoneRifiutaRichiesta;

	
	private JSeparator separatore1;
	private JSeparator separatore2;
	
	public FrameGestioneRichieste() {
		
		frame = new JFrame("Gestione Richieste");
		frame.setResizable(false);
		frame.setBounds(500, 150, 600, 500);
		frame.getContentPane().setBackground(java.awt.Color.orange);
		frame.getContentPane().setLayout(null);
		
		pannello = new JPanel();
		pannello.setBackground(java.awt.Color.cyan);
		pannello.setBounds(10, 64, 200, 299);
		
		pannello2 = new JPanel();
		pannello2.setLayout(new BoxLayout(pannello2, BoxLayout.Y_AXIS));
		pannello2.setBackground(java.awt.Color.cyan);
		pannello2.setBounds(220, 102, 150, 70);
		
		pannello3 = new JPanel();
		pannello3.setLayout(new BoxLayout(pannello3, BoxLayout.Y_AXIS));
		pannello3.setBackground(Color.WHITE);
		pannello3.setBounds(370, 102, 212, 70);
		
		
		// JLabel
		labelGestioneRichieste = new JLabel("Gestione Richieste");
		labelGestioneRichieste.setForeground(java.awt.Color.red);
		labelGestioneRichieste.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelGestioneRichieste.setBounds(197, -52, 251, 150);
		frame.getContentPane().add(labelGestioneRichieste);
		
		// JLabel
		labelEmail = new JLabel("Email");
		labelEmail.setForeground(java.awt.Color.BLACK);
		labelEmail.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelEmail.setBounds(215, 50, 251, 150);
		pannello2.add(labelEmail);
	    separatore1 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore1.setBounds(1, 80, 229, 20);
	    separatore1.setBackground(Color.black);
	    pannello2.add(separatore1);
		
		
		
		// JLabel
		labelEmailVuoto = new JLabel("Email Vuoto");
		labelEmailVuoto.setForeground(java.awt.Color.BLACK);
		labelEmailVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelEmail.setBounds(215, 50, 251, 150);
		pannello3.add(labelEmailVuoto);
	    separatore2 = new JSeparator(JSeparator.HORIZONTAL);
	    separatore2.setBounds(1, 80, 229, 20);
	    separatore2.setBackground(Color.black);
	    pannello3.add(separatore2);
	    
		labelCompetenzeVuoto = new JLabel("Competenze  Vuoto");
		labelCompetenzeVuoto.setForeground(java.awt.Color.BLACK);
		labelCompetenzeVuoto.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelCompetenzeVuoto.setBounds(197, -52, 251, 150);
		pannello3.add(labelCompetenzeVuoto);
		frame.getContentPane().add(pannello3);
		
		// JLabel
		labelCompetenze = new JLabel("Competenze");
		labelCompetenze.setForeground(java.awt.Color.BLACK);
		labelCompetenze.setFont(new Font("Helvetica", Font.BOLD, 22));
		labelCompetenze.setBounds(197, -52, 251, 150);
		pannello2.add(labelCompetenze);
		
		frame.getContentPane().add(pannello2);
		
		barraMenu = new JMenuBar();
		menu = new JMenu("Richieste Utenti");
		item1 = new JMenuItem("utente1234s");
		item2 = new JMenuItem("username123213");
		

		menu.add(item1);
		menu.add(item2);
		
		barraMenu.add(menu);

		pannello.add(barraMenu);
		
		frame.getContentPane().add(pannello);
		
		
		// JBUTTON
		bottoneAnnulla = new JButton("...");
		bottoneAnnulla.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneAnnulla.setBounds(36, 10, 41, 29);
		bottoneAnnulla.setFocusable(false);
		bottoneAnnulla.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneAnnulla);
		
		
		bottoneAccettaRichiesta = new JButton("Accetta Richiesta");
		bottoneAccettaRichiesta.setForeground(Color.BLACK);
		bottoneAccettaRichiesta.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneAccettaRichiesta.setBounds(397, 200, 185, 40);
		bottoneAccettaRichiesta.setFocusable(false);
		bottoneAccettaRichiesta.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneAccettaRichiesta);
		
		bottoneRifiutaRichiesta = new JButton("Rifiuta Richiesta");
		bottoneRifiutaRichiesta.setForeground(Color.BLACK);
		bottoneRifiutaRichiesta.setFont(new Font("Tahoma", Font.BOLD, 20));
		bottoneRifiutaRichiesta.setBounds(212, 200, 179, 40);
		bottoneRifiutaRichiesta.setFocusable(false);
		bottoneRifiutaRichiesta.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		frame.getContentPane().add(bottoneRifiutaRichiesta);
	    

		
		
	}
	
	
	
	
	
	
	public JFrame getFrame() {
		return frame;
	}






	public void setFrame(JFrame frame) {
		this.frame = frame;
	}






	public JLabel getLabelGestioneRichieste() {
		return labelGestioneRichieste;
	}






	public void setLabelGestioneRichieste(JLabel labelGestioneRichieste) {
		this.labelGestioneRichieste = labelGestioneRichieste;
	}






	public JLabel getLabelEmail() {
		return labelEmail;
	}






	public void setLabelEmail(JLabel labelEmail) {
		this.labelEmail = labelEmail;
	}






	public JLabel getLabelCompetenze() {
		return labelCompetenze;
	}






	public void setLabelCompetenze(JLabel labelCompetenze) {
		this.labelCompetenze = labelCompetenze;
	}






	public JLabel getLabelEmailVuoto() {
		return labelEmailVuoto;
	}






	public void setLabelEmailVuoto(JLabel labelEmailVuoto) {
		this.labelEmailVuoto = labelEmailVuoto;
	}






	public JLabel getLabelCompetenzeVuoto() {
		return labelCompetenzeVuoto;
	}






	public void setLabelCompetenzeVuoto(JLabel labelCompetenzeVuoto) {
		this.labelCompetenzeVuoto = labelCompetenzeVuoto;
	}






	public JPanel getPannello2() {
		return pannello2;
	}






	public void setPannello2(JPanel pannello2) {
		this.pannello2 = pannello2;
	}






	public JPanel getPannello3() {
		return pannello3;
	}






	public void setPannello3(JPanel pannello3) {
		this.pannello3 = pannello3;
	}






	public JPanel getPannello() {
		return pannello;
	}






	public void setPannello(JPanel pannello) {
		this.pannello = pannello;
	}






	public JMenuBar getBarraMenu() {
		return barraMenu;
	}






	public void setBarraMenu(JMenuBar barraMenu) {
		this.barraMenu = barraMenu;
	}






	public JMenu getMenu() {
		return menu;
	}






	public void setMenu(JMenu menu) {
		this.menu = menu;
	}






	public JMenuItem getItem1() {
		return item1;
	}






	public void setItem1(JMenuItem item1) {
		this.item1 = item1;
	}






	public JMenuItem getItem2() {
		return item2;
	}






	public void setItem2(JMenuItem item2) {
		this.item2 = item2;
	}






	public JButton getBottoneAnnulla() {
		return bottoneAnnulla;
	}






	public void setBottoneAnnulla(JButton bottoneAnnulla) {
		this.bottoneAnnulla = bottoneAnnulla;
	}






	public JButton getBottoneAccettaRichiesta() {
		return bottoneAccettaRichiesta;
	}






	public void setBottoneAccettaRichiesta(JButton bottoneAccettaRichiesta) {
		this.bottoneAccettaRichiesta = bottoneAccettaRichiesta;
	}






	public JButton getBottoneRifiutaRichiesta() {
		return bottoneRifiutaRichiesta;
	}






	public void setBottoneRifiutaRichiesta(JButton bottoneRifiutaRichiesta) {
		this.bottoneRifiutaRichiesta = bottoneRifiutaRichiesta;
	}






	public JSeparator getSeparatore1() {
		return separatore1;
	}






	public void setSeparatore1(JSeparator separatore1) {
		this.separatore1 = separatore1;
	}






	public JSeparator getSeparatore2() {
		return separatore2;
	}






	public void setSeparatore2(JSeparator separatore2) {
		this.separatore2 = separatore2;
	}


	public void rendiVisibile() {
		if(frame.isVisible())
 			frame.setVisible(false);
 		else
 			frame.setVisible(true);
   }

}
