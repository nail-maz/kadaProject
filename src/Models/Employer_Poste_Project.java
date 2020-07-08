package Models;

public class Employer_Poste_Project {
    /*
    * SELECT `id_employer_poste_project`, `id_poste`, `poste_demander`,
     * `post_disponible`, `id_projet` FROM `employer_poste_project` WHERE 1
    * */
    private int id ;
    private int id_poste;
    private int poste_demander;
    private  int post_disponible;
    private int id_projet;

    public Employer_Poste_Project() {
    }

    public Employer_Poste_Project(int id, int id_poste, int poste_demander, int post_disponible, int id_projet) {
        this.id = id;
        this.id_poste = id_poste;
        this.poste_demander = poste_demander;
        this.post_disponible = post_disponible;
        this.id_projet = id_projet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_poste() {
        return id_poste;
    }

    public void setId_poste(int id_poste) {
        this.id_poste = id_poste;
    }

    public int getPoste_demander() {
        return poste_demander;
    }

    public void setPoste_demander(int poste_demander) {
        this.poste_demander = poste_demander;
    }

    public int getPost_disponible() {
        return post_disponible;
    }

    public void setPost_disponible(int post_disponible) {
        this.post_disponible = post_disponible;
    }

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }
}
