package com.uam.pizza.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detalle  implements Serializable{
    @Id
    private Integer id;

    @ManyToOne(fetch= FetchType.LAZY,optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="pedido_id",referencedColumnName = "id")
    @JsonIgnore
    private Pedido pedido;
}
