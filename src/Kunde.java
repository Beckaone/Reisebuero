public abstract class Kunde {
    // Variablen anlegen
    private int kNr;
    private String name;

    // Konstructor
    public Kunde(int kNr,String name){
        this.kNr = kNr;
        this.name = name;
    }

    // Setter
    public void setkNr(int KNr){
        this.kNr = kNr;
    }
    public void setName(String name){
        this.name = name;
    }
    // Getter
    public int getkNr(){
        return kNr;
    }
    public String getName(){
        return name;
    }

    // Abstrakte Methode definieren
    // MUSS in Unterklassen implementiert werden
    public abstract double reisepreisBerechnen(double basispreis);
}
