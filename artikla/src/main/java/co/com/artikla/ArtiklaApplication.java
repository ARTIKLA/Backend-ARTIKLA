package co.com.artikla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan (basePackages="co.com.entities,co.com.repositories,co.com.services")
@EntityScan(basePackages = {"co.com.entities"}) 
@EnableJpaRepositories ("co.com.repositories")

public class ArtiklaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtiklaApplication.class, args);
	}

}
