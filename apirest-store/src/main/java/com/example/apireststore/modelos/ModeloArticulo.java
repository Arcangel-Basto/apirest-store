package com.example.apireststore.modelos;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document("articulos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModeloArticulo {

    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private double vunitario;
    private List<Object> tallas;


    /*public ModeloArticulo(String id, String nombre, String descripcion, long stock, double vunitario,
            List<Object> tallas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.vunitario = vunitario;
        this.tallas = tallas;
    }*/

    
    
}
