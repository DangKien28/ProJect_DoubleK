package View;

import Model.login;

import Controller.LoginController;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Login_GUI extends JFrame {
	
	private login log;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userField;
	private JPasswordField passwordField;
	private JLabel uLbl;
	private JLabel pLbl;
	private JButton loginBtn;
	private JLabel logStatusItem;

	public void setLog(login log)
	{
		this.log = log;
	}
	
	public login getLog()
	{
		return this.log;
	}
	public void setUserField(JTextField a)
	{
		this.userField = a;
	}
	public JTextField getUserField()
	{
		return this.userField;
	}
	public void setPassField(JPasswordField a)
	{
		this.passwordField = a;
	}
	public JPasswordField getPassField()
	{
		return this.passwordField;
	}
		
	public JLabel getLogStatusItem() {
		return logStatusItem;
	}

	public void setLogStatusItem(JLabel logStatusItem) {
		this.logStatusItem = logStatusItem;
	}

	/**
	 * Create the frame.
	 */
	public Login_GUI()
	{
		this.log = new login();
		this.init();
		this.setVisible(true);
	}
	public void init()
	{
		setBackground(new Color(0, 128, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		uLbl = new JLabel("Username");
		uLbl.setForeground(new Color(230, 230, 250));
		uLbl.setBackground(new Color(231, 29, 170));
		uLbl.setBounds(34, 47, 65, 13);
		contentPane.add(uLbl);
		
		pLbl = new JLabel("Password");
		pLbl.setForeground(new Color(230, 230, 250));
		pLbl.setBounds(34, 101, 65, 13);
		contentPane.add(pLbl);
		
		userField = new JTextField();
		userField.setBounds(123, 44, 178, 24);
		contentPane.add(userField);
		userField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 96, 178, 24);
		contentPane.add(passwordField);
		
		logStatusItem = new JLabel("");
		logStatusItem.setBounds(55, 180, 299, 73);
		contentPane.add(logStatusItem);
		
		
		ActionListener ac = new LoginController(this);
		loginBtn = new JButton("Login");
		loginBtn.setBackground(new Color(106, 90, 205));
		loginBtn.setForeground(new Color(176, 224, 230));
		loginBtn.setBounds(156, 149, 85, 21);
		contentPane.add(loginBtn);
		
		loginBtn.addActionListener(ac);
		
	}
}
