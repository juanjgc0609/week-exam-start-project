package com.example.repository;

import com.example.model.Expedition;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class ExpeditionRepository {
    private HashMap<Integer, Expedition> expeditions;
    public ExpeditionRepository() {expeditions = new HashMap<Integer, Expedition>();}
    public Collection<Expedition> findAll() {return expeditions.values();}
    public boolean existById(int id) {return expeditions.containsKey(id);}
    public void save(Expedition expedition) {
        expeditions.put(expedition.getId(), expedition);
    }
    @PostConstruct
    public void init() {
        Expedition expedition1 = new Expedition();
        expedition1.setId(1);
        expedition1.setName("Sighting");
        expedition1.setCode("A00407891");
        expedition1.setRegion("North America");
        expedition1.setBaseCamp("Estacionamiento");
        expedition1.setLeader("Juan Jose Gordillo");
        expedition1.setStartDate("Lunes");
        expedition1.setEndDate("Martes");
        expedition1.setEstate("Activo");
        expeditions.put(expedition1.getId(), expedition1);
        Expedition expedition2 = new Expedition();
        expedition2.setId(2);
        expedition2.setName("Sighting");
        expedition2.setCode("A00407892");
        expedition2.setRegion("North America");
        expedition2.setBaseCamp("Estacionamiento");
        expedition2.setLeader("Juan Jose Gordillo");
        expedition2.setStartDate("Martes");
        expedition2.setEndDate("Martes");
        expedition2.setEstate("Activo");
        expeditions.put(expedition2.getId(), expedition2);


    }
}


