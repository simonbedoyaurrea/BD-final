package com.bases.bd.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bases.bd.models.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {

}