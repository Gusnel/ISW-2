package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.curso;
import com.example.demo.repositorio.curso_repo;

@Service
public class curso_servicio {
    @Autowired
    private curso_repo rep;

    public List<curso> listAll(String keyword){
        if(keyword != null){
            return rep.findAll(keyword);
        }
        return rep.findAll();
    }

    public void save(curso cur){
        rep.save(cur);
    }

    public curso get(Long id){
        return rep.findById(id).get();
    }

    public void delete(Long id){
        rep.deleteById(id);
    }

}
