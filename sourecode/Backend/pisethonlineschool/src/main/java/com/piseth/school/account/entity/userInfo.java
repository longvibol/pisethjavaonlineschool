package com.piseth.school.account.entity;

import java.time.LocalDate;
import java.util.List;

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
public class userInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private Long promotionId;
	private LocalDate registerDate;
	private List<String> courseRegister;
	private List<String> compeleteCourse;
	private List<String> Course;
	private Link telegramName;
	private String occupation;
	private LocalDate dateOfBirth;
	private String addressInfo;
	private String emailInfo;

}

//Java basic + Java advance + spring boot Registration
//Name: Nhoem Ponleu 
//Name in telegram: Nhoem Ponleu 
//Occupation : Developer
//Year of birth: 2001
//Province of birth:Takeo 
//Course fee: 112.5$
//Personal Email: ponleun@gmail.com
