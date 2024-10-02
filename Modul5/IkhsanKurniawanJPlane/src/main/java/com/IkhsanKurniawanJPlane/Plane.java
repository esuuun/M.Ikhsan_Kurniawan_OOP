package com.IkhsanKurniawanJPlane;

import jakarta.persistence.*;

@Entity
@Table(name = "planes")
public class Plane{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", nullable = false)
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "departure_city", nullable = false)
    private City departureCity;

    @Enumerated(EnumType.STRING)
    @Column(name = "arrival_city", nullable = false)
    private City arrivalCity;

    public Plane(String code, City departureCity, City arrivalCity) {
        this.code = code;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }


    public Plane() {
        this.code = "";
        this.departureCity = null;
        this.arrivalCity = null;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", code= " + code +
                ", departureCity=" + departureCity +
                ", arrivalCity=" + arrivalCity +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public City getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(City departureCity) {
        this.departureCity = departureCity;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(City arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
}
