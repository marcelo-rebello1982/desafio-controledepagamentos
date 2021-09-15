package com.desafio.pagamento.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.pagamento.dto.ClienteDTO;
import com.desafio.pagamento.entity.Cliente;
import com.desafio.pagamento.repositorio.ClienteRepositorio;
import com.desafio.pagamento.service.ClienteServico;

@Service
public class ClienteServicoImpl implements ClienteServico {

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Override
	public Cliente buscarCliente(ClienteDTO clienteDTO) {
		return clienteRepositorio.findById(clienteDTO.getIdCliente()).orElse(null);
	}

}