package com.salesianos.triana.dam.monumentos.services;

import com.salesianos.triana.dam.monumentos.models.Monumento;
import com.salesianos.triana.dam.monumentos.repositories.MonumentoRepository;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonumentoService {

    private final MonumentoRepository repo;

    public List<Monumento> getAll() {
        return repo.findAll();
    }

    public void deleteMonumentoById(Long id) {
        repo.deleteById(id);
    }
}
