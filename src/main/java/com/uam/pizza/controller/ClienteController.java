package com.uam.pizza.controller;

import com.uam.pizza.model.Cliente;
import com.uam.pizza.service.IServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteController {


    @Autowired
    private IServiceCliente serviceCliente;

    @GetMapping("/all")
    public List<Cliente> getAll() {
        return serviceCliente.getAll();
    }

    @GetMapping("/findByNombre")
    public List<Cliente> findByNombre(@RequestParam(name="nombre") String nombre) {
        return serviceCliente.findByNombre(nombre);
    }

    @PostMapping("/save")
    public Cliente insert(@RequestBody Cliente cliente) {
        return serviceCliente.save(cliente);
    }

    @PutMapping("/save")
    public Cliente update(@RequestBody Cliente cliente) {
        return serviceCliente.save(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name="id") Integer id) {
        serviceCliente.delete(id);
    }



}
