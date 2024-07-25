package dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;
	private String surName;
	@Column(unique=true)
	private String email;
	private String password;
	private String gender;
	private int age;
	private long phoneNumber;
	private Date dob;
	public User(String fName, String lName, String surName, String email, String password, String gender, int age,
			long phoneNumber, Date dob) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.surName = surName;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
	}
	
}
