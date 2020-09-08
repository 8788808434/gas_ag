package com.gasagency.gas.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="User")
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="first_name")
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private byte[] panCard;
	private byte[] adharCard;
	private Date dateOfBirth;
	private Date registerDate;
	private LocalAddress localAddress;
	private PermanantAddress permanantAddress;
	private String userName;
	private String password;
	private Integer loginAttempt;
	private Integer status;
	private byte[] profile;
	
}
