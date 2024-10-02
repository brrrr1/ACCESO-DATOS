package com.salesianos.triana.dam.bares.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Bares {


    @Id
    @GeneratedValue
    private long id;


    @Column(nullable = false)
    private String nombre, direccion, descripcion, urlImagen;


    @Column(nullable = false)
    private double latitud, longitud;


    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name= "bar_tags", joinColumns = @JoinColumn(name = "idBar"), inverseJoinColumns = @JoinColumn(name = "idTag"))
    @JsonIgnoreProperties("tags")
    private List<Tag> tag;

    public void setTag(Tag tag) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        this.tag.add(tag);
    }


}
