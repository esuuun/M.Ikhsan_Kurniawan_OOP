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
        Account admin = accountRepository.findById(accountId).orElseThrow(() -> new RuntimeException("Ticket not found"));

        if(admin.getUsername().equals(username) && admin.getPassword().equals(password)){
            admin.setBalance(admin.getBalance() + amount);
            accountRepository.save(admin);
            return admin;
        }else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
