package com.vagarotativa.spring.config;
import com.vagarotativa.spring.services.DBservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
   @Autowired 
   private DBservices dbService;

   @Bean
   public void instanciaBaseDeDados(){
      this.dbService.instanciaBaseDeDados();
   }
    
}
