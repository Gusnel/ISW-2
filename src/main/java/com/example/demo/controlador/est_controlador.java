package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;


import com.example.demo.entidad.estudiante;

import com.example.demo.servicio.est_servicio;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class est_controlador {
    @Autowired
    private est_servicio serv;

    public est_controlador(est_servicio serv) {
        super();
        this.serv = serv;
    }

    @RequestMapping("/") 
    public String ini(){
        return "principal_Autenticar";
    }

    @RequestMapping("/est") 
    public String centralest(){
        return "estudiante";
    }

    @RequestMapping("/tut") 
    public String vertut(){
        return "ver_tutoriales";
    }

    @RequestMapping("/nota") 
    public String vernota(){
        return "ver_nota";
    }

    @RequestMapping("/matricularse") 
    public String matricularse(){
        return "matricularse";
    }
    
    @RequestMapping("adm_est") 
    public String listest(Model modelo, @Param("keyword") String keyword){
        List<estudiante> listaest = serv.listAll(keyword);
        modelo.addAttribute("listaest", listaest);
        modelo.addAttribute("keyword", keyword);
        return "index_estudiante";
    }
    
    @RequestMapping("/Registrarse")
    public String form_est(Model modelo){
        estudiante estud = new estudiante();
        modelo.addAttribute("estudiante", estud);
        return "nuevo_estud";
    }

    @RequestMapping("/index") 
    public String centralprofesor(){
        return "index";
    }


    @RequestMapping(value ="/Acceder", method = RequestMethod.POST)
    public String acc(){
       
       return "redirect:/index";
    }

    @RequestMapping(value ="/guardar", method = RequestMethod.POST)
    public String guardarestudiante(@ModelAttribute("estudiante") estudiante estud){
       serv.save(estud);
       return "redirect:/";
    }

    @RequestMapping(value ="/editarest", method = RequestMethod.POST)
    public String editarestudiante(@ModelAttribute("estudiante") estudiante estud){
       serv.save(estud);
       return "redirect:/index";
    }


    @RequestMapping("/editar/{id}")
    public ModelAndView form_editar(@PathVariable(name = "id")long id){
        ModelAndView modelo =new ModelAndView("editar_est");
        estudiante est = serv.get(id);
        modelo.addObject("estudiante", est);
        return modelo;
    }

    @RequestMapping("/eliminar/{id}")
    public String form_eliminar(@PathVariable(name = "id")long id){
        serv.delete(id);
        return "redirect:/index";
    }
}
    
    

