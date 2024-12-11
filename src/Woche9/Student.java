package Woche9;

public class Student {
    private String firstName;
    private String lastName;
    private int immaNr;
    private String degreeProgram;
    private int semester;
    private String email; // Zusätzliches Attribut

    // Konstruktor
    public Student(String firstName, String lastName, int immaNr, String degreeProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.immaNr = immaNr;
        this.degreeProgram = degreeProgram;
        this.semester = 1; // Standardwert
        this.email = ""; // Standardwert
    }

    // Getter und Setter für firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter und Setter für lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter und Setter für immaNr
    public int getImmaNr() {
        return immaNr;
    }

    public void setImmaNr(int immaNr) {
        this.immaNr = immaNr;
    }

    // Getter und Setter für degreeProgram
    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    // Getter und Setter für semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter und Setter für email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Methode zum Ausgeben der Studentendaten
    public void printStudent() {
        System.out.println("Studenteninformationen:");
        System.out.println("Vorname: " + firstName);
        System.out.println("Nachname: " + lastName);
        System.out.println("Matrikelnummer: " + immaNr);
        System.out.println("Studiengang: " + degreeProgram);
        System.out.println("Semester: " + semester);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }
}
