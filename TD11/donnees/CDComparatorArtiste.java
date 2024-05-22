package donnees;

import java.util.Comparator;

public class CDComparatorArtiste implements Comparator<CD> {
    @Override
    public int compare(CD cd, CD t1) {
        return cd.getNomArtiste().compareTo(t1.getNomArtiste());
    }
}
