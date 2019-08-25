package JavaBean;

import java.io.Serializable;

public class UserBean implements Serializable{
	private String username = null;
	private String email = null;
	private String gender = null;
	private String password = null;
	
	
	
	public UserBean() {
		super();
	}
	
	
	public UserBean(String username, String email, String gender,String password) {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}