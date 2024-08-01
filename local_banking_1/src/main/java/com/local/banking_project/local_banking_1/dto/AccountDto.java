package com.local.banking_project.local_banking_1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private  Long id;
    private String accountHolderName;
    private double balance;
}
