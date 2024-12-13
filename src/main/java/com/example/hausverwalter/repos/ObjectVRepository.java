package com.example.hausverwalter.repos;

import com.example.hausverwalter.entity.EntityObject;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectVRepository extends JpaRepository<EntityObject, Long> {

  @EntityGraph(attributePaths = {"apartments"})
  List<EntityObject> findAll();
}
