package com.uam.pizza.controller;

import com.uam.pizza.model.Pedido;
import com.uam.pizza.dto.PedidoDTO;
import com.uam.pizza.service.IServicePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private IServicePedido servicePedido;

    @GetMapping("/all")
    public List<Pedido> getAll() {
        return servicePedido.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Pedido pedido) {
        servicePedido.savePedido(pedido);
    }

    @PostMapping("/create")
    public void save(@RequestBody PedidoDTO pedidoDTO) {
        servicePedido.savePedido(pedidoDTO);
    }

}
