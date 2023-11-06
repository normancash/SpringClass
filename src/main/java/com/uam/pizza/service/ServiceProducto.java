package com.uam.pizza.service;

import com.uam.pizza.model.Producto;
import com.uam.pizza.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProducto implements IServiceProducto {

    @Autowired
    private IProductoRepository repo;
    @Override
    public List<Producto> getAll() {
        return repo.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public void saveProducto(Producto producto) {
        repo.save(producto);
    }

    @Override
    public void removeProducto(Integer id) {
        repo.deleteById(id);
    }
}
