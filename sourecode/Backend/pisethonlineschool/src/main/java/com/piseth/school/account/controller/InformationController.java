package com.piseth.school.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piseth.school.account.dto.AccountDTO;
import com.piseth.school.account.entity.userAccount;
import com.piseth.school.account.mapper.UserAccountMapper;
import com.piseth.school.account.service.userAccountService;

@RestController
@RequestMapping("api/accounts")
public class InformationController {

	@Autowired
	private userAccountService accountService;

	@Autowired
	private UserAccountMapper accountMapper;

	@PostMapping
	public ResponseEntity<?> saveAccount(@RequestBody AccountDTO dto) {

		userAccount account = accountMapper.toAccount(dto);

		account = accountService.save(account);
		return ResponseEntity.ok(account);
	}
	
	@GetMapping
	public ResponseEntity<?> getAccounts(){
		
		return ResponseEntity.ok(accountService.getAccounts());
		
	}
	
	@GetMapping("{accountId}")
	public ResponseEntity<?> getAccounts(@PathVariable Long accountId){
		
		return ResponseEntity.ok(accountService.getById(accountId));
		
	}
	
	
	
	
	

}



















