package com.desafio.pagamento.service;

import com.desafio.pagamento.entity.Boleto;

public interface BoletoServico {

	public Boleto salvarBoleto(Boleto boleto);

	public Boleto gerarBoleto();
}
