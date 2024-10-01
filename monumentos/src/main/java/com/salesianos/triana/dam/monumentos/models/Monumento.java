package com.salesianos.triana.dam.monumentos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GenerationType;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Monumento {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false)
        private String nombrePais;

        @Column(nullable = false, length = 2)
        private String codigoPais;

        @Column(nullable = false)
        private double latitud;

        @Column(nullable = false)
        private double longitud;

        @Column(nullable = false)
        private String nombreCiudad;

        @Column(nullable = false)
        private String nombreMonumento;

        @Column(nullable = false, length = 2500)
        private String descripcion;

        @Column(nullable = false)
        private String urlFoto;





}
