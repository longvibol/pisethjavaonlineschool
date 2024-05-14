package com.piseth.school.account.config;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.piseth.school.account.entity.userInfo;
import com.piseth.school.account.entity.course;
import com.piseth.school.account.repository.UserAccountRepository;
import com.piseth.school.account.repository.categoryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
@RequiredArgsConstructor
public class SetupUserAccountRunner implements CommandLineRunner{
	
	private final categoryRepository customerRepository;
	private final UserAccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {	
		

		course customer = new course();
		customer.setCreateDate(LocalDate.now());
		customer.setEmail("vibollong@gmail.com");
		customer.setMobileNumber("099 8888 8888");
		customer.setName("Vibol Long");
		
		//we want to save the customer and account to DB
		
		customerRepository.save(customer);
		
		userInfo account = new userInfo();
		account.setAccountNumber(1L);
		account.setAccountType("Saving");
		account.setBranchAddress("Phnom Penh");
		account.setCreateDate(LocalDate.now());
		account.setCustomer(customer);
		accountRepository.save(account);
		log.debug("Account create");
		
	}

}
