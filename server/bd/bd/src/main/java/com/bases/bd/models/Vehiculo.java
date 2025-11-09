package com.bases.bd.models;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Constraint;

import com.bases.bd.models.enums.Color;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
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
@Table(name = "vehiculos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehiculo {
    
    //Clave primaria para Vehiculo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //Constraint para evitar nombres nulos
    @Column(nullable = false)
    private String nombre;

    //Relación muchos a uno con Marca
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;


    private String imagenURL;

    //Constraint para evitar modelos nulos
    @Column(nullable = false)
    private String  modelo;

    //Constraint para evitar años nulos
    @Column(nullable = false)
    private Long anio;

    @Enumerated(EnumType.STRING)
    private Color color;

    //Constraint para evitar precios nulos
    @Column(nullable = false)
    private Long precio;

    private Boolean esUsado;

    private String descripcion;

    @OneToMany(mappedBy = "vehiculo")
    private List<Accesorio> accesorios = new ArrayList<>();


}



