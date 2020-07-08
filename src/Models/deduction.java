package Models;

public class deduction {
    /*
    *SELECT `id_déduction`, `id_type_déduction`, `id_projet`, `montant`, `employer` FROM `déduction` WHERE 1
    * */
    private int id;
    private int id_type_deduction;
    private int id_projet;
    private int montant;

    public deduction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_type_deduction() {
        return id_type_deduction;
    }

    public void setId_type_deduction(int id_type_deduction) {
        this.id_type_deduction = id_type_deduction;
    }

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
