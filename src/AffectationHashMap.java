import java.util.HashMap;
import java.util.TreeMap;

public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }
    public void affecterEmploye(Employe employe, Departement departement) {
        if (!affectations.containsKey(employe)) {
            affectations.put(employe, departement);
            System.out.println("Employé '" + employe.getNom() + "' affecté au département '" + departement.getNomDepartement() + "'.");
        } else {
            System.out.println("Cet employé est déjà affecté à un département.");
        }
    }
    public Departement obtenirDepartement(Employe employe) {
        return affectations.getOrDefault(employe, null);
    }
    public void retirerEmploye(Employe employe) {
        if (affectations.containsKey(employe)) {
            affectations.remove(employe);
            System.out.println("Employé '" + employe.getNom() + "' retiré de son département.");
        } else {
            System.out.println("Cet employé n'est affecté à aucun département.");
        }
    }
    public void afficherAffectations() {
        System.out.println("Affectations actuelles :");
        for (Employe employe : affectations.keySet()) {
            Departement departement = affectations.get(employe);
            System.out.println("Employé '" + employe.getNom() + "' affecté au département '" + departement.getNomDepartement() + "'.");
        }
    }
    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        if (!affectations.containsKey(employe)) {
            affectations.put(employe, departement);
            System.out.println("Employé '" + employe.getNom() + "' ajouté au département '" + departement.getNomDepartement() + "'.");
        } else {
            System.out.println("Cet employé est déjà affecté à un département.");
        }
    }
    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des employés et leurs départements :");
        for (Employe employe : affectations.keySet()) {
            Departement departement = affectations.get(employe);
            System.out.println("Employé '" + employe.getNom() + "' - Département : '" + departement.getNomDepartement() + "'.");
        }
    }
    public void supprimerEmploye(Employe employe) {
        if (affectations.containsKey(employe)) {
            affectations.remove(employe);
            System.out.println("Employé '" + employe.getNom() + "' supprimé de la collection.");
        } else {
            System.out.println("Cet employé n'est pas présent dans la collection.");
        }
    }
    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
        if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
            affectations.remove(employe);
            System.out.println("Employé '" + employe.getNom() + "' supprimé du département '" + departement.getNomDepartement() + "'.");
        } else {
            System.out.println("Cet employé n'est pas affecté à ce département.");
        }
    }
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe employe : affectations.keySet()) {
            System.out.println("Employé '" + employe.getNom() + "'");
        }
    }
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement departement : affectations.values()) {
            System.out.println("Département '" + departement.getNomDepartement() + "'");
        }
    }
    public boolean rechercherEmploye(Employe employe) {
        return affectations.containsKey(employe);
    }
    public boolean rechercherDepartement(Departement departement) {
        return affectations.containsValue(departement);
    }
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> employesTries = new TreeMap<>((e1, e2) -> e1.getIdentifiant() - e2.getIdentifiant());
        employesTries.putAll(affectations);
        return employesTries;
    }

    public static void main(String[] args) {
        AffectationHashMap gestionAffectations = new AffectationHashMap();

        Employe employe1 = new Employe(1, 3, "Doe", "John", "Département A");
        Employe employe2 = new Employe(2, 2, "Smith", "Jane", "Département B");

        Departement departementA = new Departement(101, "Département A", 10);
        Departement departementB = new Departement(102, "Département B", 15);

        gestionAffectations.affecterEmploye(employe1, departementA);
        gestionAffectations.affecterEmploye(employe2, departementB);
        gestionAffectations.affecterEmploye(employe1, departementB); 
        gestionAffectations.ajouterEmployeDepartement(employe1, departementA);
        System.out.println("Département de John Doe : " + gestionAffectations.obtenirDepartement(employe1));
        gestionAffectations.retirerEmploye(employe1);
        gestionAffectations.afficherAffectations();
        System.out.println("------------------------------");
        gestionAffectations.afficherEmployesEtDepartements();
    }
}
