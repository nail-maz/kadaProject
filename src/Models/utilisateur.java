package Models;

public class utilisateur {
    private int id;
    private String nom_prenom;
    private int nemuro_travail;
    private String nom_travail;
    private String lieu_travail;
    private int nemuro_telephone;
    private String email;
    private String nom_utilisateur;
    private String mot_pass;


    public utilisateur() {
    }

    public utilisateur(int id, String nom_prenom, int nemuro_travail, String nom_travail, String lieu_travail, int nemuro_telephone, String email, String nom_utilisateur, String mot_pass) {
        this.id = id;
        this.nom_prenom = nom_prenom;
        this.nemuro_travail = nemuro_travail;
        this.nom_travail = nom_travail;
        this.lieu_travail = lieu_travail;
        this.nemuro_telephone = nemuro_telephone;
        this.email = email;
        this.nom_utilisateur = nom_utilisateur;
        this.mot_pass = mot_pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_prenom() {
        return nom_prenom;
    }

    public void setNom_prenom(String nom_prenom) {
        this.nom_prenom = nom_prenom;
    }

    public int getNemuro_travail() {
        return nemuro_travail;
    }

    public void setNemuro_travail(int nemuro_travail) {
        this.nemuro_travail = nemuro_travail;
    }

    public String getNom_travail() {
        return nom_travail;
    }

    public void setNom_travail(String nom_travail) {
        this.nom_travail = nom_travail;
    }

    public String getLieu_travail() {
        return lieu_travail;
    }

    public void setLieu_travail(String lieu_travail) {
        this.lieu_travail = lieu_travail;
    }

    public int getNemuro_telephone() {
        return nemuro_telephone;
    }

    public void setNemuro_telephone(int nemuro_telephone) {
        this.nemuro_telephone = nemuro_telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getMot_pass() {
        return mot_pass;
    }

    public void setMot_pass(String mot_pass) {
        this.mot_pass = mot_pass;
    }
}
