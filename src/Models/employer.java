package Models;

import java.sql.Date;

public class employer {

    private int id;
    private String name;
    private  String nationalité;
    private int nemuro_nationalité;
    private String type_nationalité;
    private String religion;
    private String occupation_réelle;
    private String occupation_résidence;
    private Date date_fin_résidence;
    private Date date_debut;
    private Date date_fin;

    public employer() {
    }

    public employer(int id, String name, String nationalité, int nemuro_nationalité, String type_nationalité, String religion, String occupation_réelle, String occupation_résidence, Date date_fin_résidence, Date date_debut, Date date_fin) {
        this.id = id;
        this.name = name;
        this.nationalité = nationalité;
        this.nemuro_nationalité = nemuro_nationalité;
        this.type_nationalité = type_nationalité;
        this.religion = religion;
        this.occupation_réelle = occupation_réelle;
        this.occupation_résidence = occupation_résidence;
        this.date_fin_résidence = date_fin_résidence;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public int getNemuro_nationalité() {
        return nemuro_nationalité;
    }

    public void setNemuro_nationalité(int nemuro_nationalité) {
        this.nemuro_nationalité = nemuro_nationalité;
    }

    public String getType_nationalité() {
        return type_nationalité;
    }

    public void setType_nationalité(String type_nationalité) {
        this.type_nationalité = type_nationalité;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getOccupation_réelle() {
        return occupation_réelle;
    }

    public void setOccupation_réelle(String occupation_réelle) {
        this.occupation_réelle = occupation_réelle;
    }

    public String getOccupation_résidence() {
        return occupation_résidence;
    }

    public void setOccupation_résidence(String occupation_résidence) {
        this.occupation_résidence = occupation_résidence;
    }

    public Date getDate_fin_résidence() {
        return date_fin_résidence;
    }

    public void setDate_fin_résidence(Date date_fin_résidence) {
        this.date_fin_résidence = date_fin_résidence;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
}
