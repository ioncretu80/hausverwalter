package com.example.hausverwalter.repos;

import com.example.hausverwalter.entity.EntityObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectVRepository extends JpaRepository<EntityObject, Long> {


}
