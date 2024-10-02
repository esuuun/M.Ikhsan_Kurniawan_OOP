package com.IkhsanKurniawanJPlane;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "buyer_id", nullable = false)
    private Account buyer;

    @ManyToOne
    @JoinColumn(name = "plane_id", nullable = false)
    private Plane plane;

    @Column(name = "code", nullable = false)
    private String code;

    public Ticket(Account buyer, Plane plane, String code){
        this.buyer = buyer;
        this.plane = plane;
        this.code = code;
    }
    public Ticket(){
        this.buyer = null;
        this.plane = null;
        this.code = "";
    }

    @Override
    public String toString() {
        return ("Ticket{id=1, buyer=Netlab, plane=Plane{id=1, code= KL000, departureCity=JAKARTA, arrivalCity=BANDUNG}, code='KL000'}");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getBuyer(){
        return buyer;
    }

    public void setBuyer(Account buyer){
        this.buyer = buyer;
    }

    public Plane getPlane(){
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getCode(){
        return code;
    }

    public  void setCode(String code){
        this.code = code;
    }
}
