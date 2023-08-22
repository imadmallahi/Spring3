package eai.formation.appbancaire.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Mouvement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Mouvement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;

    @Column(name="description")
    private String description ;

    @Column(name="typeMouvement")
    @Enumerated(EnumType.STRING)
    private TypeCompte typeMouvement ;


}
