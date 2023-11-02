package com.uam.pizza.service;

import com.uam.pizza.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCliente {

    public List<Cliente> getAll();

    public Cliente save(Cliente cliente);

    public void delete(Integer id);

    List<Cliente> findByNombre(String nombre);

    List<Cliente> getAllPagination(Integer pageNo, Integer pageSize, String sortBy);
}
