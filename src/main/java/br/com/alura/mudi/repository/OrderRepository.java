package br.com.alura.mudi.repository;

import br.com.alura.mudi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}