package Woche9;

public class Seminar {
    private String name;
    private Dozent lecturer;
    private Student[] participants;
    private int maxParticipants;
    private int currentParticipants;

    // Konstruktor
    public Seminar(int maxParticipants, String name) {
        this.maxParticipants = maxParticipants;
        this.name = name;
        this.participants = new Student[maxParticipants];
        this.currentParticipants = 0;
    }

    // Getter und Setter für name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter und Setter für lecturer
    public Dozent getLecturer() {
        return lecturer;
    }

    public void setLecturer(Dozent lecturer) {
        this.lecturer = lecturer;
    }

    // Getter und Setter für participants
    public Student[] getParticipants() {
        return participants;
    }

    public void setParticipants(Student[] participants) {
        if (participants.length <= maxParticipants) {
            this.participants = participants;
            this.currentParticipants = participants.length;
        } else {
            System.out.println("Die Anzahl der Teilnehmer überschreitet die maximale Kapazität.");
        }
    }

    // Methode zum Hinzufügen eines Teilnehmers
    public boolean addParticipant(Student student) {
        if (currentParticipants < maxParticipants) {
            participants[currentParticipants] = student;
            currentParticipants++;
            return true;
        } else {
            System.out.println("Seminar ist voll. Teilnehmer kann nicht hinzugefügt werden.");
            return false;
        }
    }

    // Methode zum Ausgeben der Seminarinformationen
    public void printSeminar() {
        System.out.println("Seminarname: " + name);
        if (lecturer != null) {
            System.out.print("Dozent: ");
            lecturer.printDozent();
        } else {
            System.out.println("Dozent: Nicht zugewiesen");
        }
        System.out.println("Teilnehmer (" + currentParticipants + "/" + maxParticipants + "):");
        for (int i = 0; i < currentParticipants; i++) {
            System.out.println((i + 1) + ". " + participants[i].getFirstName() + " " + participants[i].getLastName());
        }
        System.out.println("---------------------------");
    }
}
