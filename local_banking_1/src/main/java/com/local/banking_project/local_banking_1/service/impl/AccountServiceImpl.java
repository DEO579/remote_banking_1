package com.local.banking_project.local_banking_1.service.impl;

import com.local.banking_project.local_banking_1.dto.AccountDto;
import com.local.banking_project.local_banking_1.entity.Account;
import com.local.banking_project.local_banking_1.mapper.AccountMapper;
import com.local.banking_project.local_banking_1.repository.AccountRepository;
import com.local.banking_project.local_banking_1.service.AccountService;
import org.springframework.stereotype.Service;


    @Service
    public class AccountServiceImpl implements AccountService {
        private AccountRepository accountRepository;

        public AccountServiceImpl(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }
        //add account rest api implementation method
        @Override
        public AccountDto createAccount(AccountDto accountDto) {
            Account account = AccountMapper.mapToAccount(accountDto);
            Account savedAccount = accountRepository.save(account);
            return AccountMapper.mapToAccountDto(savedAccount);
        }
    }

