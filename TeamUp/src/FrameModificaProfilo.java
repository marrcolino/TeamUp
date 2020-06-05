import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;



public class FrameModificaProfilo {

    private JFrame frame;
    private JLabel labelModificaUtente; 
    private JLabel labelNomeUtente;
    private JLabel labelCognomeUtente;
    private JLabel labelDataNascita;
    private JLabel labelPassword;
    private JLabel labelEmail;
    private JLabel labelCompetenze;  
    private JTextField textNome;
    private JTextField textCognome;
    private JTextField textEmail;
    private JTextField textPassword;
    private JTextField textCompetenze; 
    private JTextField textDataNascita;   
    private JButton bottoneConfermaModifica;
    private JPanel pannello;
    private JSeparator separatore1;
    private JSeparator separatore2;
    private JSeparator separatore3;
    private JSeparator separatore4;
    private JSeparator separatore5;
    private JSeparator separatore6;
    private JButton buttonReturn;
   
   
    public FrameModificaProfilo() {
   
       frame = new JFrame("Modifica Profilo");  
       frame.setResizable(false);
       frame.setBounds(500, 150, 544, 362);
       frame.getContentPane().setBackground(java.awt.Color.orange);
       frame.getContentPane().setLayout(null);
      
       pannello = new JPanel();
       pannello.setLayout(new BoxLayout(pannello, BoxLayout.Y_AXIS));
       pannello.setBackground(java.awt.Color.cyan);
       pannello.setBounds(40, 64, 130, 150);
       
       
       // JLABEL
     
       labelModificaUtente = new JLabel("Modifica Utente:");
       labelModificaUtente.setForeground(java.awt.Color.red);
       labelModificaUtente.setFont(new Font("Helvetica", Font.BOLD, 20));
       labelModificaUtente.setBounds(30, -60, 200, 150);
       frame.getContentPane().add(labelModificaUtente);
     
      
       labelNomeUtente = new JLabel("Nome");
       labelNomeUtente.setForeground(java.awt.Color.black);
       labelNomeUtente.setFont(new Font("Helvetica", Font.ITALIC, 17));
       labelNomeUtente.setBounds(70, -50, 200, 150);
       pannello.add(labelNomeUtente);
       separatore1 = new JSeparator(JSeparator.HORIZONTAL);
       separatore1.setBackground(Color.black);
       pannello.add(separatore1);
       
       
       labelCognomeUtente = new JLabel("Cognome");
       labelCognomeUtente.setForeground(java.awt.Color.black);
       labelCognomeUtente.setFont(new Font("Helvetica", Font.ITALIC, 17));
       labelCognomeUtente.setBounds(70, -20, 200, 150);
       pannello.add(labelCognomeUtente);
       separatore2 = new JSeparator(JSeparator.HORIZONTAL);
       separatore2.setBackground(Color.black);
       pannello.add(separatore2);
       
       
       labelDataNascita = new JLabel("Data di Nascita");
       labelDataNascita.setForeground(java.awt.Color.black);
       labelDataNascita.setFont(new Font("Helvetica", Font.ITALIC, 17));
       labelDataNascita.setBounds(70, 10, 200, 150);
       pannello.add(labelDataNascita);
       separatore3 = new JSeparator(JSeparator.HORIZONTAL);
       separatore3.setBackground(Color.black);
       pannello.add(separatore3);
       
       
       labelPassword = new JLabel("Password");
       labelPassword.setForeground(java.awt.Color.black);
       labelPassword.setFont(new Font("Helvetica", Font.ITALIC, 17));
       labelPassword.setBounds(70, 40, 200, 150);     
       pannello.add(labelPassword);
       separatore4 = new JSeparator(JSeparator.HORIZONTAL);
       separatore4.setBackground(Color.black);
       pannello.add(separatore4);
      
       
       labelEmail = new JLabel("Email");
       labelEmail.setForeground(java.awt.Color.black);
       labelEmail.setFont(new Font("Helvetica", Font.ITALIC, 17));
       labelEmail.setBounds(70, 70, 200, 150);
       pannello.add(labelEmail); 
       separatore5 = new JSeparator(JSeparator.HORIZONTAL);
       separatore5.setBackground(Color.black);
       pannello.add(separatore5);
           
       
       labelCompetenze = new JLabel("Competenze");
       labelCompetenze.setForeground(java.awt.Color.black);
       labelCompetenze.setFont(new Font("Helvetica", Font.ITALIC, 17));
       labelCompetenze.setBounds(70, 100, 200, 150);
       pannello.add(labelCompetenze); 
       separatore6 = new JSeparator(JSeparator.HORIZONTAL);
       separatore6.setBackground(Color.black);
       pannello.add(separatore6);
       
       
       frame.getContentPane().add(pannello);
     
       
       
       // JTEXTFIELD
       textNome = new JTextField();
       textNome.setBounds(170, 64, 300, 24);
       frame.getContentPane().add(textNome);
       
       textCognome = new JTextField();
       textCognome.setBounds(170, 88, 300, 26);
       frame.getContentPane().add(textCognome);
       
       textDataNascita = new JTextField();
       textDataNascita.setBounds(170, 113, 300, 26);   
       frame.getContentPane().add(textDataNascita);
       
       textPassword = new JTextField();
       textPassword.setBounds(170, 139, 300, 26);
       frame.getContentPane().add(textPassword);
       
       textEmail = new JTextField();
       textEmail.setBounds(170, 164, 300, 25);
       frame.getContentPane().add(textEmail);
       
       textCompetenze = new JTextField();
       textCompetenze.setBounds(170, 188, 300, 27);
       frame.getContentPane().add(textCompetenze);
       
       bottoneConfermaModifica = new JButton("Conferma");
       bottoneConfermaModifica.setFont(new Font("Tahoma", Font.BOLD, 20));
       bottoneConfermaModifica.setBounds(161, 251, 200, 40);
       bottoneConfermaModifica.setFocusable(false);
       bottoneConfermaModifica.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
       frame.getContentPane().add(bottoneConfermaModifica);
       
       buttonReturn = new JButton("...");
       buttonReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
       buttonReturn.setBounds(423, 8, 47, 31);
       frame.getContentPane().add(buttonReturn);
     
     }
    
    

	 public JButton getButtonReturn() {
		return buttonReturn;
	}



	public void setButtonReturn(JButton buttonReturn) {
		this.buttonReturn = buttonReturn;
	}



	public JFrame getFrame() {
	  return frame;
	 }
	
	
	
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
	 }
	
	
	
	 public JLabel getLabelModificaUtente() {
	  return labelModificaUtente;
	 }
	
	
	
	 public void setLabelModificaUtente(JLabel labelModificaUtente) {
	  this.labelModificaUtente = labelModificaUtente;
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
	
	
	
	 public JLabel getLabelDataNascita() {
	  return labelDataNascita;
	 }
	
	
	
	 public void setLabelDataNascita(JLabel labelDataNascita) {
	  this.labelDataNascita = labelDataNascita;
	 }
	
	
	
	 public JLabel getLabelPassword() {
	  return labelPassword;
	 }
	
	
	
	 public void setLabelPassword(JLabel labelPassword) {
	  this.labelPassword = labelPassword;
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
	
	
	
	 public JTextField getTextNome() {
	  return textNome;
	 }
	
	
	
	 public void setTextNome(JTextField textNome) {
	  this.textNome = textNome;
	 }
	
	
	
	 public JTextField getTextCognome() {
	  return textCognome;
	 }
	
	
	
	 public void setTextCognome(JTextField textCognome) {
	  this.textCognome = textCognome;
	 }
	
	
	
	 public JTextField getTextEmail() {
	  return textEmail;
	 }
	
	
	
	 public void setTextEmail(JTextField textEmail) {
	  this.textEmail = textEmail;
	 }
	
	
	
	 public JTextField getTextPassword() {
	  return textPassword;
	 }
	
	
	
	 public void setTextPassword(JTextField textPassword) {
	  this.textPassword = textPassword;
	 }
	
	
	
	 public JTextField getTextCompetenze() {
	  return textCompetenze;
	 }
	
	
	
	 public void setTextCompetenze(JTextField textCompetenze) {
	  this.textCompetenze = textCompetenze;
	 }
	
	
	
	 public JTextField getTextDataNascita() {
	  return textDataNascita;
	 }
	
	
	
	 public void setTextDataNascita(JTextField textDataNascita) {
	  this.textDataNascita = textDataNascita;
	 }
	
	
	
	 public JButton getBottoneConfermaModifica() {
	  return bottoneConfermaModifica;
	 }
	
	
	
	 public void setBottoneConfermaModifica(JButton bottoneConfermaModifica) {
	  this.bottoneConfermaModifica = bottoneConfermaModifica;
	 }
	
	
	
	 public JPanel getPannello() {
	  return pannello;
	 }
	
	
	
	 public void setPannello(JPanel pannello) {
	  this.pannello = pannello;
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
	
	
	
	 public JSeparator getSeparatore3() {
	  return separatore3;
	 }
	
	
	
	 public void setSeparatore3(JSeparator separatore3) {
	  this.separatore3 = separatore3;
	 }
	
	
	
	 public JSeparator getSeparatore4() {
	  return separatore4;
	 }
	
	
	
	 public void setSeparatore4(JSeparator separatore4) {
	  this.separatore4 = separatore4;
	 }
	
	
	
	 public JSeparator getSeparatore5() {
	  return separatore5;
	 }
	
	
	
	 public void setSeparatore5(JSeparator separatore5) {
	  this.separatore5 = separatore5;
	 }
	
	
	
	 public JSeparator getSeparatore6() {
	  return separatore6;
	 }
	
	
	
	 public void setSeparatore6(JSeparator separatore6) {
	  this.separatore6 = separatore6;
	 }



 	public void rendiVisibile() {
 		if(frame.isVisible())
 			frame.setVisible(false);
 		else
 			frame.setVisible(true);
   }
 
}