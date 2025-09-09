package com.example.gerenciador_pedidos.repository;

import com.example.gerenciador_pedidos.model.Categoria;
import com.example.gerenciador_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
