package com.HospitalManagement.doclogin.repository;

import com.HospitalManagement.doclogin.enity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Long> {
}
