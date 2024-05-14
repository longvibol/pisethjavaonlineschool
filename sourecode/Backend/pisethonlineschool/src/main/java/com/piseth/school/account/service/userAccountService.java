package com.piseth.school.account.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piseth.school.account.entity.userInfo;
import com.piseth.school.account.entity.course;

@Component
public interface userAccountService {

	userInfo save(userInfo account);
	List<userInfo> getAccounts();
	userInfo getById(Long id);
}
