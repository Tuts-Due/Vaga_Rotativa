package com.vagarotativa.spring.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vagarotativa.spring.entidade.Vaga;

@Repository
    public interface VagaRepository extends JpaRepository<Vaga,Integer>{

    //Vaga getByVaga(Integer Vaga);

	List<Vaga> findByPlaca(String placa);

	Vaga findByVaga(Integer vaga);


}
