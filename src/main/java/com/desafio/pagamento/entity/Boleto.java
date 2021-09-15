package com.desafio.pagamento.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "boleto")
public class Boleto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idBoleto;
	private Integer numeroBoleto;
	private LocalDate dataVencimento;

	public Integer getNumeroBoleto() {
		return numeroBoleto;
	}

	public void setNumeroBoleto(Integer numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Long getIdBoleto() {
		return idBoleto;
	}

	@Override
	public String toString() {
		return "Boleto [idBoleto=" + idBoleto + ", numeroBoleto=" + numeroBoleto + ", dataVencimento=" + dataVencimento
				+ "]";
	}

}
