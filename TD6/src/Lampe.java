public class Lampe {
    private String nom;
    private boolean allume;

    public Lampe(String nom) {
        this.nom = nom;
    }

    public void allumer() {
        allume = true;
    }
    public void eteindre() {
        allume = false;
    }

    @Override
    public String toString() {
        return nom + " " + (allume?"on":"off");
    }
}
