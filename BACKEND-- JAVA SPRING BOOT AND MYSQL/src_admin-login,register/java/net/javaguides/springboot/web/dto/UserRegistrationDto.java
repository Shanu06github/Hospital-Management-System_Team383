package net.javaguides.springboot.web.dto;

public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	private String age;
	private String password;
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String firstName, String lastName, String email, String age, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.password = password;
	}
	
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
