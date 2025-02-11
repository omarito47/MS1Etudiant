package esprit.tn.ms1etudiant.controller;


import esprit.tn.ms1etudiant.entity.Etudiant;
import esprit.tn.ms1etudiant.service.IEtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")
//@RequiredArgsConstructo
public class EtudiantController {

    private final   IEtudiantService etudiantService;

    public EtudiantController(IEtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }


    // Constructor injection (or field injection)
    @PostMapping("/AddEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("/GetAllEtudiants")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/GetEtudiantById/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    }
}
