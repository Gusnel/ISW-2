package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.estudiante;

@Repository
public interface est_repo extends JpaRepository<estudiante, Long> {
    @Query("SELECT est FROM estudiante est WHERE est.nombre LIKE %?1%"
    + " OR est.curso LIKE %?1%"
    + " OR est.correo LIKE %?1%")
    public List<estudiante> findAll(String keyword);

    
}
