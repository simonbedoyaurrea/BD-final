package com.bases.bd.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.bases.bd.models.enums.MetodoPago;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

        @ManyToOne
        @JoinColumn(name = "vehiculo_id")
        private Vehiculo vehiculo;

        @ManyToOne
        @JoinColumn(name = "cliente_id")
        private Cliente cliente;

        private LocalDate fechaVenta;

        private Long total;

        @Enumerated(EnumType.STRING)
        private MetodoPago metodoPago;

        @ManyToMany
        @JoinTable(
            name = "venta_accesorio",
            joinColumns = @JoinColumn(name = "venta_id"),
            inverseJoinColumns = @JoinColumn(name = "accesorio_id")
        )
    private List<Accesorio> accesorios = new ArrayList<>();

        public Venta() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Vehiculo getVehiculo() {
            return vehiculo;
        }

        public void setVehiculo(Vehiculo vehiculo) {
            this.vehiculo = vehiculo;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public LocalDate getFechaVenta() {
            return fechaVenta;
        }

        public void setFechaVenta(LocalDate fechaVenta) {
            this.fechaVenta = fechaVenta;
        }

        public Long getTotal() {
            return total;
        }

        public void setTotal(Long total) {
            this.total = total;
        }

        public MetodoPago getMetodoPago() {
            return metodoPago;
        }

        public void setMetodoPago(MetodoPago metodoPago) {
            this.metodoPago = metodoPago;
        }

        public List<Accesorio> getAccesorios() {
            return accesorios;
        }

        public void setAccesorios(List<Accesorio> accesorios) {
            this.accesorios = accesorios;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Venta venta = (Venta) o;
            return Objects.equals(id, venta.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

    

}
