package com.example.inventariosappspring.controlador;

import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.inventariosappspring.modelo.Producto;
import com.example.inventariosappspring.modelo.ProductoRepositorio;
import com.example.inventariosappspring.vista.Actualizar;
import com.example.inventariosappspring.vista.Agregar;
import com.example.inventariosappspring.vista.Borrar;
import com.example.inventariosappspring.vista.Informe;
import com.example.inventariosappspring.vista.Vista;

public class ProductoControlador implements ActionListener{
    
    ProductoRepositorio repositorioProducto;
    Vista vista;
    Actualizar actualizar;
    Agregar agregar;
    Borrar borrar;
    Informe informe;
    public ProductoControlador (
        ProductoRepositorio repositorioProducto, 
        Vista vista, 
        Actualizar actualizar, 
        Agregar agregar,
        Borrar borrar,
        Informe informe
        ){
        this.repositorioProducto = repositorioProducto;
        this.vista = vista;
        this.actualizar = actualizar;
        this.agregar = agregar;
        this.borrar = borrar;
        this.informe = informe;
        manejadorEventos();
    }

    private void manejadorEventos(){
        vista.getBottonActualizar().addActionListener(this);
        vista.getAgregar().getBottonAgregar().addActionListener(this);
        vista.getBottonBorrar().addActionListener(this);
        vista.getBottonInforme().addActionListener(this);
        
    }


    
    // public List<Producto> listar (){
  
    // }

    public void agregar (){

        if(vista.getAgregar().jTextNombre.getText().isEmpty() || vista.getAgregar().jTextInventario.getText().isEmpty() || vista.getAgregar().jTextPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
            return;
        }
        
        for (Producto producto : (List<Producto>) repositorioProducto.findAll()) {
            if( producto.getNombre().equals(vista.getAgregar().jTextNombre.getText()) 
            ){
                JOptionPane.showMessageDialog(null, "este nombre ya se encuentra en la lista");
                return;
            }
        }
        Producto nuevo = new Producto();
        nuevo.setNombre(vista.getAgregar().jTextNombre.getText());
        nuevo.setPrecio(Double.parseDouble(vista.getAgregar().jTextPrecio.getText()));
        nuevo.setInventario(Integer.parseInt(vista.getAgregar().jTextInventario.getText()));
        repositorioProducto.save(nuevo);
        vista.cargar();
    }

    public void eliminar (){
        
        Borrar borrar = new Borrar(this.vista);
        borrar.run();
        if(borrar.getId() != null){
            repositorioProducto.deleteById(borrar.getId());
            vista.cargar();
        }
        }

    public void actualizar (){
        actualizar = new Actualizar(this.vista);
        actualizar.run();
        actualizar.getBnAceptarUp().addActionListener(this);
    }

    public void actualizar2(){
        System.out.println("actualizar");
        if (actualizar.jTextNombreActualizar.getText().isEmpty() || actualizar.jTextPrecioActualizar.getText().isEmpty() || actualizar.jTextInventarioActualizar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
        } 
        else  {

            for (Producto producto : (List<Producto>) repositorioProducto.findAll()) {
                if( producto.getNombre().equals(actualizar.jTextNombreActualizar.getText()) &&
                    producto.getCodigo() != (long)actualizar.getId()
                ){
                    JOptionPane.showMessageDialog(null, "este nombre ya se encuentra en la lista");
                    return;
                }
            }

            actualizar.setVisible(false);
            int resp = JOptionPane.showConfirmDialog(vista, "¿Deseas actualizar el producto?");
            switch (resp) {
                case 0:
                    Optional <Producto> productoOptional  =  repositorioProducto.findById(actualizar.getId());
                    Producto producto = productoOptional.get();
                    producto.setNombre(actualizar.jTextNombreActualizar.getText());
                    producto.setPrecio( Double.parseDouble(actualizar.jTextPrecioActualizar.getText()));
                    producto.setInventario(Integer.parseInt(actualizar.jTextInventarioActualizar.getText()));
                    repositorioProducto.save(producto);        
                    System.out.println(producto);
                    vista.cargar();
                    break;
                case 1:
                    break;
                case 2:
                    break;
                }
        }
    }

    
    public void informe (){
       
        
        Informe informe = new Informe(this.vista);
        informe.run();

                for (Producto producto : repositorioProducto.findAll()) {
            if(producto.getPrecio() > informe.getPrecioMayor()){
                informe.setPrecioMayor(producto.getPrecio());
                informe.setPrecioMayorNombre (producto.getNombre());
            }
            if(producto.getPrecio() < informe.getPrecioMenor()){
                informe.setPrecioMenor(producto.getPrecio());  
                informe.setPrecioMenorNombre(producto.getNombre());
            }
            informe.setPromedioPrecios(informe.getPromedioPrecios() + producto.getPrecio());  
            informe.setValorInventario(informe.getValorInventario() + Math.round( producto.getPrecio()) * producto.getInventario());
        }
            informe.setPromedioPrecios(informe.getPromedioPrecios() / repositorioProducto.count());

            informe.mostrar();

        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
       if( evento.getSource() == vista.getAgregar().getBottonAgregar()){
        agregar();
       } else if (evento.getSource() == vista.getBottonActualizar()){
        actualizar();
       } else if (evento.getSource() == vista.getBottonBorrar()){
        eliminar();
       } else if (evento.getSource() == vista.getBottonInforme()){
        informe();
       } else if (evento.getSource() == actualizar.getBnAceptarUp()){
        actualizar2();
       }
        
    }
}
