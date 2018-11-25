package com.product.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.product.api.model.Product;
import com.product.api.repository.ProductRepository;

/**
 * @author sriman Java Group
 *
 */
@SpringBootApplication
public class SpringmvcApplication {
	private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

	@Bean
	CommandLineRunner dataBaseLoader() {
		return (String... args) -> {

	        Product product1 = new Product();
	        product1.setName("SAMSUNG GALAXY");
	        product1.setDescription("Galaxy S9 Now in Sunrise Gold.");
	        product1.setType("MOBILE");
	        product1.setCategory("SAMSUNG");
	        product1.setPrice(18000.00);

	        productRepository.save(product1);

	        Product product2 = new Product();
	        product2.setName("APPLE");
	        product2.setDescription("Apple iPhone 8 (Space Grey, 2GB RAM, 64GB Storage)");
	        product2.setType("MOBILE");
	        product2.setCategory("IPHONE");
	        product2.setPrice(60490.00);

	        productRepository.save(product2);
		};
	}

}
