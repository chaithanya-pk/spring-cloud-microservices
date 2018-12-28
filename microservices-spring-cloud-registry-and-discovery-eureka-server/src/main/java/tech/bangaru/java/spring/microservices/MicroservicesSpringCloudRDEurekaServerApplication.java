package tech.bangaru.java.spring.microservices;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
public class MicroservicesSpringCloudRDEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSpringCloudRegistryAndDiscoveryEurekaServerApplication.class, args);
	}
	
	//@Value("#{${serviceUrls}}")
	//private Map<String,String> serviceUrls;

}

