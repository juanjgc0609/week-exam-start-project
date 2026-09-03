package com.example.service;

import com.example.model.Sighting;
import com.example.repository.ExpeditionRepository;
import com.example.repository.SightingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SightingService {
    @Autowired
    private SightingRepository sightingRepository;
    @Autowired
    private ExpeditionRepository expeditionRepository;

    public void addSighting(Sighting sighting) {
        if(expeditionRepository.existById(sighting.getExpeditionId())){
            sightingRepository.save(sighting);
            System.out.println("Sighting saved");

        } else {
            System.out.println("Sighting not saved");
        }
    }
    public List<Sighting> getSightings() {return sightingRepository.findAll();}
}
