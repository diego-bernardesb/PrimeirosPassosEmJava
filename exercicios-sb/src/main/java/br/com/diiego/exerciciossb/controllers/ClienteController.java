package br.com.diiego.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.diiego.exerciciossb.model.Cliente;

@RestController
@RequestMapping("/clientes")//todas requisições desta classe estão ligadas a URL /clientes
public class ClienteController {

	@GetMapping("/qualqer")
	public Cliente obterCliente() {
		return new Cliente (1, "Pedro", "123.456.789-00");
	}
	
	@GetMapping("/{id}")//recebe o numero informado no URL e o PathVariable envia para o parametro do metodo para que seja inserido no novo cliente
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente( id, "Maria", "987.654.321-00");
	}

	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		//o requestParam nomeia o parametro que vai ser pedido na URL para então usar o resultado como parametro do metodo e criar o cliente, e o defaultValue insere um valor caso nenhum sejá informado.
		return new Cliente( id, "João Augusto", "111.222.333-44");
	}
	
}
