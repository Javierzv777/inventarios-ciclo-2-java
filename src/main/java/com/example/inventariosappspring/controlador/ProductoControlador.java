package com.example.inventariosappspring.controlador;

import java.util.List;
 import java.awt.event.ActionListener;

import com.example.inventariosappspring.modelo.Producto;
import com.example.inventariosappspring.modelo.ProductoRepositorio;
import com.example.inventariosappspring.vista.Vista;

public class ProductoControlador {
    
    ProductoRepositorio repositorioProducto;
    
    public ProductoControlador (ProductoRepositorio repositorioProducto){
        this.repositorioProducto = repositorioProducto;
        
    }

    private void manejadorEventos(){
        // vista.getBottonActualizar();
        // vista.getBottonAgregar();
        // vista.getBottonBorrar();
        // vista.getBottonInforme();
    }


    
    public List<Producto> listar (){
        List<Producto> listaProductos = (List<Producto>) repositorioProducto.findAll();
        return listaProductos;
    }

    public void agregar (Producto producto){
        repositorioProducto.save(producto);
    }

    public void eliminar (Integer id){
        //Producto producto = (<Producto>) repositorioProducto.findById(id);
        repositorioProducto.deleteById(id);
    }
}
