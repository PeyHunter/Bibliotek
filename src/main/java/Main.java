

public class Main {


    public static void main(String[] args)
    {



        Bibliotek bibliotek = new Bibliotek("Nørrebro Bibliotek", "Københavns Komunne", "Jagtvej 13, 2200", "11223344");
        System.out.println(bibliotek);


        Bog bog = new Bog();
        bog.addBookToAuthor();


        Laaner laaner = new Laaner(1, "Thomas", 22113344, "Thomashansen@gmail.com");
        
        System.out.println(laaner);
    }
}