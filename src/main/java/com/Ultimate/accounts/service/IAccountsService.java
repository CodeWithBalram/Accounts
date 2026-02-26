package com.Ultimate.accounts.service;

import com.Ultimate.accounts.dto.CustomerDto;

public interface IAccountsService
{
    void createAccounts(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String  mobileNumber);
}
