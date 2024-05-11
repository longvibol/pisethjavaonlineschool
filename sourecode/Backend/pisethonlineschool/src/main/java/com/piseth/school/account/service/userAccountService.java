package com.piseth.school.account.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piseth.school.account.entity.userAccount;
import com.piseth.school.account.entity.course;

@Component
public interface userAccountService {

	userAccount save(userAccount account);
	List<userAccount> getAccounts();
	userAccount getById(Long id);
}
