package beans;

public class User {
	
	private String email = "";
	private String password = "";
	
	private String message = "";
	
	public User() {
		
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}
	
	public boolean validate() {
		if (email == null || password == null) {
			message = "Invalid user address or password";
			return false;
		} else if (email.equals("") || password.equals("")) {
			message = "Blank fields not permissable";
			return false;
		}
		return true;
	}
	
	

}
