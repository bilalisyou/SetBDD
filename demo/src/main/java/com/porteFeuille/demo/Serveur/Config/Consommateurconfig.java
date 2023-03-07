package com.porteFeuille.demo.Serveur.Config;

import com.porteFeuille.demo.Serveur.Entity.Entity_table.Portefeuille;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Consommateurconfig{
    @Bean
    CommandLineRunner create_wallet(){
        new Portefeuille()
    }

}
