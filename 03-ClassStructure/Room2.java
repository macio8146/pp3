

// The same program as Room.java,  
// but replaced displayStatus() with toString() method


public class Room2 {
    
    // attributes

    int roomNumber, beds;
    boolean occupied;
    String guestName;

    // constructors

    Room2(int number)
    {
        this.roomNumber = number;
        beds = 2;
    }

    Room2(int number, int beds)
    {
        roomNumber = number;
        this.beds = beds;
    }

    // methods

    public void checkin(String guestName)
    {
        if(isOccupied() == false){
            this.guestName = guestName;
            this.occupied = true;
        } else {
            System.out.println("Ten pokój jest już zajęty!");
        }
    }

    public void checkout()
    {
        guestName = null;
        occupied = false;
    }

    public boolean isOccupied()
    {
        return this.occupied;
    }

    // public void toString()
    // {
    //     System.out.print("Room2 number: " + roomNumber + ", ");
    //     System.out.print("Number of beds: " + beds + ", ");
    //     System.out.print("Occupied: " + occupied + ", ");
    //     System.out.println("Guest name: " + guestName);
    // }

    public String toString(){
        return "Room number: "+ roomNumber + ", Beds: " + beds + ", Occupied: " + occupied + ", Guest name: " + guestName + " ";
    }

    // displaying rooms report
    public static void displayRoomsReport(Room2[] rooms){
        for (int i = 0; i < rooms.length; i++){
            System.out.println(rooms[i].toString());
        }
        System.out.println("");
    }

    //diplaying report with given number of beds
    public static void displayRoomsReportSpecifiedBeds(Room2[] rooms, int beds){
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].beds == beds){
                System.out.println(rooms[i].toString());
            }
        }
    }

    // displaying number of vacant and occupied rooms
    public static void displayRoomsVacantOccupied(Room2[] rooms){
        int vacantRooms = 0;
        int occupiedRooms = 0;

        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].isOccupied() == true){
                occupiedRooms++;
            } else {
                vacantRooms++;
            }
        }
        System.out.println("Vacant rooms: " + vacantRooms);
        System.out.println("Occupied rooms: " + occupiedRooms);
    }

    // displaying number of vacant beds
    public static void reportVacantBeds(Room2[] rooms){
        int vacantBeds = 0;

        for(int i = 0; i < rooms.length; i++){
            if(!rooms[i].isOccupied()){
                vacantBeds += rooms[i].beds;
            }
        }
        System.out.println("Vacant beds: " + vacantBeds);
    }

    public static void main(String[] args){
        System.out.println();

        Room2 r1 = new Room2(1);
        Room2 r2 = new Room2(2);
        Room2 r3 = new Room2(3);
        Room2 r4 = new Room2(4, 3);
        Room2 r5 = new Room2(5, 3);
        Room2 r6 = new Room2(6, 1);

        Room2[] rooms = {r1, r2, r3, r4, r5, r6};

        // a
        System.out.println(rooms[0].toString());
        System.out.println();

        // b
        displayRoomsReport(rooms);

        //c
        displayRoomsReportSpecifiedBeds(rooms, 3);

        //d
        r1.checkin("Maciej Jastrzębski");
        displayRoomsVacantOccupied(rooms);

        //e
        reportVacantBeds(rooms);

        System.out.println(r1);
    }
}
