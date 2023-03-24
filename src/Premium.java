public class Premium extends Kunde {
    // Variablen anlegen
    private int anzahlReisen;
    private String status;

   // Konstruktor
    public Premium(int kNr, String name, int anzahlReisen, String status){
        super(kNr, name);
        this.anzahlReisen = anzahlReisen;
        this.status = status;
    }


    // Setter
    public void setAnzahlReisen(int anzahlReisen) {
        this.anzahlReisen = anzahlReisen;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    // Getter
    public int getAnzahlReisen() {
        return anzahlReisen;
    }
    public String getStatus() {
        return status;
    }

    // Methode zum Reisepreis berechnen, abhängig von staus des Reisenden
    public double reisepreisBerechnen(double basispreis) {
        double endpreis = 0;
        if(status.equals("Gold")){
            endpreis = basispreis*0.8;
        } else if(status.equals("Silber")) {
            endpreis = basispreis * 0.9;
        } else if(status.equals("Bronze")) {
            endpreis = basispreis * 0.95;
        }
        return endpreis;
    }


}
