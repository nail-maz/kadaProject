package Models;

import java.util.Date;

public class projet {
    private int id;
    private String projet_name;
    private int budget;
    private String contrat_duree;
    private Date date_contrat;
    private Date date_contrat_debut;
    private Date date_contrat_fin;
    private int zone_projet;
    private int local_projet;

    public projet() {
    }

    public projet(int id, String projet_name, int budget, String contrat_duree, Date date_contrat, Date date_contrat_debut, Date date_contrat_fin, int zone_projet, int local_projet) {
        this.id = id;
        this.projet_name = projet_name;
        this.budget = budget;
        this.contrat_duree = contrat_duree;
        this.date_contrat = date_contrat;
        this.date_contrat_debut = date_contrat_debut;
        this.date_contrat_fin = date_contrat_fin;
        this.zone_projet = zone_projet;
        this.local_projet = local_projet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjet_name() {
        return projet_name;
    }

    public void setProjet_name(String projet_name) {
        this.projet_name = projet_name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getContrat_durée() {
        return contrat_duree;
    }

    public void setContrat_duree(String contrat_duree) {
        this.contrat_duree = contrat_duree;
    }

    public Date getDate_contrat() {
        return date_contrat;
    }

    public void setDate_contrat(Date date_contrat) {
        this.date_contrat = date_contrat;
    }

    public Date getDate_contrat_debut() {
        return date_contrat_debut;
    }

    public void setDate_contrat_debut(Date date_contrat_debut) {
        this.date_contrat_debut = date_contrat_debut;
    }

    public Date getDate_contrat_fin() {
        return date_contrat_fin;
    }

    public void setDate_contrat_fin(Date date_contrat_fin) {
        this.date_contrat_fin = date_contrat_fin;
    }

    public int getZone_projet() {
        return zone_projet;
    }

    public void setZone_projet(int zone_projet) {
        this.zone_projet = zone_projet;
    }

    public int getLocal_projet() {
        return local_projet;
    }

    public void setLocal_projet(int local_projet) {
        this.local_projet = local_projet;
    }
}
