import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;


public class FrameProfiloUtente {
 
 
	 private JFrame frame;
	 private JLabel labelDettagliUtente;
	 private JLabel labelDettagliProgetti;
	 private JLabel labelNomeUtente;
	 private JLabel labelCognomeUtente;
	 private JLabel labelEmail;
	 private JLabel labelDataNascita;
	 private JLabel labelCompetenze;
	 private JButton bottoneModifica;
	 private JButton bottoneCancellazione;
	 private JButton bottoneCreaCategoria;
	 private JPanel pannello;
	 private JSeparator separatore1;
	 private JSeparator separatore2;
	 private JSeparator separatore3;
	 private JSeparator separatore4;
	 private JMenuBar barraMenu;
	 private JMenu menu;
	 private JMenuItem item1;
	 private JMenuItem item2;
	 private JPanel pannelloMenu;
	 private JLabel lblNome;
	 private JLabel lblCognome;
	 private JLabel lblEmail;
	 private JLabel lblCompetenze;
	 private JLabel lblData;
	 private JLabel labelMatricola;
	 private JLabel lblMatricola;
	 private JButton btnLogout;
	 private JLabel lblUsername;

 
 public FrameProfiloUtente() {

	  frame = new JFrame("Profilo Utente");  
	  frame.setResizable(false);
	  frame.setBounds(500, 150, 500, 600);
	  frame.getContentPane().setBackground(java.awt.Color.orange);
	  frame.getContentPane().setLayout(null);
	 
	  pannello = new JPanel();
	  pannello.setLayout(new BoxLayout(pannello, BoxLayout.Y_AXIS));
	  pannello.setBackground(java.awt.Color.cyan);
	  pannello.setBounds(30, 30, 222, 272);
	  
	  
	  // JLABEL
	
	  labelDettagliUtente = new JLabel("Dettagli Utente:");
	  labelDettagliUtente.setForeground(java.awt.Color.red);
	  labelDettagliUtente.setFont(new Font("Helvetica", Font.BOLD, 20));
	  labelDettagliUtente.setBounds(30, -60, 200, 80);
	  frame.getContentPane().add(labelDettagliUtente);
	  
	  labelMatricola = new JLabel("Matricola");
	  labelMatricola.setForeground(Color.BLACK);
	  labelMatricola.setFont(new Font("SansSerif", Font.ITALIC, 21));
	  pannello.add(labelMatricola);
	  
	  lblMatricola = new JLabel("");
	  pannello.add(lblMatricola);
	  
	  JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
	  separator.setBackground(Color.BLACK);
	  pannello.add(separator);
	
	 
	  labelNomeUtente = new JLabel("Nome");
	  labelNomeUtente.setForeground(java.awt.Color.black);
	  labelNomeUtente.setFont(new Font("SansSerif", Font.ITALIC, 21));
	  labelNomeUtente.setBounds(70, -50, 200, 150);
	  pannello.add(labelNomeUtente);
	  
	  lblNome = new JLabel("");
	  pannello.add(lblNome);
	  separatore1 = new JSeparator(JSeparator.HORIZONTAL);
	  separatore1.setBackground(Color.black);
	  pannello.add(separatore1);
	  
	  labelCognomeUtente = new JLabel("Cognome");
	  labelCognomeUtente.setForeground(java.awt.Color.black);
	  labelCognomeUtente.setFont(new Font("SansSerif", Font.ITALIC, 21));
	  labelCognomeUtente.setBounds(70, -20, 200, 150);
	  pannello.add(labelCognomeUtente);
	  
	  lblCognome = new JLabel("");
	  pannello.add(lblCognome);
	  separatore2 = new JSeparator(JSeparator.HORIZONTAL);
	  separatore2.setBackground(Color.black);
	  pannello.add(separatore2);
	  
	  labelEmail = new JLabel("Email");
	  labelEmail.setForeground(java.awt.Color.black);
	  labelEmail.setFont(new Font("SansSerif", Font.ITALIC, 21));
	  labelEmail.setBounds(70, 10, 200, 150);
	  pannello.add(labelEmail);
	  
	  lblEmail = new JLabel("");
	  pannello.add(lblEmail);
	  separatore3 = new JSeparator(JSeparator.HORIZONTAL);
	  separatore3.setBackground(Color.black);
	  pannello.add(separatore3);
	
	  
	  labelDataNascita = new JLabel("Data di Nascita");
	  labelDataNascita.setForeground(java.awt.Color.black);
	  labelDataNascita.setFont(new Font("SansSerif", Font.ITALIC, 21));
	  labelDataNascita.setBounds(70, 40, 200, 150);
	  pannello.add(labelDataNascita);
	  
	  lblData = new JLabel("");
	  pannello.add(lblData);
	  separatore4 = new JSeparator(JSeparator.HORIZONTAL);
	  separatore4.setBackground(Color.black);
	  pannello.add(separatore4);
	  
	  labelCompetenze = new JLabel("Competenze");
	  labelCompetenze.setForeground(java.awt.Color.black);
	  labelCompetenze.setFont(new Font("SansSerif", Font.ITALIC, 21));
	  labelCompetenze.setBounds(70, 70, 200, 150);
	  pannello.add(labelCompetenze); 
	  frame.getContentPane().add(pannello);
	  
	  lblCompetenze = new JLabel("");
	  pannello.add(lblCompetenze);
	
	  
	  // JBUTTON
	  bottoneModifica = new JButton("Modifica Profilo");
	  bottoneModifica.setFont(new Font("Tahoma", Font.BOLD, 20));
	  bottoneModifica.setBounds(294, 196, 173, 40);
	  bottoneModifica.setFocusable(false);
	  bottoneModifica.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
	  frame.getContentPane().add(bottoneModifica);
	  
	  bottoneCancellazione = new JButton("Cancella Profilo");
	  bottoneCancellazione.setFont(new Font("Tahoma", Font.BOLD, 20));
	  bottoneCancellazione.setBounds(294, 262, 173, 40);
	  bottoneCancellazione.setFocusable(false);
	  bottoneCancellazione.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
	  frame.getContentPane().add(bottoneCancellazione);
	  
	  
	  
	  // JLABEL________________________________________________
	  labelDettagliProgetti = new JLabel("Miei Progetti:");
	  labelDettagliProgetti.setForeground(java.awt.Color.red);
	  labelDettagliProgetti.setFont(new Font("Helvetica", Font.BOLD, 20));
	  labelDettagliProgetti.setBounds(30, 267, 200, 150);
	  frame.getContentPane().add(labelDettagliProgetti);
	   
	  bottoneCreaCategoria = new JButton("Nuovo Team");
	  bottoneCreaCategoria.setFont(new Font("Tahoma", Font.BOLD, 20));
	  bottoneCreaCategoria.setBounds(308, 428, 159, 40);
	  bottoneCreaCategoria.setFocusable(false);
	  bottoneCreaCategoria.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
	  frame.getContentPane().add(bottoneCreaCategoria);
	    
	  
	  // JMENU - JBARMENU - JMENUITEM
	  barraMenu = new JMenuBar();
	  menu = new JMenu("Progetti");
	  item1 = new JMenuItem("Programmatore");
	  item2 = new JMenuItem("Geometra"); 
	  
	  menu.setBounds(42, 300, 300, 40);
	  menu.setFont(new Font("Tahoma", Font.PLAIN, 22));
	  menu.add(item1);
	  menu.add(item2);
	  barraMenu.setSize(new Dimension(400,400));
	  barraMenu.add(menu);
	
	  pannelloMenu = new JPanel();
	  pannelloMenu.setBackground(Color.CYAN);
	  pannelloMenu.setBounds(30, 390, 200, 120);
	  pannelloMenu.add(barraMenu);
	  frame.getContentPane().add(pannelloMenu);
	  
	  btnLogout = new JButton("Logout");
	  btnLogout.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
	  btnLogout.setBackground(Color.RED);
	  btnLogout.setBounds(294, 46, 89, 23);
	  frame.getContentPane().add(btnLogout);
	  
	  lblUsername = new JLabel("");
	  lblUsername.setFont(new Font("Tahoma", Font.ITALIC, 15));
	  lblUsername.setBackground(Color.CYAN);
	  lblUsername.setBounds(308, 16, 159, 23);
	  frame.getContentPane().add(lblUsername);
	  lblUsername.setForeground(Color.BLUE);
  

  }

 	public JLabel getLblUsername() {
 		return lblUsername;
 	}

 	public void setLblUsername(String lblUsername) {
 		this.lblUsername.setText(lblUsername);
 	}

	public JButton getBtnLogout() {
 		return btnLogout;
 	}

 	public void setBtnLogout(JButton btnLogout) {
 		this.btnLogout = btnLogout;
 	}

	public JLabel getLblMatricola() {
 		return lblMatricola;
 	}

 	public void setLblMatricola(int lblMatricola) {
 		this.lblMatricola.setText(String.valueOf(lblMatricola));
 	}

	public JLabel getLblNome() {
 		return lblNome;
	}
	
	public void setLblNome(String lblNome) {
		this.lblNome.setText(lblNome);
	}
	
	public JLabel getLblCognome() {
		return lblCognome;
	}
	
	public void setLblCognome(String lblCognome) {
		this.lblCognome.setText(lblCognome);
	}
	
	public JLabel getLblEmail() {
		return lblEmail;
	}
	
	public void setLblEmail(String lblEmail) {
		this.lblEmail.setText( lblEmail);
	}
	
	public JLabel getLblCompetenze() {
		return lblCompetenze;
	}
	
	public void setLblCompetenze(String lblCompetenze) {
		this.lblCompetenze.setText( lblCompetenze);
	}
	
	public JLabel getLblData() {
		return lblData;
	}
	
	public void setLblData(String lblData) {
		this.lblData.setText(lblData);
	}

	public JFrame getFrame() {
	  return frame;
	}


	public void setFrame(JFrame frame) {
	  this.frame = frame;
	}


	public JLabel getLabelDettagliUtente() {
	  return labelDettagliUtente;
	}


	public void setLabelDettagliUtente(JLabel labelDettagliUtente) {
	  this.labelDettagliUtente = labelDettagliUtente;
	}


	public JLabel getLabelDettagliProgetti() {
	  return labelDettagliProgetti;
	}


	public void setLabelDettagliProgetti(JLabel labelDettagliProgetti) {
	  this.labelDettagliProgetti = labelDettagliProgetti;
	}


	public JLabel getLabelNomeUtente() {
	  return labelNomeUtente;
	}


	public void setLabelNomeUtente(JLabel labelNomeUtente) {
	  this.labelNomeUtente = labelNomeUtente;
	}


	public JLabel getLabelCognomeUtente() {
	  return labelCognomeUtente;
	}


	public void setLabelCognomeUtente(JLabel labelCognomeUtente) {
	  this.labelCognomeUtente = labelCognomeUtente;
	}


	public JLabel getLabelEmail() {
	  return labelEmail;
	}


	public void setLabelEmail(JLabel labelEmail) {
	  this.labelEmail = labelEmail;
	}


	public JLabel getLabelDataNascita() {
	  return labelDataNascita;
	}


	public void setLabelDataNascita(JLabel labelDataNascita) {
	  this.labelDataNascita = labelDataNascita;
	}


	public JLabel getLabelCompetenze() {
	  return labelCompetenze;
	}


	public void setLabelCompetenze(JLabel labelCompetenze) {
	  this.labelCompetenze = labelCompetenze;
	}


	public JButton getBottoneModifica() {
	  return bottoneModifica;
	}


	public void setBottoneModifica(JButton bottoneModifica) {
	  this.bottoneModifica = bottoneModifica;
	}


	public JButton getBottoneCancellazione() {
	  return bottoneCancellazione;
	}


	public void setBottoneCancellazione(JButton bottoneCancellazione) {
	  this.bottoneCancellazione = bottoneCancellazione;
	}


	public JButton getBottoneCreaCategoria() {
	  return bottoneCreaCategoria;
	}


	public void setBottoneCreaCategoria(JButton bottoneCreaCategoria) {
	  this.bottoneCreaCategoria = bottoneCreaCategoria;
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


	public JPanel getPannelloMenu() {
	  return pannelloMenu;
	}


	public void setPannelloMenu(JPanel pannelloMenu) {
	  this.pannelloMenu = pannelloMenu;
	}
	
	public void rendiVisibile() {
		if(frame.isVisible())
			frame.setVisible(false);
		else
			frame.setVisible(true);
	}
}