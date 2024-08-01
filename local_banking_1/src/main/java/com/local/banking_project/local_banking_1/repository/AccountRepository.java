package com.local.banking_project.local_banking_1.repository;

import com.local.banking_project.local_banking_1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}

