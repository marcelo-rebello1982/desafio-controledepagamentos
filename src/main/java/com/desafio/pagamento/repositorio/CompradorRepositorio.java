package com.desafio.pagamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.pagamento.entity.Comprador;

@Repository
public interface CompradorRepositorio extends JpaRepository<Comprador, Long> {

	public Comprador findByCpf(String cpf);
}
