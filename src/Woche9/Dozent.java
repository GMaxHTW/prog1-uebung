package Woche9;

public class Dozent {
    private String name;
    private String email;

    // Konstruktor
    public Dozent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter und Setter für name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter und Setter für email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Methode zum Ausgeben der Dozentendaten
    public void printDozent() {
        System.out.println("Dozent: " + name + ", Email: " + email);
    }
}
