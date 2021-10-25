package br.com.diiego.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.diiego.exerciciossb.model.entity.Produto;
import br.com.diiego.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class NovoProduto {

	@Autowired //cria um objeto dentro da variavel feito pelo spring(*injeção de dependencias*)
	private ProdutoRepository produtoRepository;
	
	//metodo convencional
//	@PostMapping
//	public @ResponseBody Produto novoProduto(@RequestParam String nome, @RequestParam double preco, @RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
//		produtoRepository.save(produto);
//		return produto;
//	}

	//metodo simplificado
	//o spring reconheçe o produdo e não é necessario identificar todos os parametros, apenas adicionar na hora da criação
//	@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})//os 2 metodos utilizam a msm logica então é possivel usar o requestmapping para realizar as 2 operações e economizar codigo
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {//o valid faz todas as anotations da classe produto serem verificadas
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdPagina}")
	public Iterable<Produto> produtosPorPaginas(@PathVariable int numeroPagina, @PathVariable int qtdPagina){
		if(qtdPagina >= 5) qtdPagina = 4;
		Pageable page = PageRequest.of(numeroPagina, qtdPagina);
		return produtoRepository.findAll(page);
		
	}

	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> produtosPorNomes(@PathVariable String parteNome){
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutosPorId (@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping
	public void apagarProduto(@RequestParam(name = "id") int id) {
		produtoRepository.deleteById(id);
	}
	
}
