package com.example.service;

import com.example.model.Expedition;
import com.example.repository.ExpeditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ExpeditionService {
    @Autowired
    private ExpeditionRepository expeditionRepository;
    public void addExpedition(Expedition expedition) {expeditionRepository.save(expedition);}
    public Collection<Expedition> getExpeditions() {return expeditionRepository.findAll();}
}
