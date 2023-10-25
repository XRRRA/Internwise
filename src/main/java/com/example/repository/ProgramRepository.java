package com.example.repository;

import com.example.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Integer> {
    @Query("SELECT p FROM Program  p where p.programUrlPath = :programUrlPath")
    Program getProgramByUrlPath(String programUrlPath);
}
