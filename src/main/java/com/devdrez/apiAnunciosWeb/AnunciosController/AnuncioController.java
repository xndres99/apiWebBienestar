/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devdrez.apiAnunciosWeb.AnunciosController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Intel
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
//@CrossOrigin(origins = "http://localhost:4200/")

public class AnuncioController {
    @Autowired
    private AnuncioService anuncioService;
    
     @PostMapping("anuncios")
    public Anuncio guardarAnuncio(@RequestBody Anuncio anuncio){
        System.out.println(anuncio);
        
       
        
        //
        anuncioService.guardarAnuncio(anuncio);
        
        return anuncio;
    }
    
    @GetMapping("anuncios")
    public List<Anuncio> obtenerTodoAnuncio(){
        return anuncioService.obtenerTodoAnuncio();
    }
    @GetMapping("anunciosId/{id}")
    public Anuncio obtenerAnuncioId(@PathVariable("id")Long id){
        
        return anuncioService.obtenerAnuncio(id);
    }
    @GetMapping("anunciosEstado/{estado}")
    public List<Anuncio> obtenerAnuncioEstado(@PathVariable("estado")String estado){
        
        return anuncioService.obtenerAnuncioEstado(estado);
    }
    @PutMapping("anuncios")
    public void actualizarAnuncio(@RequestBody Anuncio anuncio){
        anuncioService.actualizarAnuncio(anuncio);
    }
    @DeleteMapping("anuncios/{id}")
    public void eliminaAnuncio(@PathVariable("id")Long id){
        anuncioService.elminarAnuncio(id);
    }
    
}
