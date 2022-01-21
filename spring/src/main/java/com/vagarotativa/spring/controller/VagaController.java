package com.vagarotativa.spring.controller;

import java.util.List;

import com.vagarotativa.spring.entidade.Vaga;
import com.vagarotativa.spring.repository.VagaRepository;

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
@RequestMapping("/vaga")
public class VagaController {
    
    @Autowired
    private VagaRepository vagaRepository;

    @RequestMapping(value = "placa/{idPlaca}", method= RequestMethod.GET, produces="application/json", consumes = "application/json")
    public ResponseEntity<List<Vaga>> buscaVagaPeloNumeroTelefoneEntity(@PathVariable("idPlaca") Integer idPlaca){
        List<Vaga> vaga = vagaRepository.findAllByIdPlaca(idPlaca);
        return new ResponseEntity<>(vaga,HttpStatus.OK);
    }
    @PostMapping("/salvar")
    public void CadastraPessoa(@RequestBody Vaga vaga){
        vagaRepository.save(vaga);
    }

    @RequestMapping(value = "/find/{idVaga}",method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Vaga> buscaVaga(@PathVariable("idVaga") Integer idVaga){
        Vaga vaga = vagaRepository.getById(idVaga);
        return new ResponseEntity<>(vaga,HttpStatus.OK);

    }

}
