package tn.pi.hospitalwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.pi.hospitalwebapp.entities.Medecin;
import tn.pi.hospitalwebapp.entities.Patient;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}
