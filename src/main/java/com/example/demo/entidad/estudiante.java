package com.example.demo.entidad;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(name = "estud",uniqueConstraints = @UniqueConstraint(columnNames = "correo"))
@Entity
public class estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    private String correo;
    
    private String curso;
    
    private String nota;
    
    private String password;
    
  

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
        name = "estudiantes_roles",
        joinColumns = @JoinColumn(name = "estudiante_id",referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")

    )
    private Collection<rol> roles;
   

    public estudiante(String nombre, String correo, String curso, String nota, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.nota = nota;
        this.password = password;
    }
    public estudiante(String nombre, String correo, String curso, String password, String nota, Collection<rol> roles) {
        super();
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.nota = nota;
        this.roles = roles;
        this.password = password;
    }
    public estudiante(Long id, String nombre, String correo, String password, String curso, String nota, Collection<rol> roles) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.nota = nota;
        this.roles = roles;
        this.password = password;
       
    }
    public estudiante() {
        super();
    }
    public Long getId() {
        return id;
    }
    public Collection<rol> getRoles() {
        return roles;
    }
    public void setRoles(Collection<rol> roles) {
        this.roles = roles;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
    
}
