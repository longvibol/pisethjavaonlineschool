package com.piseth.school.account.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piseth.school.account.entity.course;

@Component
public interface courseService {

	course save(course customer);
	List<course> getCustomers();
	course getById(Long id);
}
