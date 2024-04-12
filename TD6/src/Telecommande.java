import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Telecommandable> appareils;

    public Telecommande() {
        appareils = new ArrayList<>();
    }

    public Telecommande(String nom) {
        appareils = new ArrayList<>();
        appareils.add(new Lampe(nom));
    }

    public void ajouterAppareil(Telecommandable appareil) {
        appareils.add(appareil);
    }


    public void activerAppareil(int indice) {
        appareils.get(indice).allumer();
    }
    public void desactiverAppareil(int indice) {
        appareils.get(indice).eteindre();
    }

    public void activerTout() {
        appareils.forEach(Telecommandable::allumer);
    }

    public Telecommandable[] getAppareilArray() {
        return appareils.toArray(new Telecommandable[0]);
    }
    public String toString() {
        StringBuilder r = new StringBuilder();
        for (Telecommandable app : appareils) {
            r.append(app).append('\n');
        }
        r.deleteCharAt(r.length()-1);
        return r.toString();
    }
}
