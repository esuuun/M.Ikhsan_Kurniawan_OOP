package com.IkhsanKurniawanJPlane.repository;
import com.IkhsanKurniawanJPlane.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
    public Ticket findFirstByCode(String code);
}
