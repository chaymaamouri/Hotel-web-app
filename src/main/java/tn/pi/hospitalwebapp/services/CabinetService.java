package tn.pi.hospitalwebapp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pi.hospitalwebapp.entities.Patient;

import java.util.List;

public interface CabinetService {

    //CRUD
    Patient savePatient(Patient patient);
    Patient getPatient(Long id);
    List<Patient> getAllPatients();
    void deletePatient(Long id);
    void updatePatient(Patient patient);
}
