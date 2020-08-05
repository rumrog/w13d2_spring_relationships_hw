package com.codeclan.example.w13d2_spring_relationships_hw.repository;

import com.codeclan.example.w13d2_spring_relationships_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
