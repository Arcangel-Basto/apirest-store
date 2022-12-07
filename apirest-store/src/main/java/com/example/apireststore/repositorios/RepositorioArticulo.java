package com.example.apireststore.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.apireststore.modelos.ModeloArticulo;

@Repository
public interface RepositorioArticulo extends MongoRepository <ModeloArticulo,String> {
    
}
