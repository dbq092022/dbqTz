package com.example.texniktopshiriq1.repository;

import com.example.texniktopshiriq1.entity.DeclarationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationDataRepository extends JpaRepository<DeclarationData, Integer> {
}
