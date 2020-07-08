package Models;

public class Garantie_Bancaire {
    /*
    * SELECT `id_garantie_bancaire`, `id_projet`, `type_contrat`, `type_garantie` FROM `garantie_bancaire` WHERE 1
    * */
    private int id;
    private int id_projet;
    private String type_contrat;
    private String type_garantie;

    public Garantie_Bancaire() {
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

    public String getType_contrat() {
        return type_contrat;
    }

    public void setType_contrat(String type_contrat) {
        this.type_contrat = type_contrat;
    }

    public String getType_garantie() {
        return type_garantie;
    }

    public void setType_garantie(String type_garantie) {
        this.type_garantie = type_garantie;
    }
}
