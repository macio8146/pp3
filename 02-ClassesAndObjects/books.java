public class books {
    //attributes
    String title;
    int numOfPages;
    String genre;

    //methods
    public void about()
    {
        System.out.println("Title: " + title + "\n" + "Genre: " + genre + "\n" + "Number of pages: " + numOfPages);
    }

    public static void main(String args[]){
        books book1 = new books();

        book1.title = "Harry Potter";
        book1.genre = "Fantasy";
        book1.numOfPages = 662;

        book1.about();
    }
}
