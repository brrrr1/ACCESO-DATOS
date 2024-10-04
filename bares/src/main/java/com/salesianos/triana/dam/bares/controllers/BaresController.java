package com.salesianos.triana.dam.bares.controllers;

import com.salesianos.triana.dam.bares.models.Bares;
import com.salesianos.triana.dam.bares.models.Tag;
import com.salesianos.triana.dam.bares.services.BaresService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/place")
@RequiredArgsConstructor
public class BaresController {

    @Autowired
    private final BaresService servicio;

    @GetMapping()
    public ResponseEntity<List<Bares>> listarBares(){
        List<Bares> bares = servicio.getAll();
        if (bares.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bares, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Bares> getById(@PathVariable Long id) {
        Bares bar = servicio.getBarById(id);
        if (bar == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(bar);
    }


    @PostMapping()
    public ResponseEntity<Bares> addBar(@RequestBody Bares b) {
        Bares barGuardado=servicio.guardarBar(b);
        return new ResponseEntity<>(barGuardado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bares> modificarBar(@RequestBody Bares b, @PathVariable Long id) {
        Optional<Bares> barOptional = Optional.ofNullable(servicio.getBarById(id));
        if (!barOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Bares barModificado = servicio.modificarBar(b, id);
        return ResponseEntity.ok(barModificado);
    }
    /*
    Agregar un tag a un restaurante pasando un id**
    */

    @PutMapping("/{id}/tag/add/{idTag}")
    public ResponseEntity<Bares> addTag(@PathVariable Long id, @PathVariable Long idTag) {
        Bares bar = servicio.getBarById(id);
        Tag nuevo_tag = servicio.getTagById(idTag);
        if (nuevo_tag == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        bar.setTag(nuevo_tag);
        return ResponseEntity.ok(servicio.guardarBar(bar));
    }

    /*
    Eliminar un tag de un restaurante**
 */
    @PutMapping("/{id}/tag/del/{idTag}")
    public ResponseEntity<Bares> eliminarTag(@PathVariable Long id, @PathVariable Long idTag) {
        servicio.eliminarTag(id, idTag);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /*
    Agregar un tag a un restaurante pasando un tag**

    @PutMapping("/{id}/tag/add")
    public ResponseEntity<Bares> addTag(@PathVariable Long id, @RequestBody Tag nuevo_tag) {
        Bares bar = servicio.getBarById(id);
        bar.setTag(nuevo_tag);
        return ResponseEntity.ok(servicio.guardarBar(bar));
    }
    */




    @DeleteMapping("/{id}")
    public ResponseEntity<Bares> deleteBar(@PathVariable Long id) {
        servicio.deleteBarById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}
