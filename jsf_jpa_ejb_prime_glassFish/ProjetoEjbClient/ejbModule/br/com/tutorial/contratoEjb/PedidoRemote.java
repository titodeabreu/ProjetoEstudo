package br.com.tutorial.contratoEjb;

import java.util.List;

import javax.ejb.Remote;

import br.com.tutorial.entidade.Pedidos;

@Remote
public interface PedidoRemote {

	void salvarPedido(Pedidos pedidos);
	List<Pedidos> listarPedidos();
	
}
