package com.bases.bd.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "galaxias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Galaxia {

    //Clave primaria para Galaxia
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Constraint para evitar nombres nulos
    @Column(nullable = false)
    private String nombre;

    //Relación uno a muchos con Proveedor
    @OneToMany(mappedBy = "galaxia")
    private List<Marca> marcas = new ArrayList<>();


}
