package com.piseth.school.account.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piseth.school.account.entity.userInfo;
import com.piseth.school.account.repository.UserAccountRepository;
import com.piseth.school.account.service.userAccountService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements userAccountService {

	private final UserAccountRepository AccountRepository;

	@Override
	public userInfo save(userInfo Account) {

		return AccountRepository.save(Account);

	}

	@Override
	public List<userInfo> getAccounts() {
		return AccountRepository.findAll();
	}

	@Override
	public userInfo getById(Long id) {
		return AccountRepository.findById(id).
				orElseThrow(()-> new RuntimeException("Account not found"));
	}

}
