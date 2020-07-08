package Models;

public class Type_Deduction {
    /*
    * SELECT `id_type_déduction`, `nom_type_déduction` FROM `type_déduction` WHERE 1
    * */
    private int id;
    private String nom;

    public Type_Deduction() {
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
}
