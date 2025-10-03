package com.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductappCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappCatalogServiceApplication.class, args);
	}

}
