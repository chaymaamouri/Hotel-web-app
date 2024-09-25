package tn.pi.hospitalwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.hospitalwebapp.entities.Consultation;
import tn.pi.hospitalwebapp.entities.Patient;

import java.util.Collection;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

}
