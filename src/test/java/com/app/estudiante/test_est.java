
package com.app.estudiante;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.example.demo.entidad.estudiante;
import com.example.demo.repositorio.est_repo;


@DataJpaTest
public class test_est {
    @Autowired
    private est_repo rep;

    @Test
    public void test1guardar_estudiante(){
        estudiante esperado = new estudiante("prueba", "prueba@gmail.com", "pintura", "passw", "B");
        rep.save(esperado); 
        }

}
