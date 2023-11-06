package com.uam.pizza.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="CLIENTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable  {

    @Id
    private Integer id;

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

}
