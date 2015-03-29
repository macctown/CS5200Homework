package model;

import java.sql.Date;

public class Actor {
	private String id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	public void setId(String id) {
	     this.id = id;
	}
	
	public String getId() {
	     return id;
	}
	
	
	public void setFirstName(String firstName) {
	     this.firstName = firstName;
	}
	
	public String getFirstName() {
	     return firstName;
	}
	
	
	public void setLastName(String lastName) {
	     this.lastName = lastName;
	}
	
	public String getLastName() {
	     return lastName;
	}
	
	
	
	public void setDateOfBirth(Date dateOfBirth) {
	     this.dateOfBirth = dateOfBirth;
	}
	
	public Date getDateOfBirth() {
	     return dateOfBirth;
	}
	
	
	public Actor(String id, String firstName, String lastName, Date dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Actor() {
		super();
	}
}
