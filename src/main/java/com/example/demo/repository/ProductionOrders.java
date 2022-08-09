package com.example.demo.repository;

import com.example.demo.domain.ProductionOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductionOrders extends CrudRepository<ProductionOrder, Long> {
}
