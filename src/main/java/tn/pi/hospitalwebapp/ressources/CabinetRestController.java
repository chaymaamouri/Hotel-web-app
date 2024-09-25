package tn.pi.hospitalwebapp.ressources;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pi.hospitalwebapp.entities.Patient;
import tn.pi.hospitalwebapp.services.CabinetService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CabinetRestController {
    private final CabinetService cabinetService;

    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return cabinetService.getAllPatients();
    }
}
