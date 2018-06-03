package org.lichen.springcloud.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaRibbonClientApplicaiton {
	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonClientApplicaiton.class, args);
	}
}
