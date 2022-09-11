package br.com.alura.mudi.repository;

import br.com.alura.mudi.model.Order;
import br.com.alura.mudi.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByStatus(OrderStatus status);
}