import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.Component;

public class FrameVisualizzaProgetti {
 
 private JFrame frame;
 private JLabel labelVisualizzazioneProgetti;
 private JLabel labelRicerca;
 private JPanel pannello2;
 private JMenuBar barraMenuProgetti;
 private JMenu menuProgetti;
 private JMenuItem itemProgetti1;
 private JMenuItem itemProgetti2;
 private JMenuItem itemProgetti3;
 private  JTextArea txtDescrizione;
 

 private JButton bottoneIndietro;
 private JLabel labelRicercaProgetto;
 private JButton btnCreaNuovo;
 private JButton btnInvia;
 
 
 
 public FrameVisualizzaProgetti() {
  
  frame = new JFrame("Progetti");
  frame.setResizable(false);
  frame.setBounds(500, 150, 500, 400);
  frame.getContentPane().setBackground(java.awt.Color.orange);
  frame.getContentPane().setLayout(null);
  
  //JLABEL
  labelVisualizzazioneProgetti =  new JLabel("Visualizzazione Progetti: ");
  labelVisualizzazioneProgetti.setForeground(java.awt.Color.red);
  labelVisualizzazioneProgetti.setFont(new Font("Tahoma", Font.BOLD, 21));
  labelVisualizzazioneProgetti.setBounds(108, -56, 300, 150);
  frame.getContentPane().add(labelVisualizzazioneProgetti);
  
  labelRicerca =  new JLabel("RICERCA");
  labelRicerca.setForeground(java.awt.Color.red);
  labelRicerca.setFont(new Font("Tahoma", Font.BOLD, 21));
  labelRicerca.setBounds(242, 22, 126, 103);
  frame.getContentPane().add(labelRicerca);
  pannello2 = new JPanel();
  pannello2.setBounds(50, 69, 167, 270);
  pannello2.setBackground(Color.cyan);
  barraMenuProgetti = new JMenuBar();
  menuProgetti = new JMenu("Progetti");
  itemProgetti1 = new JMenuItem("Gruppo Calcio");
  itemProgetti2 = new JMenuItem("Team Studio");
  itemProgetti3 = new JMenuItem("Mavifrasa");
  
  menuProgetti.add(itemProgetti1);
  menuProgetti.add(itemProgetti2);
  menuProgetti.add(itemProgetti3);
  barraMenuProgetti.add(menuProgetti);
  pannello2.add(barraMenuProgetti);
  frame.getContentPane().add(pannello2);
  
  
  
  //JBUTTON
  bottoneIndietro = new JButton("...");
  bottoneIndietro.setFont(new Font("Tahoma", Font.BOLD, 20));
  bottoneIndietro.setBounds(40, 22, 33, 23);
  bottoneIndietro.setFocusable(false);
  bottoneIndietro.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
  frame.getContentPane().add(bottoneIndietro);
  
  txtDescrizione = new JTextArea();
  txtDescrizione.setBounds(242, 196, 225, 103);
  frame.getContentPane().add(txtDescrizione);
  txtDescrizione.setLineWrap(true);
  txtDescrizione.setBackground(Color.cyan);
  
  labelRicercaProgetto = new JLabel("");
  labelRicercaProgetto.setForeground(Color.DARK_GRAY);
  labelRicercaProgetto.setFont(new Font("Tahoma", Font.BOLD, 21));
  labelRicercaProgetto.setBounds(227, 36, 271, 123);
  frame.getContentPane().add(labelRicercaProgetto);
  
  btnCreaNuovo = new JButton("Crea Nuovo");
  btnCreaNuovo.setBounds(381, 9, 103, 28);
  frame.getContentPane().add(btnCreaNuovo);
  
  btnInvia = new JButton("Invia Richiesta");
  btnInvia.setBounds(295, 316, 119, 23);
  frame.getContentPane().add(btnInvia);;

  
 }
 
 public JButton getBtnCreaNuovo() {
	return btnCreaNuovo;
}

public void setBtnCreaNuovo(JButton btnCreaNuovo) {
	this.btnCreaNuovo = btnCreaNuovo;
}

public JButton getBtnInvia() {
	return btnInvia;
}

public void setBtnInvia(JButton btnInvia) {
	this.btnInvia = btnInvia;
}

// METODO PER VISUALIZZARE IL FRAME
 public void rendiVisibile() {
	if(frame.isVisible())
		frame.setVisible(false);
	else
		frame.setVisible(true);
}

 
 public JLabel getLabelRicercaProgetto() {
	return labelRicercaProgetto;
}

public void setLabelRicercaProgetto(String labelRicercaProgetto) {
	this.labelRicercaProgetto.setText(labelRicercaProgetto);
}

// METODI GETTERS AND SETTERS
 public JFrame getFrame() {
  return frame;
 }

 public void setFrame(JFrame frame) {
  this.frame = frame;
 }

 public JLabel getLabelVisualizzazioneProgetti() {
  return labelVisualizzazioneProgetti;
 }

 public void setLabelVisualizzazioneProgetti(JLabel labelVisualizzazioneProgetti) {
  this.labelVisualizzazioneProgetti = labelVisualizzazioneProgetti;
 }


 public JLabel getLabelProgetto() {
  return labelRicercaProgetto;
 }

 public void setLabelProgetto(String labelProgetto) {
  this.labelRicercaProgetto.setText(labelProgetto);
 }

 public String getLabelRicerca() {
  return labelRicerca.getText();
 }

 public String getTxtDescrizione() {
	return txtDescrizione.getText();
}

public void setTxtDescrizione(String txtDescrizione) {
	this.txtDescrizione.setText(txtDescrizione);
}

public void setLabelRicerca(String labelRicerca) {
  this.labelRicerca.setText(labelRicerca);
 }

 public JPanel getPannello2() {
  return pannello2;
 }

 public void setPannello2(JPanel pannello2) {
  this.pannello2 = pannello2;
 }

 public JMenuBar getBarraMenuProgetti() {
  return barraMenuProgetti;
 }

 public void setBarraMenuProgetti(JMenuBar barraMenuProgetti) {
  this.barraMenuProgetti = barraMenuProgetti;
 }

 public JMenu getMenuProgetti() {
  return menuProgetti;
 }

 public void setMenuProgetti(JMenu menuProgetti) {
  this.menuProgetti = menuProgetti;
 }

 public JMenuItem getItemProgetti1() {
  return itemProgetti1;
 }

 public void setItemProgetti1(JMenuItem itemProgetti1) {
  this.itemProgetti1 = itemProgetti1;
 }

 public JMenuItem getItemProgetti2() {
  return itemProgetti2;
 }

 public void setItemProgetti2(JMenuItem itemProgetti2) {
  this.itemProgetti2 = itemProgetti2;
 }

 public JMenuItem getItemProgetti3() {
  return itemProgetti3;
 }

 public void setItemProgetti3(JMenuItem itemProgetti3) {
  this.itemProgetti3 = itemProgetti3;
 }

 public JButton getBottoneIndietro() {
  return bottoneIndietro;
 }

 public void setBottoneIndietro(JButton bottoneIndietro) {
  this.bottoneIndietro = bottoneIndietro;
 }
}
