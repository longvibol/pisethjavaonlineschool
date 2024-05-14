package com.piseth.school.account.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class category {

	private Long categoryId;
	private List<String> categoryList;
	private LocalDateTime proposeDate;
}

//categoryList : studentRequest, project, homework, research, Q&S  
