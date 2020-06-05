
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import java.awt.Font;

public class FrameCreaCategoria {
  

 private JFrame frame;
 private JPanel pannello;
 private JLabel labelCreazioneCategoria;
 private JLabel labelNomeCategoria;
 private JTextField testoNomeCategoria;
 private JButton bottoneCreaCategoria;
 private JButton bottoneIndietro;
 
 
 
 public FrameCreaCategoria() {
  
  
  //JFRAME
  frame = new JFrame("Categoria");
  frame.setResizable(false);
  frame.setBounds(200 , 200, 400, 200);
  frame.getContentPane().setBackground(Color.orange);
  frame.getContentPane().setLayout(null);
  
  pannello = new JPanel();
  pannello.setBackground(Color.cyan);
  pannello.setBounds(40, 60, 76, 33);
  
  //JLABEL
  labelNomeCategoria = new JLabel("Nome");
  labelNomeCategoria.setForeground(java.awt.Color.black);
  labelNomeCategoria.setFont(new Font("Helvetica", Font.ITALIC, 17));
  labelNomeCategoria.setBounds(70, -50, 200, 150);
  pannello.add(labelNomeCategoria);  
  frame.getContentPane().add(pannello);
  
  
  labelCreazioneCategoria = new JLabel("Creazione Categoria:");
  labelCreazioneCategoria.setBounds(89, 10, 250, 26);
  frame.getContentPane().add(labelCreazioneCategoria);
  labelCreazioneCategoria.setForeground(java.awt.Color.red);
  labelCreazioneCategoria.setFont(new Font("Tahoma", Font.BOLD, 21));
  
  
  //JTEXTFIELD
  testoNomeCategoria = new JTextField();
  testoNomeCategoria.setBounds(116, 60, 250, 33);
     frame.getContentPane().add(testoNomeCategoria);
     
     
     //JBUTTON
     bottoneCreaCategoria = new JButton("Crea Categoria");
     bottoneCreaCategoria.setFont(new Font("Tahoma", Font.BOLD, 20));
     bottoneCreaCategoria.setBounds(132, 112, 175, 30);
     bottoneCreaCategoria.setFocusable(false);
     bottoneCreaCategoria.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
     frame.getContentPane().add(bottoneCreaCategoria);
     
     
     bottoneIndietro = new JButton("...");
     bottoneIndietro.setFont(new Font("Tahoma", Font.BOLD, 20));
     bottoneIndietro.setBounds(21, 10, 38, 26);
     bottoneIndietro.setFocusable(false);
     bottoneIndietro.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
     frame.getContentPane().add(bottoneIndietro);

 }
 
 // METODO PER RENDERE VISIBILE IL FRAME
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

 public JPanel getPannello() {
  return pannello;
 }

 public void setPannello(JPanel pannello) {
  this.pannello = pannello;
 }

 public JLabel getLabelCreazioneCategoria() {
  return labelCreazioneCategoria;
 }

 public void setLabelCreazioneCategoria(JLabel labelCreazioneCategoria) {
  this.labelCreazioneCategoria = labelCreazioneCategoria;
 }

 public JLabel getLabelNomeCategoria() {
  return labelNomeCategoria;
 }

 public void setLabelNomeCategoria(JLabel labelNomeCategoria) {
  this.labelNomeCategoria = labelNomeCategoria;
 }

 public JTextField getTestoNomeCategoria() {
  return testoNomeCategoria;
 }

 public void setTestoNomeCategoria(JTextField testoNomeCategoria) {
  this.testoNomeCategoria = testoNomeCategoria;
 }

 public JButton getBottoneCreaCategoria() {
  return bottoneCreaCategoria;
 }

 public void setBottoneCreaCategoria(JButton bottoneCreaCategoria) {
  this.bottoneCreaCategoria = bottoneCreaCategoria;
 }

 public JButton getBottoneIndietro() {
  return bottoneIndietro;
 }

 public void setBottoneIndietro(JButton bottoneIndietro) {
  this.bottoneIndietro = bottoneIndietro;
 }
 

}
