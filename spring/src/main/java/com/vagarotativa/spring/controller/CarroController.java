package com.vagarotativa.spring.controller;

import java.util.List;
import com.vagarotativa.spring.entidade.Carro;
import com.vagarotativa.spring.repository.CarroRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@AllArgsConstructor
public class CarroController {

    private CarroRepository carroRepository;

    
   
 /*   @RequestMapping (value = "/placa/{placa}", method = RequestMethod.GET, produces = "application/json",consumes="application/json")
    public ResponseEntity<Carro> buscaVagaPeloIdPlaca(@PathVariable("placa") String placa){
        Carro carro = carroRepository.findByPlaca(placa);
        return new ResponseEntity<>(carro, HttpStatus.OK);
        
    }*/
    @GetMapping("/carro")
    public List<Carro> getAllCarros(){
        return CarroRepository.findALL();
    }
    @GetMapping("/carro/{id}")
    public Carro getCarroById(@PathVariable long id){
        return CarroRepository.findById(id);
       
    }
    @PostMapping("/carro")
	public void cadastraCarro(@RequestBody Carro carro) {
		this.carroRepository.save(carro);
    }
    @DeleteMapping("/carro/{id}")
    public void deleteCarro(@PathVariable Long id){
        CarroRepository.deleteById(id);
    }

}