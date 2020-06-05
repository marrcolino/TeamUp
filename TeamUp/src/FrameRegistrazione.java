import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Dimension;

public class FrameRegistrazione {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextPane textPane;
	private JTextPane txtData;
	private JTextPane txtNome;
	private JTextPane txtCognome;
	private JTextPane txtUsername;
	private JTextPane txtPassword;
	private JButton btnRegistrati;
	private JTextPane txtEmail;
	private JTextPane txtCompetenze ;
	private JButton buttonReturn;
	
	public JButton getButtonReturn() {
		return buttonReturn;
	}

	public void setButtonReturn(JButton buttonReturn) {
		this.buttonReturn = buttonReturn;
	}

	public FrameRegistrazione() {
		frame = new JFrame("REGISTRAZIONE");
		frame.setResizable(false);
		frame.setMinimumSize(new Dimension(700, 600));
		frame.getContentPane().setPreferredSize(new Dimension(255, 555));
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.getContentPane().setLayout(null);
		frame.setBounds(555,444,396,156);
		
		lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(153, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cognome");
		lblNewLabel_1.setBounds(153, 173, 81, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Data nascita\r\n(anno/mese/giorno)");
		lblNewLabel_2.setBounds(153, 211, 219, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setBounds(153, 253, 81, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setBounds(153, 295, 81, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Completa tutti i campi per la registrazione");
		lblNewLabel_5.setBounds(135, 49, 343, 66);
		lblNewLabel_5.setForeground(new Color(0, 0, 139));
		lblNewLabel_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_5);
		
		textPane = new JTextPane();
		textPane.setBounds(304, 241, -18, 20);
		frame.getContentPane().add(textPane);
		
		txtData = new JTextPane();
		txtData.setBounds(406, 211, 164, 20);
		frame.getContentPane().add(txtData);
		
		txtNome = new JTextPane();
		txtNome.setBounds(406, 126, 164, 20);
		frame.getContentPane().add(txtNome);
		
		txtCognome = new JTextPane();
		txtCognome.setBounds(406, 167, 164, 20);
		frame.getContentPane().add(txtCognome);
		
		txtUsername = new JTextPane();
		txtUsername.setBounds(406, 253, 164, 20);
		frame.getContentPane().add(txtUsername);
		
		txtPassword = new JTextPane();
		txtPassword.setBounds(406, 295, 164, 20);
		frame.getContentPane().add(txtPassword);
		
		btnRegistrati = new JButton("REGISTRATI");
		btnRegistrati.setBounds(291, 450, 156, 51);
		btnRegistrati.setBackground(new Color(255, 69, 0));
		btnRegistrati.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(btnRegistrati);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(153, 339, 57, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCompetenze = new JLabel("Competenze");
		lblCompetenze.setBounds(153, 384, 107, 14);
		frame.getContentPane().add(lblCompetenze);
		
		txtEmail = new JTextPane();
		txtEmail.setBounds(406, 339, 164, 20);
		frame.getContentPane().add(txtEmail);
		
		txtCompetenze = new JTextPane();
		txtCompetenze.setBounds(406, 378, 164, 20);
		frame.getContentPane().add(txtCompetenze);
		
		buttonReturn = new JButton("...");
		buttonReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonReturn.setBounds(21, 21, 57, 32);
		frame.getContentPane().add(buttonReturn);
	}

	public void rendiVisibile() {
		if(frame.isVisible())
			frame.setVisible(false);
		else
			frame.setVisible(true);
	}
	
	public JTextPane getTextPane() {
		return textPane;
	}

	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}

	public JTextPane getTxtData() {
		return txtData;
	}

	public void setTxtData(JTextPane txtData) {
		this.txtData = txtData;
	}

	public JTextPane getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextPane txtNome) {
		this.txtNome = txtNome;
	}

	public JTextPane getTxtCognome() {
		return txtCognome;
	}

	public void setTxtCognome(JTextPane txtCognome) {
		this.txtCognome = txtCognome;
	}

	public JTextPane getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(JTextPane txtUsername) {
		this.txtUsername = txtUsername;
	}

	public JTextPane getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(JTextPane txtPassword) {
		this.txtPassword = txtPassword;
	}

	public JButton getBtnRegistrati() {
		return btnRegistrati;
	}

	public void setBtnRegistrati(JButton btnRegistrati) {
		this.btnRegistrati = btnRegistrati;
	}

	public JTextPane getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextPane txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextPane getTxtCompetenze() {
		return txtCompetenze;
	}

	public void setTxtCompetenze(JTextPane txtCompetenze) {
		this.txtCompetenze = txtCompetenze;
	}
}
	