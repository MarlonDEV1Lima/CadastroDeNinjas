package com.mrln.CadastroDeNinjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CadastroDeNinjasApplication {

//	@RequestMapping("/")
//	String home(){
//
//	return "Olá Mundo!";
//	}

	public static void main(String[] args) {
		SpringApplication.run(
				CadastroDeNinjasApplication.class, args);
	}

}
