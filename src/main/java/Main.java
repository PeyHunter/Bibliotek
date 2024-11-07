import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args)
    {

        //CREATE BIBLIOTEK
        Bibliotek bibliotek1 = new Bibliotek("Nørrebro Bibliotek", "Københavns Komunne", "Jagtvej 13, 2200", "11223344");
        System.out.println(bibliotek1);

        //CREATE LOCAL TIME
        LocalDate today = LocalDate.now();

        //CREATE BOG
        Bog bog = new Bog();
        bog.addBookToAuthor();


        //CREATE LAANER
        Laaner laaner = new Laaner();
        laaner.createLaaner();

        Laaner selectedLaaner = laaner.getLaanerId(1);


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");




        Udlaan udlaan1 = new Udlaan(today, selectedLaaner, 10023, 3 );
        System.out.println(udlaan1);






        // eksmemplar--a

    }
}