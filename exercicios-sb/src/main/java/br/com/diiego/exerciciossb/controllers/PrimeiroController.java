package br.com.diiego.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // transforma em uma api rest para controlar a classe
public class PrimeiroController {

	@GetMapping(path = "/ola") // mapeia o url que será usado para receber a requisição
	public String ola() {
		return "Olá, Spring Boot :)";
	}

	@PostMapping(path = "/ola") //2 metodos não podem usar a msm url a não ser que realizem funções diferentes no HTTP ex: um POST e um GET podem usar a msm url, mas 2 GET não podem usar a msm url.
	public String saudacao() {
		return "Olá, Spring Boot :)";
	}
}
