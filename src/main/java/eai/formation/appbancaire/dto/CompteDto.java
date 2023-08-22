package eai.formation.appbancaire.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import eai.formation.appbancaire.entities.Client;
import eai.formation.appbancaire.entities.Mouvement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompteDto {

    private UUID id ;
    private Long numCompte ;
    private String rib;
    private String libelle;
    private Long solde ;
    @JsonIgnore
    private ClientDto client;

    private List<MouvementDto> listMouvement ;

    @Override
    public String toString() {
        return "CompteDto{" +
                "id=" + id +
                ", numCompte=" + numCompte +
                ", rib='" + rib + '\'' +
                ", libelle='" + libelle + '\'' +
                ", solde=" + solde +
                ", client=" + client +
                ", listMouvement=" + listMouvement +
                '}';
    }
}
