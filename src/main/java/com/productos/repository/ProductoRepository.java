package com.productos.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productos.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long > {


}
