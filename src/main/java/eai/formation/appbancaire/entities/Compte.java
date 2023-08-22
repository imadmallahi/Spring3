package eai.formation.appbancaire.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="Compte")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;

    @Column(name = "numCpt")
    @Min(8)
    @NotBlank
    private Long numCompte ;
    @Column(name = "rib" , length = 24)
    @Size(min = 24, max=24)
    @NotBlank
    private String rib;
    @Column(name = "libelle")
    @Min(10)
    private String libelle;
    @Column(name = "solde")
    @Min(0)
    private Long solde ;


    @ManyToOne
    @JsonIgnore
    private Client client;


   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<Mouvement> listMouvement = new ArrayList<>();

    @Override
    public String toString() {
        return "Compte{" +
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
