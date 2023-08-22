package eai.formation.appbancaire.contorollers;

import eai.formation.appbancaire.services.ICompteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/compte")
public class CompteController {

    private final ICompteService compteService;

    public CompteController(ICompteService compteService) {
        this.compteService = compteService;
    }

    @GetMapping("/id")
    public ResponseEntity<?> getCompte(@Valid @RequestParam UUID uuid){
        return  ResponseEntity.ok(compteService.getCompteById(uuid));
    }
    @GetMapping("/rib")
    public ResponseEntity<?> getCompteByRib(@Valid @RequestParam String rib){
        return  ResponseEntity.ok(compteService.getCompteByRib(rib));
    }
    @GetMapping("/tier")
    public ResponseEntity<?> getCompteByNumCompte(@Valid @RequestParam String numCompte){
        return  ResponseEntity.ok(compteService.getCompteByCpt(numCompte));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getComptes(){
        return  ResponseEntity.ok(compteService.getComptes());
    }
}
