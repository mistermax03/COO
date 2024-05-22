package donnees;

import java.util.Comparator;

public class CDComparatorNbPiste implements Comparator<CD> {
    @Override
    public int compare(CD cd, CD t1) {
        return cd.getNbTitre() - t1.getNbTitre();
    }
}
