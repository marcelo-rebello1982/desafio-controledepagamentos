package com.desafio.pagamento.service;

import com.desafio.pagamento.dto.ClienteDTO;
import com.desafio.pagamento.entity.Cliente;

public interface ClienteServico {

	public Cliente buscarCliente(ClienteDTO clienteDTO);
	
	
}
