package com.piseth.school.account.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piseth.school.account.entity.userAccount;
import com.piseth.school.account.repository.UserAccountRepository;
import com.piseth.school.account.service.userAccountService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl implements userAccountService {

	private final UserAccountRepository AccountRepository;

	@Override
	public userAccount save(userAccount Account) {

		return AccountRepository.save(Account);

	}

	@Override
	public List<userAccount> getAccounts() {
		return AccountRepository.findAll();
	}

	@Override
	public userAccount getById(Long id) {
		return AccountRepository.findById(id).
				orElseThrow(()-> new RuntimeException("Account not found"));
	}

}
