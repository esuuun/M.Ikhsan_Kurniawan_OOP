package com.IkhsanKurniawanJPlane;

import com.IkhsanKurniawanJPlane.service.AccountService;
import com.IkhsanKurniawanJPlane.service.TicketService;
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

    @Autowired
    private TicketService ticketService;

    public static void main(String[] args) {
        SpringApplication.run(IkhsanJPlaneApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer (){
        return args -> {
//            accountService.registerAccount("Ikhsan", "inipassword"); //ganti username dengan nama kalian dan password nya bebas (jangan password asli yaa)
            List<Account> accounts = accountService.getAllUsers();
            accounts.forEach(account -> System.out.println(account));

//            Account{id=32, username=Ikhsan, password=inipassword, balance=0}

            Account account = accountService.topUpBalance(32L, "Ikhsan","inipassword", 200000);
            Ticket ticket = ticketService.bookTicket(32L, 1L, "KL784");

            System.out.println("Added ticket:");
            System.out.println(ticketService.getTicket(ticket.getId()));

            System.out.println("All ticket:");
            List<Ticket> tickets = ticketService.getAllTickets();
            tickets.forEach(x -> System.out.println(x));

            List<Account> updatedAccounts = accountService.getAllUsers();
            System.out.println("All accounts updated:");
            updatedAccounts.forEach(x -> System.out.println(x));


        };
    }
}
