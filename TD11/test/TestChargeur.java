package test;


import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;


public class TestChargeur {

    @Test
    public void testChargeurMagasinExistant() throws FileNotFoundException {
        Magasin m = new ChargeurMagasin("musicbrainzSimple/").chargerMagasin();

        org.junit.jupiter.api.Assertions.assertEquals(m.getNombreCds(), 12);
    }

    @Test
    public void testChargeurMagasinNonxistant()  {
        try {
            Magasin m = new ChargeurMagasin("je bzif _àz uomz ").chargerMagasin();
            org.junit.jupiter.api.Assertions.assertTrue(false);
        } catch (FileNotFoundException e) {
            org.junit.jupiter.api.Assertions.assertTrue(true);
        }
    }

}
