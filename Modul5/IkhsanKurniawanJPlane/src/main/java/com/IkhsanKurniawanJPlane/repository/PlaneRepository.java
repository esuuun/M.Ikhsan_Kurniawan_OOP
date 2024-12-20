package com.IkhsanKurniawanJPlane.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.IkhsanKurniawanJPlane.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
    Plane findFirstByCode(String code);
}