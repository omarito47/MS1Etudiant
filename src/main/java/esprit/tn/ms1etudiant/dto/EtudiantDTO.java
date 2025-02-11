package esprit.tn.ms1etudiant.dto;



import lombok.Builder;

@Builder
public record EtudiantDTO(Long id, String nom, String prenom, String email) {
}
