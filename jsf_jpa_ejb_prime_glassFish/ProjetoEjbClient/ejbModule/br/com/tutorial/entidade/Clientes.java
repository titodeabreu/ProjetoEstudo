package br.com.tutorial.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Clientes")
public class Clientes implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cliente" , unique=true, nullable = false)
	private Integer idCliente;
	
	@Column(name="cpf" , unique=true, nullable = false, length =11)
	private String cpf;
	
	@Column(name="nome",unique=true, nullable=false, length=150)
	private String nome;
	
	@OneToMany(mappedBy="cliente")
	private List<Pedidos> pedidos;
	
	
	//GETTERS AND SETTERS

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	
	
}


