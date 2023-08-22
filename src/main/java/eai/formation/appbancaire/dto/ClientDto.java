package eai.formation.appbancaire.dto;

import eai.formation.appbancaire.entities.Compte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {


    private UUID id ;

    private String nom;

    private String prenom ;

    private String telephone;

    private  String login ;

    private String password ;

    private List<CompteDto> listCpt = new ArrayList<>();

    @Override
    public String toString() {
        return "ClientDto{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", listCpt=" + listCpt.toString() +
                '}';
    }
}
