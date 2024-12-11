package Woche9;


// Aktualisierte Klasse Veranstaltung mit zusätzlichem Konstruktor
public class Veranstaltung {
    private String name;
    private Dozent dozent;
    private Student[] teilnehmer;
    private int maxKapazitaet;
    private int currentTeilnehmer;

    // Standardkonstruktor mit Kapazität 40
    public Veranstaltung(String name) {
        this(name, 40);
    }

    // Zusätzlicher Konstruktor zur Festlegung der Kapazität
    public Veranstaltung(String name, int maxKapazitaet) {
        this.name = name;
        this.maxKapazitaet = maxKapazitaet;
        this.teilnehmer = new Student[maxKapazitaet];
        this.currentTeilnehmer = 0;
    }

    // Rest der Klasse bleibt gleich...
    // Getter und Setter für name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter und Setter für dozent
    public Dozent getDozent() {
        return dozent;
    }

    public void setDozent(Dozent dozent) {
        this.dozent = dozent;
    }

    // Getter und Setter für teilnehmer
    public Student[] getTeilnehmer() {
        return teilnehmer;
    }

    public void setTeilnehmer(Student[] teilnehmer) {
        if (teilnehmer.length <= maxKapazitaet) {
            this.teilnehmer = teilnehmer;
            this.currentTeilnehmer = teilnehmer.length;
        } else {
            System.out.println("Die Anzahl der Teilnehmer überschreitet die maximale Kapazität.");
        }
    }

    // Methode zur Rückgabe der Kapazität
    public int getKapazitaet() {
        return maxKapazitaet;
    }

    // Methode zum Belegen der Veranstaltung
    public boolean belege(Student student) {
        if (currentTeilnehmer < maxKapazitaet) {
            teilnehmer[currentTeilnehmer] = student;
            currentTeilnehmer++;
            return true;
        } else {
            System.out.println("Veranstaltung ist voll. Student kann nicht belegt werden.");
            return false;
        }
    }

    // Methode zum Ausgeben der Veranstaltungsinformationen
    public void print() {
        System.out.println("Veranstaltung: " + name);
        if (dozent != null) {
            System.out.print("Dozent: ");
            dozent.printDozent();
        } else {
            System.out.println("Dozent: Nicht zugewiesen");
        }
        System.out.println("---------------------------");
    }
}
