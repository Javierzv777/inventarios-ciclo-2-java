package com.example.inventariosappspring.vista;

import javax.swing.JOptionPane;

import com.example.inventariosappspring.controlador.ProductoControlador;

public class Borrar {
    ProductoControlador controlador;
    Vista vista;
    public Borrar(Vista vista, ProductoControlador controlador){
        this.controlador = controlador;
        this.vista = vista;
        
    }

    public void run(){
        if (vista.jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un producto", "ERROR", 0 );
        } else {
            int resp = JOptionPane.showConfirmDialog(this.vista, "¿Desea borrar el Producto?");
            switch (resp) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Producto Eliminado");
                    Integer id = Integer.parseInt(vista.jTable1.getModel().getValueAt(vista.jTable1.getSelectionModel().getMinSelectionIndex(), 0).toString()); 
                    this.controlador.eliminar(id);
                    vista.cargar();
                    break;
                case 1:
                    break;
                case 2:
                }
                
        }
    }
}
