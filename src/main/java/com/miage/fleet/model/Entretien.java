package com.miage.fleet.model;

import java.util.List;

public class Entretien {
    private String id;
    private String vehicule;
    private String immatriculation;
    private String numeroInv;
    private String type;
    private String nature;
    private String description;
    private String garage;
    private String adresseGarage;
    private String technicien;
    private String dateEntree;
    private String dateSortiePrevue;
    private String dateSortieReelle;
    private int coutEstime;
    private int coutReel;
    private String statut;
    private String priorite;
    private int kmEntree;
    private List<String> pieces;
    private String bonCommande;

    public Entretien() {}

    public Entretien(String id, String vehicule, String immatriculation, String numeroInv,
                     String type, String nature, String description, String garage,
                     String adresseGarage, String technicien, String dateEntree,
                     String dateSortiePrevue, String dateSortieReelle, int coutEstime,
                     int coutReel, String statut, String priorite, int kmEntree,
                     List<String> pieces, String bonCommande) {
        this.id = id;
        this.vehicule = vehicule;
        this.immatriculation = immatriculation;
        this.numeroInv = numeroInv;
        this.type = type;
        this.nature = nature;
        this.description = description;
        this.garage = garage;
        this.adresseGarage = adresseGarage;
        this.technicien = technicien;
        this.dateEntree = dateEntree;
        this.dateSortiePrevue = dateSortiePrevue;
        this.dateSortieReelle = dateSortieReelle;
        this.coutEstime = coutEstime;
        this.coutReel = coutReel;
        this.statut = statut;
        this.priorite = priorite;
        this.kmEntree = kmEntree;
        this.pieces = pieces;
        this.bonCommande = bonCommande;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getVehicule() { return vehicule; }
    public void setVehicule(String vehicule) { this.vehicule = vehicule; }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

    public String getNumeroInv() { return numeroInv; }
    public void setNumeroInv(String numeroInv) { this.numeroInv = numeroInv; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getNature() { return nature; }
    public void setNature(String nature) { this.nature = nature; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getGarage() { return garage; }
    public void setGarage(String garage) { this.garage = garage; }

    public String getAdresseGarage() { return adresseGarage; }
    public void setAdresseGarage(String adresseGarage) { this.adresseGarage = adresseGarage; }

    public String getTechnicien() { return technicien; }
    public void setTechnicien(String technicien) { this.technicien = technicien; }

    public String getDateEntree() { return dateEntree; }
    public void setDateEntree(String dateEntree) { this.dateEntree = dateEntree; }

    public String getDateSortiePrevue() { return dateSortiePrevue; }
    public void setDateSortiePrevue(String dateSortiePrevue) { this.dateSortiePrevue = dateSortiePrevue; }

    public String getDateSortieReelle() { return dateSortieReelle; }
    public void setDateSortieReelle(String dateSortieReelle) { this.dateSortieReelle = dateSortieReelle; }

    public int getCoutEstime() { return coutEstime; }
    public void setCoutEstime(int coutEstime) { this.coutEstime = coutEstime; }

    public int getCoutReel() { return coutReel; }
    public void setCoutReel(int coutReel) { this.coutReel = coutReel; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getPriorite() { return priorite; }
    public void setPriorite(String priorite) { this.priorite = priorite; }

    public int getKmEntree() { return kmEntree; }
    public void setKmEntree(int kmEntree) { this.kmEntree = kmEntree; }

    public List<String> getPieces() { return pieces; }
    public void setPieces(List<String> pieces) { this.pieces = pieces; }

    public String getBonCommande() { return bonCommande; }
    public void setBonCommande(String bonCommande) { this.bonCommande = bonCommande; }
}