package com.IkhsanKurniawanJPlane.service;

import com.IkhsanKurniawanJPlane.Account;
import com.IkhsanKurniawanJPlane.Plane;
import com.IkhsanKurniawanJPlane.Ticket;
import com.IkhsanKurniawanJPlane.repository.AccountRepository;
import com.IkhsanKurniawanJPlane.repository.PlaneRepository;
import com.IkhsanKurniawanJPlane.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private PlaneRepository planeRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Ticket getTicket(Long ticketID){
        Ticket ticket = ticketRepository.findById(ticketID).orElseThrow(() -> new RuntimeException("Ticket not found"));
        return ticket;
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    public Ticket bookTicket(Long buyerId, Long planeId, String code){
        Plane plane =  planeRepository.findById(planeId).orElseThrow(() -> new RuntimeException("Plane not found"));
        Account buyer = accountRepository.findById(buyerId).orElseThrow(() -> new RuntimeException("Buyer not found"));

        Ticket ticket = new Ticket(buyer, plane, code);

        buyer.setBalance(buyer.getBalance() - 100000);

        ticketRepository.save(ticket);
        accountRepository.save(buyer);

        return ticket;
    }

}
