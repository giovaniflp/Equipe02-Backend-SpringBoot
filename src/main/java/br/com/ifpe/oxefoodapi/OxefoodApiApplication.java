package br.com.ifpe.oxefoodapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OxefoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiApplication.class, args);
		int num = 0;
		while (num == 0) {
			System.out.println("OxeFood API rodando... Aperte CTRL+C para encerrar.");
		}
	}

}
