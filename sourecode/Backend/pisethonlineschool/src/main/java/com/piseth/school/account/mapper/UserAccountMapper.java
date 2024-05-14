package com.piseth.school.account.mapper;

import org.springframework.stereotype.Component;

import com.piseth.school.account.dto.AccountDTO;
import com.piseth.school.account.entity.userInfo;

@Component
public class UserAccountMapper {

	public userInfo toAccount(AccountDTO dto) {

		userInfo account = new userInfo();
		account.setAccountNumber(dto.getAccountNumber());
		account.setAccountType(dto.getAccountType());
		account.setBranchAddress(dto.getBranchAddress());
		account.setCreateDate(dto.getCreateDate());
		//account.setCustomerId(dto.getCustomerId());
		
		return account;
	}

}
