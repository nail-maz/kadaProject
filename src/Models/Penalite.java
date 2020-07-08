package Models;

public class Penalite {
    /*SELECT `id_pénalité`, `id_projet`, `type_pénalité`, `employer` FROM `pénalité` WHERE 1*/
    private int id;
    private int id_projet;
    private String type_penalite;
    private int id_employer;

    public Penalite() {
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

    public String getType_penalite() {
        return type_penalite;
    }

    public void setType_penalite(String type_penalite) {
        this.type_penalite = type_penalite;
    }

    public int getId_employer() {
        return id_employer;
    }

    public void setId_employer(int id_employer) {
        this.id_employer = id_employer;
    }
}
