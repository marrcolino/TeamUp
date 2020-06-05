import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;

public class FrameHome {

	private JFrame frame;
	private JLabel lblUser;
	private JButton btnLogin;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnVisualizzaCategorieTeam;
	private JButton btnRegistrati;
	
	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public FrameHome() {
		frame = new JFrame("LOGIN");	
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.ORANGE);
		btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(473, 100, 114, 55);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.RED);
		
		
		frame.setBounds(555,444,633,494);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(63, 26, 332, 50);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBackground(Color.CYAN);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		lblUser = new JLabel("Benvenuto in Teamup");
		lblUser.setMaximumSize(new Dimension(200, 20));
		lblUser.setForeground(new Color(0, 0, 128));
		lblUser.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 24));
		lblUser.setPreferredSize(new Dimension(250, 40));
		panel.add(lblUser);
		frame.getContentPane().add(btnLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.CYAN);
		panel_1.setAlignmentX(0.0f);
		panel_1.setBounds(27, 100, 388, 189);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("-Realizza i tuoi progetti");
		lblNewLabel.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 11, 188, 20);
		lblNewLabel.setPreferredSize(new Dimension(120, 20));
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("-Molti utenti gia' iscritti ti aspettano per farti unire ai loro team");
		lblNewLabel_1.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(10, 28, 368, 39);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("-Crea il tuo team ideale e gestiscilo");
		lblNewLabel_2.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(10, 65, 283, 20);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("-Lascia che gli altri utenti si uniscano al tuo team");
		lblNewLabel_3.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(10, 91, 337, 20);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("I tuoi sogni diventeranno realta'...");
		lblNewLabel_4.setFont(new Font("Source Sans Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(62, 136, 277, 20);
		panel_1.add(lblNewLabel_4);
		
		btnRegistrati = new JButton("REGISTRATI");
		btnRegistrati.setForeground(Color.BLACK);
		btnRegistrati.setBackground(Color.RED);
		btnRegistrati.setBounds(473, 191, 114, 55);
		frame.getContentPane().add(btnRegistrati);
		
		btnVisualizzaCategorieTeam = new JButton("VISUALIZZA CATEGORIE TEAM GIA' ESISTENTI");
		btnVisualizzaCategorieTeam.setFont(new Font("Stencil", Font.ITALIC, 13));
		btnVisualizzaCategorieTeam.setToolTipText("");
		btnVisualizzaCategorieTeam.setForeground(new Color(0, 0, 0));
		btnVisualizzaCategorieTeam.setBackground(UIManager.getColor("Button.focus"));
		btnVisualizzaCategorieTeam.setBounds(27, 326, 356, 93);
		frame.getContentPane().add(btnVisualizzaCategorieTeam);
		frame.setVisible(true);
	}
	
	public JButton getBtnRegistrati() {
		return btnRegistrati;
	}

	public void setBtnRegistrati(JButton btnRegistrati) {
		this.btnRegistrati = btnRegistrati;
	}

	public JButton getBtnVisualizzaCategorieTeam() {
		return btnVisualizzaCategorieTeam;
	}

	public void setBtnVisualizzaCategorieTeam(JButton btnVisualizzaCategorieTeam) {
		this.btnVisualizzaCategorieTeam = btnVisualizzaCategorieTeam;
	}

	public void rendiVisibile() {
		if(frame.isVisible())
			frame.setVisible(false);
		else
			frame.setVisible(true);
	}
	
}