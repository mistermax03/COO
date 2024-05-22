package donnees;

import java.util.ArrayList;
import java.util.Comparator;

public class TriAlbum {


    static public ArrayList<CD> trier(ArrayList<CD> arr, Comparator<CD> comparator) {
        ArrayList<CD> r = new ArrayList<CD>();
        while (arr.size()>0) {
            int min = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (comparator.compare(arr.get(i), arr.get(min)) <= 0) min = i;
            }
            r.add(arr.remove(min));
        }
        return r;
    }
}
