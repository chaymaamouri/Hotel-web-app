package tn.pi.hospitalwebapp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.pi.hospitalwebapp.entities.Patient;
import tn.pi.hospitalwebapp.repositories.PatientRepository;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class CabinetServiceImpl implements CabinetService {
    private final PatientRepository patientRepository = null;
    @Override
    public Patient savePatient(Patient patient) {
        return null;
    }

    @Override
    public Patient getPatient(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public void updatePatient(Patient patient) {

    }
}
