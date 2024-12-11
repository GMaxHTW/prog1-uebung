package Woche9;


public class HochschuleTest {
    public static void main(String[] args) {
        // 1. Erzeugen von zwei Student-Objekten und Testen der Methoden
        Student student1 = new Student("Max", "Mustermann", 123456, "Informatik");
        student1.setSemester(3);
        student1.setEmail("max.mustermann@hochschule.de");

        Student student2 = new Student("Anna", "Müller", 234567, "Betriebswirtschaft");
        student2.setSemester(2);
        student2.setEmail("anna.mueller@hochschule.de");

        // Testen der printStudent()-Methode
        student1.printStudent();
        student2.printStudent();

        // 2. Erstellen eines Arrays von 6 Student-Objekten
        Student[] studentArray = new Student[6];
        studentArray[0] = new Student("Lukas", "Schmidt", 345678, "Maschinenbau");
        studentArray[1] = new Student("Sophie", "Meier", 456789, "Elektrotechnik");
        studentArray[2] = new Student("Leon", "Fischer", 567890, "Physik");
        studentArray[3] = new Student("Marie", "Weber", 678901, "Chemie");
        studentArray[4] = new Student("Jonas", "Wagner", 789012, "Biologie");
        studentArray[5] = new Student("Laura", "Becker", 890123, "Mathematik");

        // Setzen zusätzlicher Attribute für einige Studenten
        studentArray[0].setSemester(4);
        studentArray[1].setSemester(1);
        studentArray[2].setSemester(5);
        studentArray[3].setSemester(2);
        studentArray[4].setSemester(3);
        studentArray[5].setSemester(1);

        // Ausgabe aller Studenten im Array
        System.out.println("Ausgabe des Student-Arrays:");
        for (Student s : studentArray) {
            s.printStudent();
        }

        // 3. Erstellen und Testen der Klasse Seminar
        Seminar seminar = new Seminar(3, "Java Programmierung");
        Dozent dozent1 = new Dozent("Prof. Dr. Schmidt", "schmidt@hochschule.de");
        seminar.setLecturer(dozent1);

        // Hinzufügen von Teilnehmern zum Seminar
        seminar.addParticipant(student1);
        seminar.addParticipant(student2);
        seminar.addParticipant(studentArray[0]);
        // Versuch, einen vierten Teilnehmer hinzuzufügen (überschreitet die Kapazität)
        seminar.addParticipant(studentArray[1]);

        // Ausgabe der Seminarinformationen
        seminar.printSeminar();

        // 4. Erstellen und Testen der Klasse Veranstaltung
        Veranstaltung veranstaltung = new Veranstaltung("Datenbanken");
        Dozent dozent2 = new Dozent("Dr. Anna Becker", "anna.becker@hochschule.de");
        veranstaltung.setDozent(dozent2);

        // Belegen der Veranstaltung mit mindestens 3 Studenten
        veranstaltung.belege(student1);
        veranstaltung.belege(student2);
        veranstaltung.belege(studentArray[1]);

        // Ausgabe der Veranstaltungsinformationen
        veranstaltung.print();

        // 5. Erstellen und Testen der Klasse Uebung
        Uebung uebung = new Uebung("Algorithmen und Datenstrukturen");
        Dozent dozent3 = new Dozent("Prof. Dr. Weber", "weber@hochschule.de");
        uebung.setDozent(dozent3);

        // a. Kapazität der Veranstaltung anzeigen
        System.out.println("Kapazität der Übung: " + uebung.getKapazitaet());

        // b. Testen der print()-Methode
        uebung.print();

        // c. Erstellen von 3 Studenten und Belegen der Übung
        Student student3 = new Student("Tim", "Hoffmann", 901234, "Informatik");
        student3.setSemester(2);
        Student student4 = new Student("Emma", "Klein", 112345, "Mathematik");
        student4.setSemester(1);
        Student student5 = new Student("Felix", "Schneider", 223456, "Physik");
        student5.setSemester(4);

        uebung.belege(student3);
        uebung.belege(student4);
        uebung.belege(student5);

        // Ausgabe der Übungsinformationen
        uebung.print();
    }
}
