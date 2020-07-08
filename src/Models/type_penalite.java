package Models;

public class type_penalite {

    
    private int id;
    private String nom;
    private int penalite_prix;

    public type_penalite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPenalite_prix() {
        return penalite_prix;
    }

    public void setPenalite_prix(int penalite_prix) {
        this.penalite_prix = penalite_prix;
    }
}
