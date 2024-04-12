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

        t.ajouterAppareil(l1);

        assertEquals(l1.toString(), t.getAppareilArray()[0].toString());
    }

    /**
     * test de l'activation d'une lampe
     */
    @Test
    void activerLampe() {
        Telecommande t = new Telecommande("l1");

        assertFalse(((Lampe)t.getAppareilArray()[0]).getEtat());

        t.activerAppareil(0);

        assertTrue(((Lampe)t.getAppareilArray()[0]).getEtat());
    }

    /**
     * test de la desactivation d'une lampe
     */
    @Test
    void desactiverLampe() {
        Telecommande t = new Telecommande("l1");

        assertFalse(((Lampe)t.getAppareilArray()[0]).getEtat());

        t.activerAppareil(0);

        assertTrue(((Lampe)t.getAppareilArray()[0]).getEtat());

        t.desactiverAppareil(0);

        assertFalse(((Lampe)t.getAppareilArray()[0]).getEtat());
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
        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);
        t.ajouterAppareil(l3);

        for (Telecommandable l : t.getAppareilArray()) {
            assertFalse(((Lampe)l).getEtat());
        }

        t.activerTout();

        for (Telecommandable l : t.getAppareilArray()) {
            assertTrue(((Lampe)l).getEtat());
        }
    }

    @Test
    void Hifi() {

    }
}