package com.example.hausverwalter.repos;

import com.example.hausverwalter.entity.EntityApartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<EntityApartment, Long> {

}
