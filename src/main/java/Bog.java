import java.util.ArrayList;

public class Bog {

    private String      titel;
    private String      genre;
    private int         antalEksemplar;
    private int         aarstal;
    private Forfatter   forfatter;

    public ArrayList<Bog> bogList= new ArrayList<>();

    public Bog () {}

    public Bog(String titel, String genre, int antEks, int aarstal, Forfatter ffatter) {
        this.titel = titel;
        this.genre = genre;
        this.antalEksemplar = antEks;
        this.aarstal = aarstal;
        this.forfatter = ffatter;
    }




    public void addBookToAuthor(){

        Forfatter fitzgerald = new Forfatter("F. Scott Fitzgerald", "Scribner", "American", 1, 1940);
        Forfatter lee = new Forfatter("Harper Lee", "J.B. Lippincott & Co.", "American", 1926, 2016);
        Forfatter orwell = new Forfatter("George Orwell", "Secker & Warburg", "British", 1903, 1950);
        Forfatter austen = new Forfatter("Jane Austen", "T. Egerton", "British", 1775, 1817);
        Forfatter melville = new Forfatter("Herman Melville", "Harper & Brothers", "American", 1819, 1891);
        Forfatter tolstoy = new Forfatter("Leo Tolstoy", "The Russian Messenger", "Russian", 1828, 1910);
        Forfatter shakespeare = new Forfatter("William Shakespeare", "N/A", "British", 1564, 1616);
        Forfatter salinger = new Forfatter("J.D. Salinger", "Little, Brown and Company", "American", 1919, 2010);
        Forfatter tolkien = new Forfatter("J.R.R. Tolkien", "George Allen & Unwin", "British", 1892, 1973);
        Forfatter homer = new Forfatter("Homer", "N/A", "Ancient Greek", -800, -701);

        bogList.add(new Bog("The Great Gatsby", "Fiction", 3, 1925, fitzgerald));
        bogList.add(new Bog("To Kill a Mockingbird", "Fiction", 5, 1960, lee));
        bogList.add(new Bog("1984", "Dystopian", 4, 1949, orwell));
        bogList.add(new Bog("Pride and Prejudice", "Romance", 2, 1813, austen));
        bogList.add(new Bog("Moby-Dick", "Adventure", 3, 1851, melville));
        bogList.add(new Bog("War and Peace", "Historical", 1, 1869, tolstoy));
        bogList.add(new Bog("Hamlet", "Tragedy", 2, 1601, shakespeare));
        bogList.add(new Bog("The Catcher in the Rye", "Fiction", 4, 1951, salinger));
        bogList.add(new Bog("The Hobbit", "Fantasy", 6, 1937, tolkien));
        bogList.add(new Bog("The Odyssey", "Epic", 2, -800, homer));

        for(int i = 0; i < bogList.size(); i++){
            System.out.println(bogList.get(i));
        }
    }
    public ArrayList<Bog> getBogList(){
        return bogList;
    }

    public String getTitel()
    {
        return titel;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getAntal()
    {
        return antalEksemplar;
    }

    public int getAarstal()
    {
        return aarstal;
    }


    @Override
    public String toString() {
        return"Bog: \n" +
                " - Titel: " + titel + "\n"  +
                " - Genre: " + genre +"\n" +
                " - Antal Eksemplar: " + antalEksemplar + "\n" +
                " - Aarstal: " + aarstal + "\n \n" +
                " Forfatter: \n " + forfatter + "\n";

    }

}
