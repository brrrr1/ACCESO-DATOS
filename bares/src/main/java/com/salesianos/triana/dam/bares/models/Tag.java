package com.salesianos.triana.dam.bares.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Tag {


    @Id
    @GeneratedValue
    private Long id;


    @Column(nullable = false)
    private String nombre;


    @ManyToMany (fetch = FetchType.EAGER, mappedBy = "tag")
    @JsonIgnoreProperties("tag")
    private List<Bares> listaBares;
}





