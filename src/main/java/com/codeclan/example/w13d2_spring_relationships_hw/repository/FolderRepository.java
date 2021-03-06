package com.codeclan.example.w13d2_spring_relationships_hw.repository;

import com.codeclan.example.w13d2_spring_relationships_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
