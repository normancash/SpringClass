package com.uam.pizza.service;

import com.uam.pizza.model.Pedido;
import com.uam.pizza.dto.PedidoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicePedido {

    List<Pedido> getAll();

    Pedido findById(Integer id);

    void savePedido(Pedido pedido);

    void savePedido(PedidoDTO pedido);

    void removePedido(Integer id);
}
