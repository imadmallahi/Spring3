package eai.formation.appbancaire.mappers;

import eai.formation.appbancaire.dto.ClientDto;
import eai.formation.appbancaire.entities.Client;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientMapper {

    public Client toClient(ClientDto clientDto) throws InvocationTargetException, IllegalAccessException {
        Client client = new Client();

         BeanUtils.copyProperties(client,clientDto);
         return  client;
    }

    public  ClientDto toClientDto(Client client) throws InvocationTargetException, IllegalAccessException {
        ClientDto clientDto = new ClientDto();

        BeanUtils.copyProperties(clientDto,client);
        return  clientDto;
    }

    public List<ClientDto> clientDtoList(List<Client> clients)  {
        return clients.stream().map(client -> {
            try {
               // System.out.println(client.getListCpt().stream().(client::toString));
                return toClientDto(client);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }
}
