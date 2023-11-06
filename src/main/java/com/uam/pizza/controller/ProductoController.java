package com.uam.pizza.controller;

import com.uam.pizza.model.Producto;
import com.uam.pizza.service.IServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IServiceProducto serviceProducto;

    @GetMapping("/all")
    public List<Producto> getAll() {
        return serviceProducto.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Producto producto) {
        serviceProducto.saveProducto(producto);
    }
}
