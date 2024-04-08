import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public Telecommande() {
        lampes = new ArrayList<>();
    }

    public Telecommande(String nom) {
        lampes = new ArrayList<>();
        lampes.add(new Lampe(nom));
    }
    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        lampes.get(indiceLampe).allumer();
    }
    public void desactiverLampe(int indiceLampe) {
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        lampes.forEach(Lampe::allumer);
    }

    public Lampe[] getLampesArray() {
        return lampes.toArray(new Lampe[0]);
    }
    public String toString() {
        StringBuilder r = new StringBuilder();
        for (Lampe lampe : lampes) {
            r.append(lampe).append('\n');
        }
        return r.toString();
    }
}
