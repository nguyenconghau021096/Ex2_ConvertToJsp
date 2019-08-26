package JavaBean;

import java.io.Serializable;

public class UserBean implements Serializable{
	private String username;
	private String email;
	private int gender;
	private String password;
	
	
	
	public UserBean() {
		
	}
	
	
	public UserBean(String username, String email, int gender,String password) {
		super();
		this.username = username;
		this.email = email;
		this.gender = gender;
		this.password = password;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	
	
}
