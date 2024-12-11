package Woche9;

// Klasse Uebung (Erbt von Veranstaltung)
class Uebung extends Veranstaltung {

    // Konstruktor
    public Uebung(String name) {
        super(name, 20); // Setze die maximale Kapazität auf 20
    }

    // Überschreiben der print-Methode
    @Override
    public void print() {
        System.out.println("Typ der Veranstaltung: Übung");
        System.out.println("Veranstaltung: " + getName());
        if (getDozent() != null) {
            System.out.print("Dozent: ");
            getDozent().printDozent();
        } else {
            System.out.println("Dozent: Nicht zugewiesen");
        }
        System.out.println("Maximale Kapazität: " + getKapazitaet());
        System.out.println("---------------------------");
    }
}
