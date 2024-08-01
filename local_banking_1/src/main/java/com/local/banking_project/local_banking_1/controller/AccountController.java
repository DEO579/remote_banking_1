package com.local.banking_project.local_banking_1.controller;

import com.local.banking_project.local_banking_1.dto.AccountDto;
import com.local.banking_project.local_banking_1.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    /*add account rest api controller method*/
    @PostMapping
    //url http://localhost:8080/api/accounts
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
}