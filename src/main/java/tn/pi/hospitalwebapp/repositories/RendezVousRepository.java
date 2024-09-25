package tn.pi.hospitalwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.hospitalwebapp.entities.Patient;
import tn.pi.hospitalwebapp.entities.RendezVous;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {

}
