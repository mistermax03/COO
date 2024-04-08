import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Telecommandable> lampes;

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

    public void ajouterHifi(Hifi hifi) {
        lampes.add(hifi);
    }

    public void activerLampe(int indiceLampe) {
        lampes.get(indiceLampe).allumer();
    }
    public void desactiverLampe(int indiceLampe) {
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        lampes.forEach(Telecommandable::allumer);
    }

    public Telecommandable[] getLampesArray() {
        return lampes.toArray(new Telecommandable[0]);
    }
    public String toString() {
        StringBuilder r = new StringBuilder();
        for (Telecommandable lampe : lampes) {
            r.append(lampe).append('\n');
        }
        r.deleteCharAt(r.length()-1);
        return r.toString();
    }
}
