import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class FrameLogin {

	private JFrame frame;
	
	private JTextField txtUser;
	private JTextField txtPass;
	private JLabel lblUser;
	private JLabel lblPass;
	private JButton btnLogin;
	private JPanel panel;
	private JButton buttonReturn;
	
	
	public JButton getButtonReturn() {
		return buttonReturn;
	}

	public void setButtonReturn(JButton buttonReturn) {
		this.buttonReturn = buttonReturn;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public FrameLogin() {
		frame = new JFrame("LOGIN");	
		frame.getContentPane().setBackground(Color.ORANGE);
		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.RED);
		
		
		frame.setBounds(555,444,407,188);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		buttonReturn = new JButton("...");
		buttonReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(buttonReturn);
		
		panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBackground(Color.CYAN);
		panel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		lblUser = new JLabel("Username");
		lblUser.setPreferredSize(new Dimension(70, 14));
		panel.add(lblUser);
		txtUser = new JTextField();
		panel.add(txtUser);
		txtUser.setPreferredSize(new Dimension(1000, 20));
		txtUser.setColumns(10);
		lblPass = new JLabel("Password");
		lblPass.setPreferredSize(new Dimension(70, 14));
		panel.add(lblPass);
		txtPass = new JTextField();
		panel.add(txtPass);
		txtPass.setColumns(10);
		frame.getContentPane().add(btnLogin);
	}
	public void rendiVisibile() {
		if(frame.isVisible())
			frame.setVisible(false);
		else
			frame.setVisible(true);
	}
	
	public JTextField getTxtUser() {
		return txtUser;
	}
	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}
	public JTextField getTxtPass() {
		return txtPass;
	}
	public void setTxtPass(JTextField txtPass) {
		this.txtPass = txtPass;
	}
}