package com.example.texniktopshiriq1.repository;

import com.example.texniktopshiriq1.entity.GTDInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GTDInformationRepository extends JpaRepository<GTDInformation, Integer> {
}
