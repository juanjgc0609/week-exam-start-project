package com.example.repository;

import com.example.model.Sighting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SightingRepository {
    private List<Sighting> sightings = new ArrayList<>();
    @Autowired
    private ExpeditionRepository expeditionRepository;
    public List<Sighting> findAll() {return sightings;}
    public void save(Sighting sighting) {sightings.add(sighting);}
}
