/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devdrez.apiAnunciosWeb.AnunciosController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Intel
 */
@Service
public class AnuncioService {
    
    @Autowired
    private AnuncioRepository anuncioRepository;
    
    public void guardarAnuncio(Anuncio anuncio){
        anuncioRepository.save(anuncio);
    }
    public List<Anuncio> obtenerTodoAnuncio(){
        return anuncioRepository.findAll();
    }
    public Anuncio obtenerAnuncio(Long id){
        return anuncioRepository.getOne(id);
    }
    public void actualizarAnuncio(Anuncio anuncio){
        anuncioRepository.save(anuncio);
    }
    public void elminarAnuncio(Long id){
        anuncioRepository.deleteById(id);
    }
    
    
    public List<Anuncio> obtenerAnuncioEstado(String estado){
        return anuncioRepository.findByEstado(estado);
    }
}
