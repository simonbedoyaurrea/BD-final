package com.bases.bd.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "marcas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Marca {

    //Clave primaria para Marca
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Contraint para evitar nombres nulos
    @Column(nullable = false)
    private String nombre;

    //Relacion muchos a uno con Galaxia
    @ManyToOne
    @JoinColumn(name = "galaxia_id")
    private Galaxia galaxia;

    //Relación uno a muchos con Vehiculo
    @OneToMany(mappedBy = "marca")
    private List<Vehiculo> vehiculos = new ArrayList<>();

    
}
