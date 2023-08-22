package eai.formation.appbancaire.mappers;

import eai.formation.appbancaire.dto.ClientDto;
import eai.formation.appbancaire.dto.CompteDto;
import eai.formation.appbancaire.entities.Client;
import eai.formation.appbancaire.entities.Compte;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompteMapper {

    public Compte toCompte(CompteDto compteDto) throws InvocationTargetException, IllegalAccessException {
        Compte compte = new Compte();

        BeanUtils.copyProperties(compteDto,compte);
        return  compte;
    }

    public  CompteDto toCompteDto(Compte compte) throws InvocationTargetException, IllegalAccessException {
        CompteDto compteDto = new CompteDto();

        BeanUtils.copyProperties(compte,compteDto);
        return  compteDto;
    }


    public List<CompteDto> compteDtoList(List<Compte> comptes)  {
        return comptes.stream().map(client -> {
            try {
                return toCompteDto(client);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }
}
