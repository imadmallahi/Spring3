package eai.formation.appbancaire.services.impl;

import eai.formation.appbancaire.dto.CompteDto;
import eai.formation.appbancaire.entities.Compte;
import eai.formation.appbancaire.mappers.ClientMapper;
import eai.formation.appbancaire.mappers.CompteMapper;
import eai.formation.appbancaire.repositories.CompteRepository;
import eai.formation.appbancaire.services.ICompteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CompteServiceImpl implements ICompteService {

    private final CompteRepository compteRepository;

    private final CompteMapper compteMapper;


    public CompteServiceImpl(CompteRepository compteRepository, CompteMapper compteMapper) {
        this.compteRepository = compteRepository;
        this.compteMapper = compteMapper;
    }



    @Override
    public Compte getCompteById(UUID uuid) {
        return compteRepository.findById(uuid).orElse(null);
    }

    @Override
    public Compte getCompteByRib(String rib) {
       // return compteRepository.findByRib(rib);
        return  null ;

    }

    @Override
    public Compte getCompteByCpt(String numCpt) {

        return null;

       // return compteRepository.findByNumCompte(numCpt);
    }

    @Override
    public List<CompteDto> getComptes() {
        return compteMapper.compteDtoList(compteRepository.findAll());
    }
}
