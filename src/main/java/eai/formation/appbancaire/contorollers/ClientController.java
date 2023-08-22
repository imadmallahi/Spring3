package eai.formation.appbancaire.contorollers;

import eai.formation.appbancaire.dto.ClientDto;
import eai.formation.appbancaire.entities.Client;
import eai.formation.appbancaire.services.IClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    private final IClientService serviceClient;


    public ClientController(IClientService serviceClient) {
        this.serviceClient = serviceClient;
    }


 //   @PreAuthorize("hasRole('SCOPE_ROLE_ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<?> addClient(@Valid @RequestBody Client client){
        return ResponseEntity.ok(serviceClient.addClient(client));
    }

//    @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    @GetMapping("/get")
    public ResponseEntity<?> getClient(@Valid @RequestParam UUID id){
        return ResponseEntity.ok(serviceClient.getClientById(id));
    }

  //  @PreAuthorize("hasAuthority('SCOPE_ROLE_ADMIN')")
    @GetMapping("/all")
    public ResponseEntity<?> getClients(){
        return ResponseEntity.ok(serviceClient.getClients());
    }

    /**
     *
     * @param auth
     * @return

    @GetMapping("/profiles")
    public Authentication profil(Authentication auth){
        return  auth;
    }
     */
}
