package com.vagarotativa.spring.controller;

import com.vagarotativa.spring.entidade.Carro;
import com.vagarotativa.spring.repository.CarroRepository;

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
@RequestMapping("/carro")
public class CarroController {

    private CarroRepository carroRepository;

    @Autowired
    public CarroController (CarroRepository carroRepository){
        this.carroRepository = carroRepository;
    }
    @RequestMapping (value = "/placa/{placa}", method = RequestMethod.GET, produces = "application/json",consumes="application/json")
    public ResponseEntity<Carro> buscaVagaPeloIdPlaca(@PathVariable("placa") String placa){
        Carro carro = carroRepository.findByPlaca(placa);
        return new ResponseEntity<>(carro, HttpStatus.OK);
        
    }
    @PostMapping("/salvar")
	public void cadastraCarro(@RequestBody Carro carro) {
		this.carroRepository.save(carro);
}
}