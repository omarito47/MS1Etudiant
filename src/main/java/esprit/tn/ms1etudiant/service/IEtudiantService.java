package esprit.tn.ms1etudiant.service;


import esprit.tn.ms1etudiant.dto.EtudiantDTO;
import esprit.tn.ms1etudiant.entity.Etudiant;

import java.util.List;
import java.util.Optional;


public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
    Optional<Etudiant> getEtudiantById(Long id);
}

