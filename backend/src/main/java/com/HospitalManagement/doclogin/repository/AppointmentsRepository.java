package com.HospitalManagement.doclogin.repository;

import com.HospitalManagement.doclogin.enity.Appointment;
import com.HospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointment,Long> {
}
