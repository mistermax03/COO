import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TelecommandeTest {

    /**
     * test de l'ajout d'une lampe
     */
     @Test
     void ajouterLampe() {
        Lampe l1 = new Lampe("l1");
        Telecommande t = new Telecommande();

        t.ajouterLampe(l1);

        assertEquals(l1.toString(), t.getLampesArray()[0].toString());
    }

    /**
     * test de l'activation d'une lampe
     */
    @Test
    void activerLampe() {
        Telecommande t = new Telecommande("l1");

        assertFalse(t.getLampesArray()[0].getEtat());

        t.activerLampe(0);

        assertTrue(t.getLampesArray()[0].getEtat());
    }

    /**
     * test de la desactivation d'une lampe
     */
    @Test
    void desactiverLampe() {
        Telecommande t = new Telecommande("l1");

        assertFalse(t.getLampesArray()[0].getEtat());

        t.activerLampe(0);

        assertTrue(t.getLampesArray()[0].getEtat());

        t.desactiverLampe(0);

        assertFalse(t.getLampesArray()[0].getEtat());
    }

    /**
     * test de l'activation de toutes les lampes
     */
    @Test
    void activerTout() {
        Lampe l1 = new Lampe("l1");
        Lampe l2 = new Lampe("l2");
        Lampe l3 = new Lampe("l3");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.ajouterLampe(l3);

        for (Lampe l : t.getLampesArray()) {
            assertFalse(l.getEtat());
        }

        t.activerTout();

        for (Lampe l : t.getLampesArray()) {
            assertTrue(l.getEtat());
        }

    }
}