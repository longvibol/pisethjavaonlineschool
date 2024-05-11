package com.piseth.school.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piseth.school.account.entity.userAccount;


public interface UserAccountRepository extends JpaRepository<userAccount, Long>{

	
}
