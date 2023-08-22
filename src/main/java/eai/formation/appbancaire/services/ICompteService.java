package eai.formation.appbancaire.services;

import eai.formation.appbancaire.dto.CompteDto;
import eai.formation.appbancaire.entities.Client;
import eai.formation.appbancaire.entities.Compte;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ICompteService {



    Compte getCompteById(UUID uuid);
    Compte  getCompteByRib(String rib);
    Compte  getCompteByCpt(String numCpt);
    List<CompteDto> getComptes();
}
