package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidad.curso;


@Repository
public interface curso_repo extends JpaRepository<curso, Long> {
    @Query("SELECT curs FROM curso curs WHERE curs.nombre LIKE %?1%"
    + " OR curs.profesor LIKE %?1%")
    public List<curso> findAll(String keyword);
}
