public class Laaner {

    private int     laanerNr;
    private int     telefonNr;
    private String  laanerNavn;
    private String  email;


    public Laaner(){}

    public Laaner(int lNr, String lNavn, int telNr, String eMail) {
        this.laanerNr = lNr;
        this.telefonNr = telNr;
        this.laanerNavn = lNavn;
        this.email = eMail;
    }

    public String getLaanerNavn() {
        return laanerNavn;
    }

    public int getTelefonNr() {
        return telefonNr;
    }

    public String getEmail() {
        return email;
    }

    public int getLaanerNr() {
        return laanerNr;
    }

    @Override
    public String toString() {

        return "Laaner\n" +
                " - Laaner Nr:" + laanerNr + "\n" +
                " - Laaner Navn " + laanerNavn + "\n" +
                " - Telefon Nr: " + telefonNr + "\n" +
                " - Email: " + email + "\n";
    }
}
