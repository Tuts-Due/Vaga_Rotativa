package com.vagarotativa.spring.controller;

import com.vagarotativa.spring.entidade.Pessoa;
import com.vagarotativa.spring.repository.PessoaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/pessoa")
public class PessoaController {

    private PessoaRepository pessoaRepository;

	

	public PessoaController(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	@PostMapping("/pessoa")
	public void cadastraPessoa(@RequestBody Pessoa pessoa) {
		this.pessoaRepository.save(pessoa);
	}
	
	@RequestMapping(value="/id/{id}", method= RequestMethod.GET, produces="application/json", consumes="application/json")
	public ResponseEntity<Pessoa> buscaEstacionamentosPeloIdPatio(@PathVariable("id") Long id){
		Pessoa pessoa = pessoaRepository.findClienteById(id);
		return new ResponseEntity<>(pessoa, HttpStatus.OK);
	}

}
