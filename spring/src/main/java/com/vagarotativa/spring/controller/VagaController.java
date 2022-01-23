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

   @RequestMapping(value = "placa/{placa}", method= RequestMethod.GET, produces="application/json", consumes = "application/json")
    public ResponseEntity<List<Vaga>> buscaVagaPelaPlacaEntity(@PathVariable("placa") String placa){
        List<Vaga> vaga = vagaRepository.findByPlaca(placa);
        return new ResponseEntity<>(vaga,HttpStatus.OK);
    }
    @PostMapping("/salvar")
        public void CadastraPessoa(@RequestBody Vaga vaga){
        vagaRepository.save(vaga);
    }

    @RequestMapping(value = "/find/{vaga}",method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Vaga> buscaVaga(@PathVariable("Vaga") Integer Vaga){
        Vaga vaga = vagaRepository.findByVaga(Vaga); 
        return new ResponseEntity<>(vaga,HttpStatus.OK);

    }

}
