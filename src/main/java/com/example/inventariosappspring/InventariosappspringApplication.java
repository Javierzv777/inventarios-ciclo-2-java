package com.example.inventariosappspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.inventariosappspring.controlador.ProductoControlador;
import com.example.inventariosappspring.modelo.ProductoRepositorio;
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
		// ProductoControlador controlador = new ProductoControlador(productoRepositorio, new Vista() );
		// controlador.buscarProductos();
		Vista vista = new Vista();
		
	}
}
