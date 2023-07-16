package com.example.editorial.repository;

import com.example.editorial.entity.EditorialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<EditorialEntity, Long> {
}
