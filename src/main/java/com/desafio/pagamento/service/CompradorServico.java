package com.desafio.pagamento.service;

import com.desafio.pagamento.entity.Comprador;

public interface CompradorServico {

	public Comprador buscarComprador(Comprador comprador);

	public Comprador buscarCompradorCPF(String cpf);
	
	public Comprador salvarComprador(Comprador comprador);
}
