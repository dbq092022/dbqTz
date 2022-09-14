package com.example.texniktopshiriq1.repository;

import com.example.texniktopshiriq1.entity.Tovar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TovarRepository extends JpaRepository<Tovar, Integer> {
}
