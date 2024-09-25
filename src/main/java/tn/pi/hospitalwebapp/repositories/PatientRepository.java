package tn.pi.hospitalwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.hospitalwebapp.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
