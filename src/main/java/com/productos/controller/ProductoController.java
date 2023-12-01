package com.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productos.Producto;
import com.productos.ProductoService;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@PostMapping
	public Producto createProducto(@RequestBody Producto producto) {
		return productoService.createrProducto(producto);
	}
	
	@GetMapping
	public List<Producto> getAllProducto(){
		return productoService.getAllProducto();
	}
	
	@GetMapping("{id}")
	public Producto searchProductoById(@PathVariable("id")Long id) {
		return productoService.getProductoById(id);
	}
	
	@DeleteMapping("{id}")
	public void deleteProductoById(@PathVariable("id")Long id) {
		 productoService.deleteProducto(id);
	}
	
	
	

}
