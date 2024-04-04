package com.example.ProBlogger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(columnDefinition = "boolean default false")
    private Boolean is_employee;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String username;

//  no parameters constructor   
	public User() {
		
	}

	//	parameterized constructor 
	public User(Long _id, String username, String password, String email, boolean is_employee) {
		super();
		this._id = _id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.is_employee = is_employee;
	}

//	getters and setters
	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isIs_employee() {
		return is_employee;
	}

	public void setIs_employee(boolean is_employee) {
		this.is_employee = is_employee;
	}

	@Override
	public String toString() {
		return "User [_id=" + _id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", is_employee=" + is_employee + "]";
	}
	
	
}
