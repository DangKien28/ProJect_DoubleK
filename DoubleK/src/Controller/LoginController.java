package Controller;

import View.TradeManagementView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Login_GUI;

public class LoginController implements ActionListener {
	private Login_GUI loginView;
	
	public void setLogin(Login_GUI a)
	{
		this.loginView = a;
	}
	public Login_GUI getLoginView()
	{
		return this.loginView;
	}
	
	public LoginController(Login_GUI logView)
	{
		this.loginView = logView;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		this.confirm();
	}
	public void confirm()
	{
		String a = this.getLoginView().getUserField().getText();
		char[] b = this.getLoginView().getPassField().getPassword();
		String c = new String(b);
		
		if (a.equals("admin") && c.equals("123456"))
		{
//			this.getLoginView().notificate();
			System.out.println("Login success");
			this.getLoginView().dispose();
			TradeManagementView tradeManage = new TradeManagementView();
			tradeManage.setVisible(true);
		}
		else
		{
			System.out.println("Sai ten dang nhap hoac mat khau");
			this.getLoginView().getLogStatusItem().setText("The username or password was wrong! Try again");
		}
			
	}

}