package com.IkhsanKurniawanJPlane.service;

import com.IkhsanKurniawanJPlane.Account;
import com.IkhsanKurniawanJPlane.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account registerAccount(String username, String password) {
        Account user = new Account(username, password);
        return accountRepository.save(user);
    }

    public List<Account> getAllUsers() {
        return accountRepository.findAll();
    }

    public Account topUpBalance(Long accountId, String username, String password, int amount){
        Account account = accountRepository.findById(accountId))
        ;

    }
}
