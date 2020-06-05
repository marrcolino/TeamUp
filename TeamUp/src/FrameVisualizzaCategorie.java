


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class FrameVisualizzaCategorie {
		 
		 private JFrame frame;
		 private JLabel labelVisualizzazione;
		 private JPanel pannello;
		 private JMenuBar barraMenu;
		 private JMenu menu;
		 private JMenuItem itemMenu;
		 private JMenuItem itemMenu2;
		 private JButton bottoneIndietro;
		 private JButton bottoneScegliCategoria;
		 private JButton bottoneCreaCategoria;
		 
		 
		 
		 
		 
		 public FrameVisualizzaCategorie() {
		  
		  //JFRAME
		  frame = new JFrame("Categorie");
		  frame.setResizable(false);
		  frame.setBounds(500, 150, 500, 400);
		  frame.getContentPane().setBackground(java.awt.Color.orange);
		  frame.getContentPane().setLayout(null);
		  
		  
		  //JLABEL
		  labelVisualizzazione =  new JLabel("Visualizzazione Categorie: ");
		  labelVisualizzazione.setForeground(java.awt.Color.red);
		  labelVisualizzazione.setFont(new Font("Tahoma", Font.BOLD, 21));
		  labelVisualizzazione.setBounds(115, -53, 300, 150);
		  frame.getContentPane().add(labelVisualizzazione);
		  
		  
		  //JPANEL_JMENU
		  pannello = new JPanel();
		  pannello.setBounds(139, 52, 200, 200);
		  pannello.setBackground(Color.cyan);
		  barraMenu = new JMenuBar();
		  menu = new JMenu("Categorie");
		    
		  itemMenu = new JMenuItem("Programmatore"); 
		  itemMenu2 = new JMenuItem("Matematico");
		  barraMenu.add(menu);
		  menu.add(itemMenu);
		  menu.add(itemMenu2);  
		  pannello.add(barraMenu);
		  frame.getContentPane().add(pannello);
		  
		  
		  //JBUTTON
		  bottoneScegliCategoria = new JButton("Scegli Categoria");
		  bottoneScegliCategoria.setFont(new Font("Tahoma", Font.BOLD, 20));
		  bottoneScegliCategoria.setBounds(47, 275, 200, 40);
		  bottoneScegliCategoria.setFocusable(false);
		  bottoneScegliCategoria.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		  frame.getContentPane().add(bottoneScegliCategoria);
		  
		  
		  bottoneCreaCategoria = new JButton("Crea Categoria");
		  bottoneCreaCategoria.setFont(new Font("Tahoma", Font.BOLD, 20));
		  bottoneCreaCategoria.setBounds(257, 275, 200, 40);
		  bottoneCreaCategoria.setFocusable(false);
		  bottoneCreaCategoria.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		  frame.getContentPane().add(bottoneCreaCategoria);
		  
		  
		  bottoneIndietro = new JButton("...");
		  bottoneIndietro.setFont(new Font("Tahoma", Font.BOLD, 20));
		  bottoneIndietro.setBounds(40, 53, 33, 23);
		  bottoneIndietro.setFocusable(false);
		  bottoneIndietro.setBorder(new BevelBorder(BevelBorder.LOWERED,null,null,null,null));
		  frame.getContentPane().add(bottoneIndietro);
		  
		 }
		 
		 
		 // METODO PER RENDERE VISIBILE IL JFRAME
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


		 public JLabel getLabelVisualizzazione() {
		  return labelVisualizzazione;
		 }


		 public void setLabelVisualizzazione(JLabel labelVisualizzazione) {
		  this.labelVisualizzazione = labelVisualizzazione;
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


		 public JMenuItem getItemMenu() {
		  return itemMenu;
		 }


		 public void setItemMenu(JMenuItem itemMenu) {
		  this.itemMenu = itemMenu;
		 }


		 public JMenuItem getItemMenu2() {
		  return itemMenu2;
		 }


		 public void setItemMenu2(JMenuItem itemMenu2) {
		  this.itemMenu2 = itemMenu2;
		 }


		 public JButton getBottoneIndietro() {
		  return bottoneIndietro;
		 }


		 public void setBottoneIndietro(JButton bottoneIndietro) {
		  this.bottoneIndietro = bottoneIndietro;
		 }


		 public JButton getBottoneScegliCategoria() {
		  return bottoneScegliCategoria;
		 }


		 public void setBottoneScegliCategoria(JButton bottoneScegliCategoria) {
		  this.bottoneScegliCategoria = bottoneScegliCategoria;
		 }


		 public JButton getBottoneCreaCategoria() {
		  return bottoneCreaCategoria;
		 }


		 public void setBottoneCreaCategoria(JButton bottoneCreaCategoria) {
		  this.bottoneCreaCategoria = bottoneCreaCategoria;
		 }
			 


			
}
