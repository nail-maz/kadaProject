package Models;

public class Projet_Localisation {
    private int id;
    private String localisation_name;
    private int id_zone;

    public String getLocalisation_name() {
        return localisation_name;
    }

    public void setLocalisation_name(String localisation_name) {
        this.localisation_name = localisation_name;
    }

    public int getId_zone() {
        return id_zone;
    }

    public void setId_zone(int id_zone) {
        this.id_zone = id_zone;
    }


    public Projet_Localisation(int id, String localisation_name, int id_zone) {
        this.id = id;
        this.localisation_name = localisation_name;
        this.id_zone = id_zone;
    }

    public Projet_Localisation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
