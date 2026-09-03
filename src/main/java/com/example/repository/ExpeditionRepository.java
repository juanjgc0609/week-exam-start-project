package com.example.repository;

import com.example.model.Expedition;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class ExpeditionRepository {
    private HashMap<Integer, Expedition> expeditions;
    public ExpeditionRepository() {expeditions = new HashMap<Integer, Expedition>();}
    public Collection<Expedition> findAll() {return expeditions.values();}
    public Expedition findById(int id) {return expeditions.get(id);}
    public Expedition save(Expedition expedition) {
        expeditions.put(expedition.getId(), expedition);
        return expedition;
    }
}


