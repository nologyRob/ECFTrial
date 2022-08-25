package com.nology.ECF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcfApplication.class, args);
	}

}
