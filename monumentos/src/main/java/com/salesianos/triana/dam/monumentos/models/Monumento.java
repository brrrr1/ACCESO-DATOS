package com.salesianos.triana.dam.monumentos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Monumento {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String nombrePais, nombreCiudad, nombreMonumento, descripcion, urlFoto;

        @Column(nullable = false, length = 2)
        private String codigoPais;

        private double latitud, longitud;



}
