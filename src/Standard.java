public class Standard extends Kunde{
    // Variablen anlegenen
    private String vorname;

    // Konstruktor
    public Standard (int kNr, String name, String vorname){
        super(kNr, name);
        this.vorname = vorname;
    }


    // Setter
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    // Getter
    public String getVorname() {
        return vorname;
    }

    // Methode zum Reisepreis berechnen
    public double reisepreisBerechnen(double basispreis) {
        return basispreis;
    }
}
