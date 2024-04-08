import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LampeTest {

    /**
     * test allumer
     */
    @Test
    void allumer() {
        Lampe l = new Lampe("l");

        assertFalse(l.getEtat());

        l.allumer();

        assertTrue(l.getEtat());
    }

    /**
     * test eteindre
     */
    @Test
    void eteindre() {
        Lampe l = new Lampe("l");

        assertFalse(l.getEtat());

        l.allumer();

        assertTrue(l.getEtat());

        l.eteindre();

        assertFalse(l.getEtat());
    }
}