package com.piseth.school.account.entity;

import java.time.LocalDate;

import org.springframework.boot.actuate.endpoint.web.Link;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class userAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	private Long userId;
	private String userName;
	private String userPassword;
	private String personalEmail;
	private Long paymentTerm;
	private LocalDate createDate;
	}

//Java basic + Java advance + spring boot Registration
//Name: Nhoem Ponleu 
//Name in telegram: Nhoem Ponleu 
//Occupation : Developer
//Year of birth: 2001
//Province of birth:Takeo 
//Course fee: 112.5$
//Personal Email: ponleun@gmail.com


