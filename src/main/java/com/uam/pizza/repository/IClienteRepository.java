package com.uam.pizza.repository;

import com.uam.pizza.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Integer> {

    @Query("select e from Cliente e where e.primerNombre = :nombre")
    List<Cliente> findClienteByPrimerNombre(String nombre);

}
