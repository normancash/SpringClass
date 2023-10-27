package com.uam.pizza.service;

import com.uam.pizza.model.Cliente;
import com.uam.pizza.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceCliente implements IServiceCliente{

    @Autowired
    private IClienteRepository repo;

    @Override
    public List<Cliente> getAll() {
        return repo.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
