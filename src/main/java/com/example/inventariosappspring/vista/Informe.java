package com.example.inventariosappspring.vista;

import javax.swing.JOptionPane;

// import com.example.inventariosappspring.controlador.ProductoControlador;


public class Informe {
    private Double precioMayor;
    private String precioMayorNombre;
    private Double precioMenor;
    private String precioMenorNombre;
    private Double promedioPrecios;
    public Double getPrecioMayor() {
        return precioMayor;
    }
    public void setPrecioMayor(Double precioMayor) {
        this.precioMayor = precioMayor;
    }
    public String getPrecioMayorNombre() {
        return precioMayorNombre;
    }
    public void setPrecioMayorNombre(String precioMayorNombre) {
        this.precioMayorNombre = precioMayorNombre;
    }
    public Double getPrecioMenor() {
        return precioMenor;
    }
    public void setPrecioMenor(Double precioMenor) {
        this.precioMenor = precioMenor;
    }
    public String getPrecioMenorNombre() {
        return precioMenorNombre;
    }
    public void setPrecioMenorNombre(String precioMenorNombre) {
        this.precioMenorNombre = precioMenorNombre;
    }
    public Double getPromedioPrecios() {
        return promedioPrecios;
    }
    public void setPromedioPrecios(Double promedioPrecios) {
        this.promedioPrecios = promedioPrecios;
    }
    public long getValorInventario() {
        return valorInventario;
    }
    public void setValorInventario(long valorInventario) {
        this.valorInventario = valorInventario;
    }
    private long valorInventario;
    private Vista vista;
    public Informe(Vista vista ){
        this.vista = vista;
    }
    public void run(){
        precioMayor = Double.MIN_VALUE;
        precioMayorNombre = "";
        precioMenor = Double.MAX_VALUE;
        precioMenorNombre = "";
        promedioPrecios = 0.0;
        valorInventario = 0;



    }

    public void mostrar(){
        JOptionPane.showMessageDialog(
            this.vista, "Producto precio mayor: " + precioMayorNombre +
            "\n Producto precio menor: "+ precioMenorNombre +
            "\n Promedio precios: " + String.format("%.1f", promedioPrecios) +
            "\n Valor del Invenario: " + valorInventario,
            "Informe del Inventario", 1); 
    }


}
