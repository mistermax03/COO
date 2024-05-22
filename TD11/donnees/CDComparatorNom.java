package donnees;

import java.util.Comparator;

public class CDComparatorNom implements Comparator<CD> {
    @Override
    public int compare(CD cd, CD t1) {
        return cd.getNomCD().compareTo(t1.getNomCD());
    }
}
