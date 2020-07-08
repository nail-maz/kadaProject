package Models;

public class Garantie_Mise_jour {
    /*
    * SELECT `id_mise_jour`, `id_garantie_bancaire`, `type_contrat`, `type_garantie`,
     * `id_utilisateur` FROM `garantie_mise_jour` WHERE 1
    * */
    private int id;
    private String type_contrat;
    private String type_garantie;
    private int id_utilisateur;

    public Garantie_Mise_jour() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }
}
