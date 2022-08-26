package com.example.inventariosappspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.inventariosappspring.controlador.ProductoControlador;
import com.example.inventariosappspring.modelo.Producto;
import com.example.inventariosappspring.modelo.ProductoRepositorio;
import com.example.inventariosappspring.vista.Actualizar;
import com.example.inventariosappspring.vista.Agregar;
import com.example.inventariosappspring.vista.Borrar;
import com.example.inventariosappspring.vista.Informe;
import com.example.inventariosappspring.vista.Vista;

@SpringBootApplication
public class InventariosappspringApplication {

	@Autowired
	ProductoRepositorio productoRepositorio;



	public static void main(String[] args) {
		// SpringApplication.run(InventariosappspringApplication.class, args);
	
	SpringApplicationBuilder builder = new SpringApplicationBuilder(InventariosappspringApplication.class);
    builder.headless(false);
    ConfigurableApplicationContext context = builder.run(args);
}

	@Bean
	public void applicationRunner(){
		// controlador.buscarProductos();
		// Producto producto = new Producto();
		Vista vista = new Vista(productoRepositorio);
		ProductoControlador controlador = new ProductoControlador(
			productoRepositorio, 
			vista,
			new Actualizar(vista),
			new Agregar(vista),
			new Borrar(vista),
			new Informe(vista)
			);
		

	}
}


