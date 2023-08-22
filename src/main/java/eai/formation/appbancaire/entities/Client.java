package eai.formation.appbancaire.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "Client")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;
    @Column(name = "nom")
    @NotBlank
    private String nom;
    @Column(name = "prenom")
    @NotBlank
    private String prenom ;
    @Column(name = "telephone")
    @Pattern(regexp = "\\+2126\\d{8}", message = "Invalid phone number format")
    @NotBlank
    private String telephone;
    @Column(name = "login")
    @NotBlank
    private  String login ;

    @Column(name = "password")
    @NotBlank
    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password ;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "client")
    private List<Compte> listCpt = new ArrayList<>() ; ;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", listCpt=" + listCpt +
                '}';
    }
}
