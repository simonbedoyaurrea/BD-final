package com.bases.bd.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "accesorios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Accesorio {
    
    //Clave primaria de Accesorios
    @Id
    @GeneratedValue 
    (strategy = GenerationType.IDENTITY)
    private Long id;

    //Constraint para evitar nombres nulos
    @Column(nullable = false)
    private String nombre;

    //Relación muchos a uno con Proveedor
    //Constraint para evitar proveedores nulos
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;

    //Relación muchos a uno con Vehiculo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    //La dedscripcion puede ser nula
    private String descripcion;

    //Constraint para evitar precios nulos
    @Column(nullable = false)
    private Long precio;
    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accesorio that = (Accesorio) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
