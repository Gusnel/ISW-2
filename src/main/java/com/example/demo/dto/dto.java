package com.example.demo.dto;

public class dto {
    
    private Long id;
   
    private String nombre;

    private String contraseña;
    
    private String correo;
    
    private String curso;
    
    private String nota;

    public Long getId() {
        return id;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public dto(Long id, String nombre, String correo, String contraseña, String curso, String nota) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.nota = nota;
        this.contraseña = contraseña;
    }

    public dto(String nombre, String correo, String contraseña, String curso, String nota) {
        super();
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.nota = nota;
        this.contraseña = contraseña;
    }

    public dto(String correo) {
        super();
        this.correo = correo;
    }

    public dto() {
        super();
    }
}
