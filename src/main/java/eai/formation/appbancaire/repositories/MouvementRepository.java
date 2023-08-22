package eai.formation.appbancaire.repositories;

import eai.formation.appbancaire.entities.Mouvement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MouvementRepository extends JpaRepository<Mouvement, UUID> {
}
