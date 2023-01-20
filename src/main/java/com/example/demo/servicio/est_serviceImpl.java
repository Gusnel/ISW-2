package com.example.demo.servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.demo.dto.dto;
import com.example.demo.entidad.estudiante;
import com.example.demo.entidad.rol;
import com.example.demo.interface_service.est_service;
import com.example.demo.repositorio.est_repo;

@Service
public class est_serviceImpl implements est_service {


    private est_repo estudiante_repo;

    public est_serviceImpl(est_repo estudiante_repo) {
        super();
        this.estudiante_repo = estudiante_repo;
    }

    @Override
    public estudiante guar(dto registroDto){
        estudiante estudiante = new estudiante(registroDto.getNombre(), registroDto.getCorreo(), registroDto.getCurso(), registroDto.getContraseña(), registroDto.getNota(), Arrays.asList(new rol("ROLE_USER")));
        return estudiante_repo.save(estudiante);
    }
    
}
