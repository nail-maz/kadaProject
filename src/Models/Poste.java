package Models;

public class Poste {
    private int id;
    private String post_nom;

    public Poste() {
    }

    public Poste(int id, String post_nom) {
        this.id = id;
        this.post_nom = post_nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost_nom() {
        return post_nom;
    }

    public void setPost_nom(String post_nom) {
        this.post_nom = post_nom;
    }
}
