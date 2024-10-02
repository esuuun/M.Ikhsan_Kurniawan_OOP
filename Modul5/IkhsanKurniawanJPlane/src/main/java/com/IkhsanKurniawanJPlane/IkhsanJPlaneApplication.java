package com.IkhsanKurniawanJPlane;

import com.IkhsanKurniawanJPlane.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class IkhsanJPlaneApplication {

    @Autowired
    private AccountService accountService;


    public static void main(String[] args) {
        SpringApplication.run(IkhsanJPlaneApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer (){
        return args -> {
            accountService.registerAccount("Ikhsan", "inipassword"); //ganti username dengan nama kalian dan password nya bebas (jangan password asli yaa)
            List<Account> accounts = accountService.getAllUsers();
            accounts.forEach(account -> System.out.println(account));
        };
    }
}
