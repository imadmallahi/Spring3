package eai.formation.appbancaire.services.impl;

import eai.formation.appbancaire.dto.ClientDto;
import eai.formation.appbancaire.entities.Client;
import eai.formation.appbancaire.mappers.ClientMapper;
import eai.formation.appbancaire.repositories.ClientRepository;
import eai.formation.appbancaire.services.IClientService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;


    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper, ClientMapper clientMapper1) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper1;
    }


    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(UUID uuid)  {
        return clientRepository.findById(uuid).orElse(null);
    }

    @Override
    public Client getClientByRib(String rib) {
        return null;
    }

    @Override
    public Client  getClientByCpt(String numCpt) {
        return null;
    }

    @Override
    public List<ClientDto> getClients() {
        return clientMapper.clientDtoList(clientRepository.findAll());

    }
}
