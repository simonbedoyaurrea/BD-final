package com.bases.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bases.bd.models.Galaxia;

@Repository
public interface GalaxiaRepository extends JpaRepository<Galaxia, Long>{

}
