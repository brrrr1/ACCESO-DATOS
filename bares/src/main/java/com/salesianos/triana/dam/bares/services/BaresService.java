package com.salesianos.triana.dam.bares.services;

import com.salesianos.triana.dam.bares.models.Bares;
import com.salesianos.triana.dam.bares.repositories.BaresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaresService {

    @Autowired
    private final BaresRepository repo;

    public List<Bares> getAll() {
        return repo.findAll();
    }

    public Bares getBarById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteBarById(Long id) {
        repo.deleteById(id);
    }

    public Bares modificarBar(Bares b,Long id) {
        Bares barEncontrado = repo.findById(id).orElse(null);
        if(barEncontrado != null) {
            return repo.save(b);
        }
        return b;
    }

    public Bares guardarBar(Bares b) {
        return repo.save(b);
    }
}
