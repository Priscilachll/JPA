package com.ventas.Demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventas.Demo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}