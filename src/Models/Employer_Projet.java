package Models;

public class Employer_Projet {
    /*
    * SELECT `id_emp_poste_project`, `id_employer` FROM `employer_projet` WHERE 1
    * */
    private int id_emp_poste_project;
    private int id_employer;

    public Employer_Projet() {
    }

    public int getId_emp_poste_project() {
        return id_emp_poste_project;
    }

    public void setId_emp_poste_project(int id_emp_poste_project) {
        this.id_emp_poste_project = id_emp_poste_project;
    }

    public int getId_employer() {
        return id_employer;
    }

    public void setId_employer(int id_employer) {
        this.id_employer = id_employer;
    }
}
