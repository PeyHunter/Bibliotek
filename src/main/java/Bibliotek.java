import java.time.format.DateTimeFormatter;

public class Bibliotek {

    private String   bibliotekNavn;
    private String   kommune;
    private String   adresse;
    private String   telefonNr;

    public Bibliotek() {}

    public Bibliotek(String bibNavn, String kom, String adr, String telNr) {
        bibliotekNavn = bibNavn;
        kommune = kom;
        adresse = adr;
        telefonNr = telNr;
    }



    //Facadeklase.
        // write arraylisterne ud


    public String getBibliotekNavn() {
        return bibliotekNavn;
    }

    public String getKommune() {
        return kommune;
    }

    public String getAdresse() {
        return adresse;
    }
    public String getTelefonNr() {
        return telefonNr;
    }

    @Override
    public String toString() {

        return "Bibliotek\n" +
                " - Navn: " + bibliotekNavn + "\n" +
                " - Kommune: " + kommune + "\n" +
                " - Adresse: " + adresse + "\n" +
                " - Telefon: " + telefonNr + "\n";

    }
}

