package com.IkhsanKurniawanJPlane;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "balance", nullable = false)
    private int balance;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public Account() {
        this.username = "";
        this.password = "";
        this.balance = 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username=" + username +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
