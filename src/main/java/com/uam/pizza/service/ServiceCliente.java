package com.uam.pizza.service;

import com.uam.pizza.model.Cliente;
import com.uam.pizza.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
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

    @Override
    public List<Cliente> findByNombre(String nombre) {
        return repo.findClienteByPrimerNombre(nombre);
    }

    @Override
    public List<Cliente> getAllPagination(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable pageable = PageRequest.of(pageNo,pageSize, Sort.by(sortBy));
        Page pagedResult = repo.findAll(pageable);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Cliente>();
        }
    }
}
