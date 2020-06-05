import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CategorieTeamSenzaLogin {

	private JFrame frame;
	private JPanel panel;
    private JPanel panel_1;
    
    public JMenu getMenuCategorie() {
		return menuCategorie;
	}
	public void setMenuCategorie(JMenu menuCategorie) {
		this.menuCategorie = menuCategorie;
	}
	public JMenu getMenuProgetti() {
		return menuProgetti;
	}
	public void setMenuProgetti(JMenu menuProgetti) {
		this.menuProgetti = menuProgetti;
	}

	private JButton btnLogin;
    private JButton btnRegistrazione;
    private JMenu menuCategorie;
    private JMenu menuProgetti;
    private JMenuBar menuBarProgetti;
    private JMenuBar menuBarCategorie;
    private JLabel lblNewLabel_1;
	private ArrayList<Progetto> progetti;
	private JButton buttonReturn;
	
	public CategorieTeamSenzaLogin() {
		frame = new JFrame("VISUALIZZA CATEGORIE");	
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(555,444,605,438);
		
		frame.setBounds(555,444,622,478);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Ecco cosa ti offriamo...");
	    lblNewLabel.setForeground(Color.RED);
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
	    lblNewLabel.setBounds(82, 38, 244, 39);
	    frame.getContentPane().add(lblNewLabel);
	    panel = new JPanel();
	    panel.setBackground(Color.CYAN);
	    panel.setBounds(47, 117, 216, 194);
	    frame.getContentPane().add(panel);
	    panel.setLayout(null);
	    
	    progetti= new ArrayList<Progetto>();
	    
	    JLabel lblCategoriePresenti = new JLabel("CATEGORIE PRESENTI");
	    lblCategoriePresenti.setBounds(10, 11, 196, 24);
	    panel.add(lblCategoriePresenti);
	    lblCategoriePresenti.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    
	    panel_1 = new JPanel();
	    panel_1.setBackground(Color.CYAN);
	    panel_1.setBounds(287, 117, 216, 194);
	    frame.getContentPane().add(panel_1);
	    panel_1.setLayout(null);
	    
	    
	   
	    
	    JLabel lblTeamPreseti = new JLabel("TEAM PRESENTI");
	    lblTeamPreseti.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	    lblTeamPreseti.setBounds(29, 11, 156, 21);
	    panel_1.add(lblTeamPreseti);
	    
	    btnLogin = new JButton("LOGIN");
	    btnLogin.setBounds(416, 22, 108, 39);
	    btnLogin.setBackground(Color.RED);
	    frame.getContentPane().add(btnLogin);
	    
	    menuBarCategorie = new JMenuBar();
	    menuBarCategorie.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent arg0) {
	    		frame.setVisible(false);
	    	}
	    });
	    menuBarCategorie.setBounds(47, 44, 122, 45);
	    panel.add(menuBarCategorie);
	    menuCategorie = new JMenu("Categorie");
	    menuCategorie.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		frame.setVisible(false);
	    	}
	    });
	    menuCategorie.setFont(new Font("Sakkal Majalla", Font.BOLD | Font.ITALIC, 19));
	    menuCategorie.setPreferredSize(new Dimension(200, 100));
	    JMenuItem item1 = new JMenuItem("Programmatore");
	    item1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		frame.setVisible(false);
	    	}
	    });
	    JMenuItem item2 = new JMenuItem("Programmatore");
	    JMenuItem item3 = new JMenuItem("Programmatore");
	    menuBarCategorie.add(menuCategorie);
	    menuCategorie.add(item1);
	    menuCategorie.add(item2);
	    menuCategorie.add(item3);
	    
	    
	    
	    menuBarProgetti = new JMenuBar();
	    menuBarProgetti.setBounds(39, 43, 122, 45);
	    menuProgetti = new JMenu("Progetti");
	    menuProgetti.setFont(new Font("Sakkal Majalla", Font.BOLD | Font.ITALIC, 19));
	    menuProgetti.setPreferredSize(new Dimension(200, 100));
	    JMenuItem item4 = new JMenuItem("Programmatore");
	    JMenuItem item5 = new JMenuItem("Programmatore");
	    JMenuItem item6 = new JMenuItem("Programmatore");
	    menuBarProgetti.add(menuProgetti);
	    menuProgetti.add(item4);
	    menuProgetti.add(item5);
	    menuProgetti.add(item6);
	    panel_1.add(menuBarProgetti);
	    
	    btnRegistrazione = new JButton("REGISTRATI");
	    btnRegistrazione.setBounds(416, 61, 108, 39);
	    btnRegistrazione.setBackground(Color.RED);
	    frame.getContentPane().add(btnRegistrazione);
	    
	    lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setAutoscrolls(true);
	    lblNewLabel_1.setBounds(28, 322, 552, 76);
	    frame.getContentPane().add(lblNewLabel_1);
	    
	    buttonReturn = new JButton("...");
	    buttonReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    buttonReturn.setBounds(47, 11, 47, 31);
	    frame.getContentPane().add(buttonReturn);
	    
	    
	}
	public JButton getButtonReturn() {
		return buttonReturn;
	}
	public void setButtonReturn(JButton buttonReturn) {
		this.buttonReturn = buttonReturn;
	}
	public JMenuBar getMenuBarProgetti() {
		return menuBarProgetti;
	}
	public void setMenuBarProgetti(JMenuBar menuBarProgetti) {
		this.menuBarProgetti = menuBarProgetti;
	}
	public JMenuBar getMenuBarCategorie() {
		return menuBarCategorie;
	}
	public void setMenuBarCategorie(JMenuBar menuBarCategorie) {
		this.menuBarCategorie = menuBarCategorie;
	}
	public void rendiVisibile() {
		if(frame.isVisible())
			frame.setVisible(false);
		else
			frame.setVisible(true);
	}
	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	
	  
	public void aggiungiProgetto(String progetto) {
		menuProgetti.add(new JMenuItem(progetto));
	}
	public JButton getBtnRegistrazione() {
		return btnRegistrazione;
	}
	public void setBtnRegistrazione(JButton btnRegistrazione) {
		this.btnRegistrazione = btnRegistrazione;
	}
	
}
