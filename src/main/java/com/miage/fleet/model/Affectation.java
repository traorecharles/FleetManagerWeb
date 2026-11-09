package com.miage.fleet.model;

public class Affectation {
    private String id;
    private int vehiculeId;
    private String vehicule;
    private String immatriculation;
    private String employe;
    private String employeMatricule;
    private String fonction;
    private String departement;
    private String dateDebut;
    private String dateFin;
    private int kmDebut;
    private int kmActuel;
    private String statut;
    private String motif;
    private String vehiculeImage;

    public Affectation() {}

    public Affectation(String id, int vehiculeId, String vehicule, String immatriculation,
                       String employe, String employeMatricule, String fonction, String departement,
                       String dateDebut, String dateFin, int kmDebut, int kmActuel,
                       String statut, String motif, String vehiculeImage) {
        this.id = id;
        this.vehiculeId = vehiculeId;
        this.vehicule = vehicule;
        this.immatriculation = immatriculation;
        this.employe = employe;
        this.employeMatricule = employeMatricule;
        this.fonction = fonction;
        this.departement = departement;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.kmDebut = kmDebut;
        this.kmActuel = kmActuel;
        this.statut = statut;
        this.motif = motif;
        this.vehiculeImage = vehiculeImage;
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

    public String getFonction() { return fonction; }
    public void setFonction(String fonction) { this.fonction = fonction; }

    public String getDepartement() { return departement; }
    public void setDepartement(String departement) { this.departement = departement; }

    public String getDateDebut() { return dateDebut; }
    public void setDateDebut(String dateDebut) { this.dateDebut = dateDebut; }

    public String getDateFin() { return dateFin; }
    public void setDateFin(String dateFin) { this.dateFin = dateFin; }

    public int getKmDebut() { return kmDebut; }
    public void setKmDebut(int kmDebut) { this.kmDebut = kmDebut; }

    public int getKmActuel() { return kmActuel; }
    public void setKmActuel(int kmActuel) { this.kmActuel = kmActuel; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }

    public String getVehiculeImage() { return vehiculeImage; }
    public void setVehiculeImage(String vehiculeImage) { this.vehiculeImage = vehiculeImage; }
}