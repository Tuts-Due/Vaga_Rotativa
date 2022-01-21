package com.vagarotativa.spring.controller;

import com.vagarotativa.spring.entidade.Pessoa;
import com.vagarotativa.spring.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private PessoaRepository pessoaRepository;
	
	@Autowired
	public PessoaController(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	@PostMapping("/salvar")
	public Pessoa cadastraCliente(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@RequestMapping(value="/numeroTelefone/{numeroTelefone}", method= RequestMethod.GET, produces="application/json", consumes="application/json")
	public ResponseEntity<Pessoa> buscaVagaPeloNumeroTelefoneEntity(@PathVariable("numeroTelefone") String numeroTelefone){
		Pessoa pessoa = pessoaRepository.findPessoaByNumeroTelefone(numeroTelefone);
		return new ResponseEntity<>(pessoa, HttpStatus.OK);
	}
}
