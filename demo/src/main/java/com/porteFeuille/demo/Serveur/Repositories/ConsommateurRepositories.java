package com.porteFeuille.demo.Serveur.Repositories;

import com.porteFeuille.demo.Serveur.Entity.Entity_table.Consommateur;
import com.porteFeuille.demo.Serveur.Entity.Entity_table.Fournisseur;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface ConsommateurRepositories {
    @Transactional
    @Modifying
    @Query("delete from Consommateur f where f.Nom_Consommateur = ?1")
    void deleteByNom_Consommateur(@NonNull String Nom_Consommateur);
    @Query("select f from Consommateur f where f.Nom_Consommateur = ?1")
    Optional<Consommateur> findByNom_Consommateur(@NonNull String Nom_Consommateur);
}
