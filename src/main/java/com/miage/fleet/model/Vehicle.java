package com.miage.fleet.model;

public class Vehicle {

    private int id;
    private String numeroInventaire;
    private String marque;
    private String modele;
    private String type;
    private int annee;
    private String immatriculation;
    private String vin;
    private String carburant;
    private String transmission;
    private String couleur;
    private int kilometrage;
    private String statut;
    private String categorie;
    private String departement;
    private String dateAchat;
    private double prixAchat;
    private int kmAchat;
    private String dateMiseService;
    private String dateHorsService;
    private String assuranceNum;
    private String assuranceDebut;
    private String assuranceFin;
    private String assuranceCompagnie;
    private String visiteTechniqueDate;
    private String visiteTechniqueEcheance;
    private String carteGriseNum;
    private int prochainEntretienKm;
    private String image;

    public Vehicle() {
    }

    public Vehicle(String immatriculation, String marque, String modele, int annee, String type, String statut, int kilometrage) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.type = type;
        this.statut = statut;
        this.kilometrage = kilometrage;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumeroInventaire() { return numeroInventaire; }
    public void setNumeroInventaire(String numeroInventaire) { this.numeroInventaire = numeroInventaire; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getCarburant() { return carburant; }
    public void setCarburant(String carburant) { this.carburant = carburant; }

    public String getTransmission() { return transmission; }
    public void setTransmission(String transmission) { this.transmission = transmission; }

    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    public int getKilometrage() { return kilometrage; }
    public void setKilometrage(int kilometrage) { this.kilometrage = kilometrage; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }

    public String getDepartement() { return departement; }
    public void setDepartement(String departement) { this.departement = departement; }

    public String getDateAchat() { return dateAchat; }
    public void setDateAchat(String dateAchat) { this.dateAchat = dateAchat; }

    public double getPrixAchat() { return prixAchat; }
    public void setPrixAchat(double prixAchat) { this.prixAchat = prixAchat; }

    public int getKmAchat() { return kmAchat; }
    public void setKmAchat(int kmAchat) { this.kmAchat = kmAchat; }

    public String getDateMiseService() { return dateMiseService; }
    public void setDateMiseService(String dateMiseService) { this.dateMiseService = dateMiseService; }

    public String getDateHorsService() { return dateHorsService; }
    public void setDateHorsService(String dateHorsService) { this.dateHorsService = dateHorsService; }

    public String getAssuranceNum() { return assuranceNum; }
    public void setAssuranceNum(String assuranceNum) { this.assuranceNum = assuranceNum; }

    public String getAssuranceDebut() { return assuranceDebut; }
    public void setAssuranceDebut(String assuranceDebut) { this.assuranceDebut = assuranceDebut; }

    public String getAssuranceFin() { return assuranceFin; }
    public void setAssuranceFin(String assuranceFin) { this.assuranceFin = assuranceFin; }

    public String getAssuranceCompagnie() { return assuranceCompagnie; }
    public void setAssuranceCompagnie(String assuranceCompagnie) { this.assuranceCompagnie = assuranceCompagnie; }

    public String getVisiteTechniqueDate() { return visiteTechniqueDate; }
    public void setVisiteTechniqueDate(String visiteTechniqueDate) { this.visiteTechniqueDate = visiteTechniqueDate; }

    public String getVisiteTechniqueEcheance() { return visiteTechniqueEcheance; }
    public void setVisiteTechniqueEcheance(String visiteTechniqueEcheance) { this.visiteTechniqueEcheance = visiteTechniqueEcheance; }

    public String getCarteGriseNum() { return carteGriseNum; }
    public void setCarteGriseNum(String carteGriseNum) { this.carteGriseNum = carteGriseNum; }

    public int getProchainEntretienKm() { return prochainEntretienKm; }
    public void setProchainEntretienKm(int prochainEntretienKm) { this.prochainEntretienKm = prochainEntretienKm; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}