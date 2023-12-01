package com.productos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.productos.repository.ProductoRepository;

@Component
public class ProductoService {
	@Autowired
	private ProductoRepository productoRepository;

	public Producto createrProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto getProductoById(Long id) {
		Optional<Producto> optionalProducto = productoRepository.findById(id);
		return optionalProducto.get();
	}
	
    public List<Producto> getAllProducto() {
        Sort sort = Sort.by(Sort.Direction.ASC, "precio");
        return productoRepository.findAll(sort);
    }
	
	public void deleteProducto(Long id){
		productoRepository.deleteById(id);
	}
	
	
	
	
}
