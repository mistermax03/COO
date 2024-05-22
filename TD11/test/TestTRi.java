package test;

import XML.ChargeurCD;
import XML.ChargeurMagasin;
import donnees.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTRi {

    @Test
    public void test_tri_nom() throws IOException {
        Magasin magasin = new ChargeurMagasin("musicbrainzSimple/").chargerMagasin();
        CDComparatorNom comparator = new CDComparatorNom();
        magasin.trier(comparator);
        assertTrue(comparator.compare(magasin.getCd(0), magasin.getCd(magasin.getNombreCds()-1))< 0);

    }

    @Test
    public void test_tri_artiste() throws IOException {
        Magasin magasin = new ChargeurMagasin("musicbrainzSimple/").chargerMagasin();
        CDComparatorArtiste comparator = new CDComparatorArtiste();
        magasin.trier(comparator);
        assertTrue(comparator.compare(magasin.getCd(0), magasin.getCd(magasin.getNombreCds()-1))< 0);

    }

    @Test
    public void test_tri_nbcd() throws IOException {
        Magasin magasin = new ChargeurMagasin("musicbrainzSimple/").chargerMagasin();
        CDComparatorNbPiste comparator = new CDComparatorNbPiste();
        magasin.trier(comparator);
        assertTrue(comparator.compare(magasin.getCd(0), magasin.getCd(magasin.getNombreCds()-1))< 0);

    }
}
