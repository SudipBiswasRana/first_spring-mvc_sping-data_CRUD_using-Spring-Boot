package com.rana.mvc.base.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="donortable")
public class Donor 
{
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private Long  id;
     
     @Column(name="first_name")
     @NotBlank(message="You Must Provide Your First Name")
     private String firstName ;
     
     @Column(name="last_name")
     @NotBlank(message="You Must Provide Your Last Name")
     private String lastName;
     
     @Column(name="phone_no")
     private String phNo ;
     
     @Column(name="blood")
     @NotBlank
     private String bloodTypes;
     
     
     public Donor() {
	}

	public Donor(Long id, String firstName, String lastName, String bloodTypes) {
 		super();
 		this.id = id;
 		this.firstName = firstName;
 		this.lastName = lastName;
 		this.bloodTypes = bloodTypes;
 	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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




	public String getBloodTypes() {
		return bloodTypes;
	}

	public void setBloodTypes(String bloodTypes) {
		this.bloodTypes = bloodTypes;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	

	


     
}
