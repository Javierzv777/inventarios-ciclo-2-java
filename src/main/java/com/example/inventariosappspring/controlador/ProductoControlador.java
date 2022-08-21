package com.example.inventariosappspring.controlador;

import java.util.List;
 import java.awt.event.ActionListener;

import com.example.inventariosappspring.modelo.Producto;
import com.example.inventariosappspring.modelo.ProductoRepositorio;
import com.example.inventariosappspring.vista.Vista;

public class ProductoControlador {
    
    ProductoRepositorio repositorioProducto;
    Vista vista;
    
    public ProductoControlador (ProductoRepositorio repositorioProducto, Vista vista){
        this.repositorioProducto = repositorioProducto;
        this.vista = vista;
    }

    private void manejadorEventos(){
        // vista.getBottonActualizar();
        // vista.getBottonAgregar();
        // vista.getBottonBorrar();
        // vista.getBottonInforme();
    }

    public void buscarProductos(){
        List<Producto> listaProductos = (List<Producto>) repositorioProducto.findAll();
        System.out.println(listaProductos);
    }
}
