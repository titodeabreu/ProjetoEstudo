package br.com.tutorial.contratoEjb;

import java.util.List;

import javax.ejb.Remote;

import br.com.tutorial.entidade.Clientes;

@Remote
public interface ClienteRemote {

	void salvar(Clientes Cliente);
	List<Clientes> listasClientes();
	void excluir (Clientes cliente);
	
}
