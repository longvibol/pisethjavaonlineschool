package com.piseth.school.account.mapper;

import org.springframework.stereotype.Component;

import com.piseth.school.account.dto.AccountDTO;
import com.piseth.school.account.entity.userAccount;

@Component
public class UserAccountMapper {

	public userAccount toAccount(AccountDTO dto) {

		userAccount account = new userAccount();
		account.setAccountNumber(dto.getAccountNumber());
		account.setAccountType(dto.getAccountType());
		account.setBranchAddress(dto.getBranchAddress());
		account.setCreateDate(dto.getCreateDate());
		//account.setCustomerId(dto.getCustomerId());
		
		return account;
	}

}
