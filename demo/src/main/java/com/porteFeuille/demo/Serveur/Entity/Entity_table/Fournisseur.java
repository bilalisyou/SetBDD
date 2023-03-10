package com.porteFeuille.demo.Serveur.Entity.Entity_table;

import com.porteFeuille.demo.Serveur.Entity.Object.Adresse;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Embeddable
@Table(name = "Fournisseur")
public class Fournisseur implements Serializable {
    @Id
    @Column(name = "nom_fournisseur", insertable = true, updatable = true)
    private String nom_fournisseur;

    private String siege;
    @Transient
    private Adresse adresse;
    @Transient
    private Contrat contrat;
    private String email;
    /*j'ai supprime la liste de contrat parce qu'on va utiliser la base de donnnees pour
      recuperer les elements infos sur le contrat
      et rajouter le nom de l'adrese email*/
    public Fournisseur() {
    }

    public Fournisseur(String nom_fournisseur, String siege,String email) {
        this.nom_fournisseur = nom_fournisseur;
        this.email = email;
        this.siege = siege;
    }

    public Fournisseur(String nom_fournisseur, Adresse adresse, Contrat contrat, String email) {
        this.nom_fournisseur = nom_fournisseur;
        this.adresse = adresse;
        this.contrat = contrat;
        this.email = email;
    }

    public String getNom_fournisseur() {
        return nom_fournisseur;
    }

    public void setNom_fournisseur(String nom_fournisseur) {
        this.nom_fournisseur = nom_fournisseur;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
