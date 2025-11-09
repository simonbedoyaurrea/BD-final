package com.bases.bd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bases.bd.models.Accesorio;

@Repository
public interface AccesorioRepository extends JpaRepository<Accesorio, Long> {

}

