package eai.formation.appbancaire.services;

import eai.formation.appbancaire.entities.Mouvement;

import java.util.UUID;

public interface IMouvementService {

    Mouvement addMouvement(Mouvement mouvement);


    Mouvement getMouvement(UUID uuid);
}
