package eai.formation.appbancaire.dto;

import eai.formation.appbancaire.entities.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MouvementDto {


    private UUID id ;

    private String description ;

    private TypeCompte typeMouvement ;
}
