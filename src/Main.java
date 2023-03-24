public class Main {
    public static void main(String[] args) {

        // Objekt Premiumkunde erstellen
        Premium p = new Premium(5,"Becker",5,"Silber");
        // Ausgabe Premiumkunde
        System.out.println("Premiumkunde\n------------\nKundennummer:\t"+p.getkNr()+"\nName:\t\t\t"+p.getName()+"\nAnzahl Reisen:\t"+p.getAnzahlReisen()+"\nStatus:\t\t\t"+p.getStatus()+"\nEndpreis:\t\t"+ p.reisepreisBerechnen(5000));

//        // Objekt Standardkunde erstellen
//        Standard s = new Standard(3,"Wegner","Friedemann");
//        // Ausgabe Standardkunde
//        System.out.println(s.getkNr());
//        System.out.println(s.getName());
//        System.out.println(s.getVorname());
//        System.out.println(s.reisepreisBerechnen(5000));
    }
}