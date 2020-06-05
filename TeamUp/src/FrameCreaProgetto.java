import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class FrameCreaProgetto {
 
 private JFrame frame;
 private JLabel labelCreazioneProgetto;
 private JLabel labelNome;
 private JLabel labelDataDiCreazione;
 private JLabel labelCategoria;
 private JLabel labelDescrizione;
 private JLabel labelRicerca;
 private JPanel pannello;
 
 private JTextField textNome;
 private JTextField textDataDiCreazione;
 private JTextField textCategoria;
 
 private JTextArea areaDescrizione;
 private JTextField textRicerca;

 private JButton bottoneIndietro;
 private JButton bottoneCreaProgetto;
 
 private JSeparator separatore1;
 private JSeparator separatore2;
 private JSeparator separatore3;
 private JSeparator separatore4;
 
 
    
 
 
 
 public FrameCreaProgetto() {
  

  //JFRAME
  frame = new JFrame("Progetto");
  frame.setResizable(false);
  frame.setBounds(200 , 200, 700, 500);
  frame.getContentPane().setBackground(Color.orange);
  frame.getContentPane().setLayout(null);
  
  pannello = new JPanel();
  pannello.setLayout(null);       // new BoxLayout(pannello, BoxLayout.Y_AXIS
  pannello.setBackground(java.awt.Color.cyan);
  pannello.setBounds(76, 81, 222, 231);
  frame.getContentPane().add(pannello);
  
  labelCreazioneProgetto = new JLabel("Creazione Progetto:");
  labelCreazioneProgetto.setForeground(java.awt.Color.red);
  labelCreazioneProgetto.setFont(new Font("Tahoma", Font.BOLD, 25));
  labelCreazioneProgetto.setBounds(216, -48, 273, 150);
  frame.getContentPane().add(labelCreazioneProgetto);
  
  
  //JLABEL
  labelNome = new JLabel("Nome Progetto");
  labelNome.setBounds(31, -53, 200, 150);
  pannello.add(labelNome);
  labelNome.setForeground(java.awt.Color.black);
  labelNome.setFont(new Font("Helvetica", Font.ITALIC, 22));
     separatore1 = new JSeparator(JSeparator.HORIZONTAL);
     separatore1.setBounds(1, 42, 229, 20);
     separatore1.setBackground(Color.black);
     pannello.add(separatore1);
  
  labelDataDiCreazione = new JLabel("Data di Creazione");
  labelDataDiCreazione.setBounds(31, -14, 200, 150);
  pannello.add(labelDataDiCreazione);
  labelDataDiCreazione.setForeground(java.awt.Color.black);
  labelDataDiCreazione.setFont(new Font("Helvetica", Font.ITALIC, 22));
     separatore2 = new JSeparator(JSeparator.HORIZONTAL);
     separatore2.setBounds(1, 80, 229, 20);
     separatore2.setBackground(Color.black);
     pannello.add(separatore2);
  
  labelCategoria = new JLabel("Categoria");
  labelCategoria.setBounds(31, 20, 200, 150);
  pannello.add(labelCategoria);
  labelCategoria.setForeground(java.awt.Color.black);
  labelCategoria.setFont(new Font("Helvetica", Font.ITALIC, 22));
  separatore3 = new JSeparator(JSeparator.HORIZONTAL);
  separatore3.setBounds(1, 114, 229, 20);
  separatore3.setBackground(Color.black);
     pannello.add(separatore3);
  
  labelDescrizione = new JLabel("Descrizione");
  labelDescrizione.setBounds(31, 53, 200, 150);
  pannello.add(labelDescrizione);
  labelDescrizione.setForeground(java.awt.Color.black);
  labelDescrizione.setFont(new Font("Helvetica", Font.ITALIC, 22));
  separatore4 = new JSeparator(JSeparator.HORIZONTAL);
  separatore4.setBounds(1, 198, 229, 20);
  separatore4.setBackground(Color.black);
     pannello.add(separatore4);
     
     labelRicerca = new JLabel("Ricerca");
     labelRicerca.setBounds(31, 135, 200, 150);
     pannello.add(labelRicerca);
     labelRicerca.setForeground(java.awt.Color.black);
     labelRicerca.setFont(new Font("Helvetica", Font.ITALIC, 22));
  
  //JTEXTFIELD
     textNome = new JTextField();
     textNome.setBounds(298, 81, 327, 43);
     frame.getContentPane().add(textNome);
       
     textDataDiCreazione = new JTextField();
     textDataDiCreazione.setBounds(298, 124, 327, 38);
     frame.getContentPane().add(textDataDiCreazione);
       
     textCategoria = new JTextField();
     textCategoria.setBounds(298, 162, 327, 35);   
     frame.getContentPane().add(textCategoria);
       
     areaDescrizione = new JTextArea();
     areaDescrizione.setBounds(298, 197, 327, 84);
     frame.getContentPane().add(areaDescrizione);
            
     textRicerca = new JTextField();
     textRicerca.setBounds(298, 281, 327, 31);
     frame.getContentPane().add(textRicerca);
    
     
     //JBUTTON
     bottoneCreaProgetto = new JButton("Crea Progetto");
     bottoneCreaProgetto.setFont(new Font("Tahoma", Font.BOLD, 20));
     bottoneCreaProgetto.setBounds(216, 352, 222, 54);
     bottoneCreaProgetto.setFocusable(false);
     bottoneCreaProgetto.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
     frame.getContentPane().add(bottoneCreaProgetto);
     
     
     bottoneIndietro = new JButton("...");
     bottoneIndietro.setFont(new Font("Tahoma", Font.BOLD, 20));
     bottoneIndietro.setBounds(51, 28, 38, 26);
     bottoneIndietro.setFocusable(false);
     bottoneIndietro.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
     frame.getContentPane().add(bottoneIndietro);
  
    }
 
 
 
 // METODO PER VISUALIZZARE IL FRAME
 public void rendiVisibile() {
	if(frame.isVisible())
		frame.setVisible(false);
	else
		frame.setVisible(true);
}



 // METODI GETTERS AND SETTERS 
 public JFrame getFrame() {
  return frame;
 }



 public void setFrame(JFrame frame) {
  this.frame = frame;
 }



 public JLabel getLabelCreazioneProgetto() {
  return labelCreazioneProgetto;
 }



 public void setLabelCreazioneProgetto(JLabel labelCreazioneProgetto) {
  this.labelCreazioneProgetto = labelCreazioneProgetto;
 }



 public JLabel getLabelNome() {
  return labelNome;
 }



 public void setLabelNome(JLabel labelNome) {
  this.labelNome = labelNome;
 }



 public JLabel getLabelDataDiCreazione() {
  return labelDataDiCreazione;
 }



 public void setLabelDataDiCreazione(JLabel labelDataDiCreazione) {
  this.labelDataDiCreazione = labelDataDiCreazione;
 }



 public JLabel getLabelCategoria() {
  return labelCategoria;
 }



 public void setLabelCategoria(JLabel labelCategoria) {
  this.labelCategoria = labelCategoria;
 }



 public JLabel getLabelDescrizione() {
  return labelDescrizione;
 }



 public void setLabelDescrizione(JLabel labelDescrizione) {
  this.labelDescrizione = labelDescrizione;
 }



 public JLabel getLabelRicerca() {
  return labelRicerca;
 }



 public void setLabelRicerca(JLabel labelRicerca) {
  this.labelRicerca = labelRicerca;
 }



 public JPanel getPannello() {
  return pannello;
 }



 public void setPannello(JPanel pannello) {
  this.pannello = pannello;
 }



 public JTextField getTextNome() {
  return textNome;
 }



 public void setTextNome(JTextField textNome) {
  this.textNome = textNome;
 }



 public JTextField getTextDataDiCreazione() {
  return textDataDiCreazione;
 }



 public void setTextDataDiCreazione(JTextField textDataDiCreazione) {
  this.textDataDiCreazione = textDataDiCreazione;
 }



 public JTextField getTextCategoria() {
  return textCategoria;
 }



 public void setTextCategoria(String textCategoria) {
  this.textCategoria.setText(textCategoria);
 }



 public JTextArea getAreaDescrizione() {
  return areaDescrizione;
 }



 public void setAreaDescrizione(JTextArea areaDescrizione) {
  this.areaDescrizione = areaDescrizione;
 }



 public JTextField getTextRicerca() {
  return textRicerca;
 }



 public void setTextRicerca(JTextField textRicerca) {
  this.textRicerca = textRicerca;
 }



 public JButton getBottoneIndietro() {
  return bottoneIndietro;
 }



 public void setBottoneIndietro(JButton bottoneIndietro) {
  this.bottoneIndietro = bottoneIndietro;
 }



 public JButton getBottoneCreaProgetto() {
  return bottoneCreaProgetto;
 }



 public void setBottoneCreaProgetto(JButton bottoneCreaProgetto) {
  this.bottoneCreaProgetto = bottoneCreaProgetto;
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
 
 
 
}