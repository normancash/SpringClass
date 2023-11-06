package com.uam.pizza.service;

import com.uam.pizza.dto.DetalleDTO;
import com.uam.pizza.model.Cliente;
import com.uam.pizza.model.Detalle;
import com.uam.pizza.model.Pedido;
import com.uam.pizza.dto.PedidoDTO;
import com.uam.pizza.repository.IClienteRepository;
import com.uam.pizza.repository.IPedidoRepository;
import com.uam.pizza.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePedido implements IServicePedido{
    @Autowired
    private IPedidoRepository repoPedido;

    @Autowired
    private IClienteRepository repoCliente;

    @Autowired
    private IProductoRepository repoProducto;

    @Override
    public List<Pedido> getAll() {
        return repoPedido.findAll();
    }

    @Override
    public Pedido findById(Integer id) {
        return repoPedido.findById(id).get();
    }

    @Override
    public void savePedido(Pedido pedido) {
        repoPedido.save(pedido);
    }

    @Override
    public void savePedido(PedidoDTO pedidoDTO) {
       Pedido pedido = new Pedido();
       Cliente cliente = repoCliente.findById(pedidoDTO.getIdCliente()).get();
       pedido.setCliente(cliente);
       List<Detalle> detalles = new ArrayList<>();
       for (DetalleDTO det : pedidoDTO.getDetalles() ) {
           Detalle detalle = new Detalle();
           detalle.setId(det.getId());
           detalle.setProducto(repoProducto.findById(det.getIdProducto()).get());
           detalle.setPedido(pedido);
           detalles.add(detalle);
       }
       pedido.setId(1);
       pedido.setDetalles(detalles);
       repoPedido.save(pedido);
    }

    @Override
    public void removePedido(Integer id) {
        repoPedido.deleteById(id);
    }
}
