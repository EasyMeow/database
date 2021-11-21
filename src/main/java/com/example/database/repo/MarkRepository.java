package com.example.database.repo;


import com.example.database.entities.MarkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<MarkEntity, Long> {
}
