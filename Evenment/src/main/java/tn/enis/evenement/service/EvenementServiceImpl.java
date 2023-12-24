package tn.enis.evenement.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.evenement.dao.EvenementRepository;
import tn.enis.evenement.entity.Evenement;

import java.util.Date;
import java.util.List;

@Service
public class EvenementServiceImpl implements IEvenementService {

    @Autowired
    private EvenementRepository evenementRepository;

    @Override
    public Evenement addEvenement(Evenement e){
        evenementRepository.save(e);
        return e;
    }

    @Override
    public void deleteEvenement(Long id) {
        evenementRepository.deleteById(id);
    }

    @Override
    public Evenement updateEvenement(Evenement e){
        return  evenementRepository.saveAndFlush(e);
    }

    @Override
    public Evenement findEvenement(Long id) {
        return evenementRepository.findById(id).get();
    }

    @Override
    public List<Evenement> findAll(){
        return evenementRepository.findAll();
    }

    @Override
    public List<Evenement> findByTitre(String titre) {
        return evenementRepository.findByTitre(titre);
    }

    @Override
    public List<Evenement> findByLieu(String lieu) {
        return evenementRepository.findByLieu(lieu);
    }

    @Override
    public List<Evenement> findByDateDebutBetween(Date startDate, Date endDate) {
        return evenementRepository.findByDateDebutBetween(startDate, endDate);
    }

    @Override
    public List<Evenement> findByDateFinBetween(Date startDate, Date endDate) {
        return evenementRepository.findByDateFinBetween(startDate, endDate);
    }


}
