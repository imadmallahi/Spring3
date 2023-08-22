package eai.formation.appbancaire.mappers;

import eai.formation.appbancaire.dto.CompteDto;
import eai.formation.appbancaire.dto.MouvementDto;
import eai.formation.appbancaire.entities.Compte;
import eai.formation.appbancaire.entities.Mouvement;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class MouvementMapper {

    public Mouvement toMouvement(MouvementDto mouvementDto) throws InvocationTargetException, IllegalAccessException {
        Mouvement mouvement = new Mouvement();

        BeanUtils.copyProperties(mouvementDto,mouvement);
        return  mouvement;
    }

    public  MouvementDto toMouvementDto(Mouvement mouvement) throws InvocationTargetException, IllegalAccessException {
        MouvementDto mouvementDto = new MouvementDto();

        BeanUtils.copyProperties(mouvement,mouvementDto);
        return  mouvementDto;
    }
}
