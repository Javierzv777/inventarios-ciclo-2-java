package com.example.inventariosappspring.modelo;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer codigo;
    private String nombre;
    private double precio;
    private Integer inventario;

    Producto(Integer codigo, String nombre, double precio, Integer inventario) {
        //@Column
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    // public Integer getCodigo() {
    //     return codigo;
    // }

    // public void setCodigo(Integer codigo) {
    //     this.codigo = codigo;
    // }

    // public String getNombre() {
    //     return nombre;
    // }

    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }

    // public double getPrecio() {
    //     return precio;
    // }

    // public void setPrecio(double precio) {
    //     this.precio = precio;
    // }

    // public Integer getInventario() {
    //     return inventario;
    // }

    // public void setInventario(Integer inventario) {
    //     this.inventario = inventario;
    // }
    // @Override
    // public String toString() {
    // return "Producto("
    // }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", inventario=" + inventario + ", nombre=" + nombre + ", precio=" + precio
                + "]";
    }

    public void agregar(){

    }
    
    public void actualizar(){

    }

    public void eliminar(){

    }

    public void generarInforme(){
        
    }
}
