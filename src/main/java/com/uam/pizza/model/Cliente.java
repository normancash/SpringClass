package com.uam.pizza.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CLIENTE")
@Data
public class Cliente {

    @Id
    private Integer id;

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

}
