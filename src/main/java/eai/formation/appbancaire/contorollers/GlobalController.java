package eai.formation.appbancaire.contorollers;


import eai.formation.appbancaire.services.IClientService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class GlobalController {

    private final IClientService iClientService;

    public GlobalController(IClientService iClientService) {
        this.iClientService = iClientService;
    }

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/";
    }

    @GetMapping(path = "/produits")
    public String customers(Principal principal, Model model) {
        model.addAttribute("clients", iClientService.getClients());
        model.addAttribute("username", principal.getName());
        return "produits";
    }
}
