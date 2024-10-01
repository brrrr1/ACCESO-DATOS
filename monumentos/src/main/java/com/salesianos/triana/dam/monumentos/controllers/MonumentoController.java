package com.salesianos.triana.dam.monumentos.controllers;

import com.salesianos.triana.dam.monumentos.models.Monumento;
import com.salesianos.triana.dam.monumentos.repositories.MonumentoRepository;
import com.salesianos.triana.dam.monumentos.services.MonumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/monumentos")
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository monumentoRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Monumento>> getMonumentos(){
        List<Monumento> monumentos = monumentoRepository.findAll();
        if (monumentos.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(monumentos);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMonumento(@PathVariable Long id) {
        try {
            if (monumentoRepository.existsById(id)) {
                monumentoRepository.deleteById(id);
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting monumento");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monumento> getById(@PathVariable Long id) {
        if (monumentoRepository.existsById(id)) {
            return ResponseEntity.ok(monumentoRepository.findById(id).get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
