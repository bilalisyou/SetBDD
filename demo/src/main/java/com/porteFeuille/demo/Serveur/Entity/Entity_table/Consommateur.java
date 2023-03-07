package com.porteFeuille.demo.Serveur.Entity.Entity_table;

import com.porteFeuille.demo.Serveur.Entity.Object.ConsommationId;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Embeddable
@Table(name = "Consommateur")
public class Consommateur implements Serializable {
    private String Nom_Consommateur;
    private String ConsommateurId;

    private String Prénom;
    private String Nom;
    private String Email;
    private String MotDePasse;

    public Consommateur(String Nom_Consommateur, String ConsommateurId, String Prénom, String Nom, String Email, String MotDePasse) {
        this.Nom_Consommateur = Nom_Consommateur;
        this.ConsommateurId = ConsommateurId;
        this.Nom = Nom;
        this.Email = Email;
        this.MotDePasse = MotDePasse;
    }

    public void setConsommateurId(String consommateurId) {
        ConsommateurId = consommateurId;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setMotDePasse(String motDePasse) {
        MotDePasse = motDePasse;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setNom_Consommateur(String nom_Consommateur) {
        Nom_Consommateur = nom_Consommateur;
    }

    public void setPrénom(String prénom) {
        Prénom = prénom;
    }

    public String getEmail() {
        return Email;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public String getConsommateurId() {
        return ConsommateurId;
    }

    public String getNom() {
        return Nom;
    }

    public String getNom_Consommateur() {
        return Nom_Consommateur;
    }

    public String getPrénom() {
        return Prénom;
    }
}
