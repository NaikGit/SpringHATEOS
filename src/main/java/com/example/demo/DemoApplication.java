package com.example.demo;

import com.example.demo.domain.ProductionOrder;
import com.example.demo.repository.ProductionOrders;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements ApplicationRunner {

	private final ProductionOrders repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		repository.save(ProductionOrder.create("Order 1"));
		repository.save(ProductionOrder.create("Order 2"));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
