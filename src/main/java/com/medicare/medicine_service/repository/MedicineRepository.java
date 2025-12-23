package com.medicare.medicine_service.repository;

import com.medicare.medicine_service.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}

