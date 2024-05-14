package com.piseth.school.account.entity;

import java.time.LocalDate;
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
public class promotion {

	private Long promotionId;
	private List<String> promotionType;
	private Long categoryId;
	private Long discount;
	private LocalDate period;
}

// promotionType: register 3 couser free 1 course 

