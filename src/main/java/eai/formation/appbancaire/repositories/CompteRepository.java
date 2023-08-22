package eai.formation.appbancaire.repositories;


import eai.formation.appbancaire.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CompteRepository extends JpaRepository<Compte, UUID> {


}
