package com.uam.pizza.service;

import com.uam.pizza.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceProducto {

    public List<Producto> getAll();

    public Producto findById(Integer id);

    public void saveProducto(Producto producto);

    public void removeProducto(Integer id);
}
