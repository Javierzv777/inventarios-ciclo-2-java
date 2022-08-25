package com.example.inventariosappspring.vista;

import javax.swing.JOptionPane;

import com.example.inventariosappspring.controlador.ProductoControlador;
import com.example.inventariosappspring.modelo.Producto;

public class Informe {
    private Vista vista;
    private ProductoControlador controlador;
    public Informe(Vista vista, ProductoControlador controlador ){
        this.vista = vista;
        this.controlador = controlador;
    }
    public void run(){
        Double precioMayor = Double.MIN_VALUE;
        String precioMayorNombre = "";
        Double precioMenor = Double.MAX_VALUE;
        String precioMenorNombre = "";
        Double promedioPrecios = 0.0;
        long valorInventario = 0;
        for (Producto producto : this.controlador.listar()) {
            if(producto.getPrecio() > precioMayor){
                precioMayor = producto.getPrecio();
                precioMayorNombre = producto.getNombre();
            }
            if(producto.getPrecio() < precioMenor){
                precioMenor = producto.getPrecio();
                precioMenorNombre = producto.getNombre();
            }
            promedioPrecios += producto.getPrecio();  
            valorInventario += producto.getPrecio() * producto.getInventario();
        }

    JOptionPane.showMessageDialog(this.vista, "Producto precio mayor: " + precioMayorNombre +
                                            "\n Producto precio menor: "+ precioMenorNombre +
                                            "\n Promedio precios: " + String.format("%.1f", promedioPrecios / this.controlador.listar().size()) +
                                            "\n Valor del Invenario: " + valorInventario,
                                             "Informe del Inventario", 1);

       
    }
}
