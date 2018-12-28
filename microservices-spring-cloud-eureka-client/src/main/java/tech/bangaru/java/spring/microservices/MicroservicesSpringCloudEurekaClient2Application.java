package tech.bangaru.java.spring.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesSpringCloudEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSpringCloudEurekaClient2Application.class, args);
	}

}

