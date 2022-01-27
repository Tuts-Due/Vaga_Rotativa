package com.vagarotativa.spring.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vagarotativa.spring.entidade.Vaga;
import com.vagarotativa.spring.enuns.StatusVaga;

@Repository

    public interface VagaRepository extends JpaRepository<Vaga,Long>{

	static Vaga getByVaga(long Vaga) {
		
		return null;
	}

	static List<Vaga> findALL() {
		return null;
	}
	

    static Optional<Vaga> findByAll(StatusVaga statusVaga) {
        return null;
    }
	

}
