public class CinemaTicket {

    // attributes
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    double price;

    //methods

    public void data()
    {
        System.out.println("Cinema name: " + cinemaName);
        System.out.println("Film Title: " + filmTitle);
        System.out.println("Row: " + row);
        System.out.println("Seat: " + seat);
        System.out.println("Price: " + price);
    }

    CinemaTicket(String filmTitle,int r, int s)
    {
        this.filmTitle = filmTitle;
        row = r;
        seat = s;

        if(row == 1 || row == 2){
            price = 10;
        } else {
            price = 25;
        }
    }
    

    public static void main(String args[]){
        cinemaName = "aaa";
        
        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 5);
        CinemaTicket t2 = new CinemaTicket("Gladiator", 5, 10);

        t1.data();
        t2.data();
    }
}
