package Models;

public class Extraits_Mensuels {
    /*
    * SELECT `id_extrait`, `mois`, `année` FROM `extraits_mensuels` WHERE 1
    * */
    private int id_extrait;
    private String mois;
    private int annee;

    public Extraits_Mensuels() {
    }

    public int getId_extrait() {
        return id_extrait;
    }

    public void setId_extrait(int id_extrait) {
        this.id_extrait = id_extrait;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
