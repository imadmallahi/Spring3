package eai.formation.appbancaire.services;

import eai.formation.appbancaire.dto.ClientDto;
import eai.formation.appbancaire.entities.Client;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IClientService {

    Client addClient(Client client) ;
    Client getClientById(UUID uuid) ;
    Client getClientByRib(String rib);
    Client getClientByCpt(String numCpt);

    List<ClientDto> getClients();
}
