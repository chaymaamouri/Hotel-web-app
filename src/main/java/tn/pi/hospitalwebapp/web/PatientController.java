package tn.pi.hospitalwebapp.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pi.hospitalwebapp.entities.Patient;
import tn.pi.hospitalwebapp.repositories.PatientRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor

public class PatientController {
    private final PatientRepository repository;


    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patients = repository.findAll();
        model.addAttribute("patients", patients);
        return "patients";
    }
    }

