package Models;

public class Extraits {
    /*
     *SELECT `id_extrait`, `id_projet`, `type`, `utilisateur` FROM `extraits` WHERE 1
     * */
    private int id;
    private int id_projet;
    private String type;
    private int id_utilisateur;

    public Extraits() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }
}
