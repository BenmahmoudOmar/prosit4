import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DepartementHashSet<T> implements IDepartement<T> {
    private HashSet<T> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(T t) {
        departements.add(t);
    }
    public boolean rechercherDepartement(String nom) {
        for (T departement : departements) {
            if (departement instanceof Departement) {
                Departement dep = (Departement) departement;
                if (dep.getNomDepartement().equals(nom)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean rechercherDepartement(T t) {
        return departements.contains(t);
    }
    public void supprimerDepartement(T t) {
        departements.remove(t);
    }
    public void displayDepartement() {
        for (T departement : departements) {
            System.out.println(departement);
        }
    }
    public TreeSet<T> trierDepartementById() {
        TreeSet<T> sortedDepartments = new TreeSet<>(departements);
        return sortedDepartments;
    }
}
