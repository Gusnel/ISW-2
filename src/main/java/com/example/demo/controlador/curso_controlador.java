package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;

import com.example.demo.entidad.curso;
import com.example.demo.servicio.curso_servicio;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class curso_controlador {
    @Autowired
    private curso_servicio serv;

   
    @RequestMapping("/adm_curso") 
    public String verinicio(Model modelo, @Param("keyword") String keyword){
        List<curso> listacurs = serv.listAll(keyword);
        modelo.addAttribute("listacurs", listacurs);
        modelo.addAttribute("keyword", keyword);
        return "index_curso";
    }
    @RequestMapping("/add_curso")
    public String form_est(Model modelo){
        curso curs = new curso();
        modelo.addAttribute("curso", curs);
        return "nuevo_curs";
    }
    @RequestMapping(value ="/guardarc", method = RequestMethod.POST)
    public String guardarestudiante(@ModelAttribute("curso") curso curs){
       serv.save(curs);
       return "redirect:/adm_curso";
    }
    @RequestMapping("/editarc/{id}")
    public ModelAndView form_editar(@PathVariable(name = "id")long id){
        ModelAndView modelo =new ModelAndView("editar_curs");
        curso curs = serv.get(id);
        modelo.addObject("curso", curs);
        return modelo;
    }

    @RequestMapping("/eliminarc/{id}")
    public String form_eliminar(@PathVariable(name = "id")long id){
        serv.delete(id);
        return "redirect:/adm_curso";
    }
}
    
    

