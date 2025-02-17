package esprit.tn.ms1etudiant.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.starter.shared.dto.FoyerDTO;

@FeignClient(name="foyer",url = "http://localhost:8081")

public interface FoyerClient {
    @GetMapping("/api/foyers/getById/{id}")
    FoyerDTO findById(@PathVariable("id") String id);
}
