package br.com.rabgestaoti.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rabgestaoti.Hello.model.Produto;

@RestController
public class ProdutoController {
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto(12345,"Computador top de linha pro Antonio", 2500);
		return p;
	}

	@PostMapping("/produto")
	public String receberProduto(@RequestBody Produto p) {
		System.out.println("Produto recebido = "+p);
		return "OK";
	}
	
}