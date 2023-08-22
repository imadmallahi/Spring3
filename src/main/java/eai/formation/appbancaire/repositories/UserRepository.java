package eai.formation.appbancaire.repositories;

import eai.formation.appbancaire.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@RepositoryRestResource(path = "users",collectionResourceRel = "users")
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
