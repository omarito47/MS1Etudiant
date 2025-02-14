package esprit.tn.ms1etudiant.service;

import esprit.tn.ms1etudiant.entity.Etudiant;
import esprit.tn.ms1etudiant.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.starter.shared.dto.EtudiantDTO;
import tn.starter.shared.service.IGenericServiceImpl;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantServiceImpl extends IGenericServiceImpl<EtudiantDTO,Etudiant,Long> implements  IEtudiantService{

}
