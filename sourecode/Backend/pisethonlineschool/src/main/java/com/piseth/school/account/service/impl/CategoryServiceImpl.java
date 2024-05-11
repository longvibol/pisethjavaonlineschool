package com.piseth.school.account.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piseth.school.account.entity.course;
import com.piseth.school.account.repository.categoryRepository;
import com.piseth.school.account.service.categoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements categoryService {

	private final categoryRepository customerRepository;

	@Override
	public course save(course customer) {

		return customerRepository.save(customer);

	}

	@Override
	public List<course> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public course getById(Long id) {
		return customerRepository.findById(id).
				orElseThrow(()-> new RuntimeException("Customer not found"));
	}

}
