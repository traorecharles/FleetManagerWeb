package com.miage.fleet.model;

public class Mission {
    private String id;
    private int vehiculeId;
    private String vehicule;
    private String immatriculation;
    private String employe;
    private String employeMatricule;
    private String departement;
    private String destination;
    private String motif;
    private String dateDepart;
    private String dateRetour;
    private int kmDepart;
    private Integer kmRetour;
    private String statut;
    private String ordreMission;
    private String chauffeur;

    public Mission() {}

    public Mission(String id, int vehiculeId, String vehicule, String immatriculation,
                   String employe, String employeMatricule, String departement,
                   String destination, String motif, String dateDepart, String dateRetour,
                   int kmDepart, Integer kmRetour, String statut, String ordreMission, String chauffeur) {
        this.id = id;
        this.vehiculeId = vehiculeId;
        this.vehicule = vehicule;
        this.immatriculation = immatriculation;
        this.employe = employe;
        this.employeMatricule = employeMatricule;
        this.departement = departement;
        this.destination = destination;
        this.motif = motif;
        this.dateDepart = dateDepart;
        this.dateRetour = dateRetour;
        this.kmDepart = kmDepart;
        this.kmRetour = kmRetour;
        this.statut = statut;
        this.ordreMission = ordreMission;
        this.chauffeur = chauffeur;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getVehiculeId() { return vehiculeId; }
    public void setVehiculeId(int vehiculeId) { this.vehiculeId = vehiculeId; }

    public String getVehicule() { return vehicule; }
    public void setVehicule(String vehicule) { this.vehicule = vehicule; }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }

    public String getEmploye() { return employe; }
    public void setEmploye(String employe) { this.employe = employe; }

    public String getEmployeMatricule() { return employeMatricule; }
    public void setEmployeMatricule(String employeMatricule) { this.employeMatricule = employeMatricule; }

    public String getDepartement() { return departement; }
    public void setDepartement(String departement) { this.departement = departement; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }

    public String getDateDepart() { return dateDepart; }
    public void setDateDepart(String dateDepart) { this.dateDepart = dateDepart; }

    public String getDateRetour() { return dateRetour; }
    public void setDateRetour(String dateRetour) { this.dateRetour = dateRetour; }

    public int getKmDepart() { return kmDepart; }
    public void setKmDepart(int kmDepart) { this.kmDepart = kmDepart; }

    public Integer getKmRetour() { return kmRetour; }
    public void setKmRetour(Integer kmRetour) { this.kmRetour = kmRetour; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getOrdreMission() { return ordreMission; }
    public void setOrdreMission(String ordreMission) { this.ordreMission = ordreMission; }

    public String getChauffeur() { return chauffeur; }
    public void setChauffeur(String chauffeur) { this.chauffeur = chauffeur; }
}