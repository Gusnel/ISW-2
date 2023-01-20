
package com.app.curso;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.example.demo.entidad.curso;
import com.example.demo.repositorio.curso_repo;



@DataJpaTest
public class test_curso {
    @Autowired
    private curso_repo rep;

    @Test
    public void test1guardar_curso(){
        curso esperado = new curso("asd", "dsa");
        rep.save(esperado); 
        }

}
