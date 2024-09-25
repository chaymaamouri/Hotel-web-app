package tn.pi.hospitalwebapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.pi.hospitalwebapp.entities.Patient;
import tn.pi.hospitalwebapp.entities.RendezVous;
import tn.pi.hospitalwebapp.repositories.PatientRepository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class HospitalWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalWebAppApplication.class, args);
    }
    @Bean //instance d'un objet // nécessaire pour lire la fonction
        public CommandLineRunner init(PatientRepository repository){
            return args -> {
               //1.Using params constructor
               /*Patient patient1 = new Patient(null,"Aziz", LocalDate.of(2005,6,1),false,123);
               repository.save(patient1);*/
               //2. using default contructor
                Patient patient2 = new Patient();
                patient2.setName("Firas");
                patient2.setBirthDate(LocalDate.of(2005,5,12));
                patient2.setSeack(true);
                patient2.setScore(15);
                repository.save(patient2);

                //using builder

                Patient patient3 = Patient.builder()
                        .score(125)
                        .name("chayma")
                        .seack(true)
                        .birthDate(LocalDate.of(1981,8,20)).build();
                repository.save(patient3);

            };
        }
}
