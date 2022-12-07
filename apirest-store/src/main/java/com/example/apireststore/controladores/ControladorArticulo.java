package com.example.apireststore.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apireststore.modelos.ModeloArticulo;
import com.example.apireststore.repositorios.RepositorioArticulo;

@RestController
@RequestMapping("/articulos")
public class ControladorArticulo {
    @Autowired
    RepositorioArticulo repositorioArticulo;

    @GetMapping()
    public List<ModeloArticulo> getAllArticulos(){
        return repositorioArticulo.findAll();
    }

    @PostMapping()
    public ModeloArticulo savArticulo(@RequestBody ModeloArticulo articulo){
        return repositorioArticulo.save(articulo); //inserta o actualiza articulo
    }
    
    @DeleteMapping("/{id}")
    public void deletePacienteById(@PathVariable("id") String id){
        repositorioArticulo.deleteById(id);
    }
}
