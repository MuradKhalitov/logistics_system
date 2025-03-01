package ru.skillbox.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillbox.orderservice.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAll();
    Optional<Order> findById(Long id);

}
