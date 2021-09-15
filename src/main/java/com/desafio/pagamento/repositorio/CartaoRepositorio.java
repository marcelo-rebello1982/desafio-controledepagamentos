package com.desafio.pagamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.pagamento.entity.CartaoCredito;

@Repository
public interface CartaoRepositorio extends JpaRepository<CartaoCredito, Long> {

}
