package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.estudiante;
import com.example.demo.repositorio.est_repo;

@Service
public class est_servicio {
    @Autowired
    private est_repo rep;

    public List<estudiante> listAll(String keyword){
        if(keyword != null){
            return rep.findAll(keyword);
        }
        return rep.findAll();
    }

    public void save(estudiante est){
        rep.save(est);
    }

    public estudiante get(Long id){
        return rep.findById(id).get();
    }

    public void delete(Long id){
        rep.deleteById(id);
    }
}
