package model;

public class User {

	private String name;
	private String lastname;
	private String id;
	private String email;
	private String phone;

	public User(String name, String lastname, String id, String email, String phone) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	
	

	@Override
	public String toString() {
		return "User info: \n Full Name: " + name + " " + lastname + "\n Email: " + email;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
}
