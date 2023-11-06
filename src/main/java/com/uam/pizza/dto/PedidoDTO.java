package com.uam.pizza.dto;

import com.uam.pizza.model.Detalle;
import lombok.Data;

import java.util.List;

@Data
public class PedidoDTO {

    public Integer idCliente;

    public List<DetalleDTO> detalles;

}
