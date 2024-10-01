package com.salesianos.triana.dam.monumentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salesianos.triana.dam.monumentos.models.Monumento;


public interface MonumentoRepository extends JpaRepository<Monumento, Long> {
}