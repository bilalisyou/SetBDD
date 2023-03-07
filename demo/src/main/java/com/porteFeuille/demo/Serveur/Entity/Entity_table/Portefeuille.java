package com.porteFeuille.demo.Serveur.Entity.Entity_table;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Embeddable
@Table(name = "Portefeuille")
public class Portefeuille {
    private String id;
    private Habitation habitation;
    private Consommateur user;
    private List<Contrat> contrats;

    public Portefeuille(String id, Habitation habitation, Consommateur user,List<Contrat> contrats){
        this.habitation = habitation;
        this.id = id;
        this.user = user;
        this.contrats = contrats;
    }

    public void setContrats(List<Contrat> contrats) {
        this.contrats = contrats;
    }

    public void setHabitation(Habitation habitation) {
        this.habitation = habitation;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUser(Consommateur user) {
        this.user = user;
    }

    public Consommateur getUser() {
        return user;
    }

    public List<Contrat> getContrats() {
        return contrats;
    }

    public Habitation getHabitation() {
        return habitation;
    }

    public String getId() {
        return id;
    }
}
