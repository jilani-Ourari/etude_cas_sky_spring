package com.example.etude_cas_sky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EtudeCasSkyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudeCasSkyApplication.class, args);
	}

}
