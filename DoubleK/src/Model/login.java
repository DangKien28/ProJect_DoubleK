package Model;

public class login {
	private String username;
	private String password;
	
	public login() {}
	public login(String u, String p)
	{
		this.username = u;
		this.password = p;
	}	
	
	public void setUsername(String user)
	{
		this.username = user;
	}
	public void setPassword(String pass)
	{
		this.password = pass;
	}
	public String getUsername()
	{
		return this.username;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public boolean checkLogin(String user, String pass)
	{
		if (this.getUsername().equals(user)&&(this.getPassword().equals(pass)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
