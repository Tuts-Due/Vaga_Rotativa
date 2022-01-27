package com.vagarotativa.spring.controller;

import java.util.List;
import java.util.Optional;

import com.vagarotativa.spring.entidade.Vaga;
import com.vagarotativa.spring.enuns.StatusVaga;
import com.vagarotativa.spring.repository.VagaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class VagaController {

    private VagaRepository vagaRepository;
    
    @GetMapping("/vaga")
    public List<Vaga> getAllCarros(){
        return VagaRepository.findALL();
    }
  
    @GetMapping("/vaga/{id}")
    public Optional<Vaga> getVagaByStatus(@PathVariable StatusVaga statusVaga){
        return VagaRepository.findByAll(statusVaga);
       
    }
    @PostMapping("/vaga")
	public void cadastraCarro(@RequestBody Vaga Vaga) {
		this.vagaRepository.save(Vaga);
    }


}
