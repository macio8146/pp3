public class Room {
    
    // attributes

    int roomNumber, beds;
    boolean occupied;
    String guestName;

    // constructors

    Room(int number)
    {
        this.roomNumber = number;
        beds = 2;
    }

    Room(int number, int beds)
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

    public void displayStatus()
    {
        System.out.print("Room number: " + roomNumber + ", ");
        System.out.print("Number of beds: " + beds + ", ");
        System.out.print("Occupied: " + occupied + ", ");
        System.out.println("Guest name: " + guestName);
    }
    

    // displaying rooms report
    public static void displayRoomsReport(Room[] rooms){
        for (int i = 0; i < rooms.length; i++){
            rooms[i].displayStatus();
        }
        System.out.println("");
    }

    //diplaying report with given number of beds
    public static void displayRoomsReportSpecifiedBeds(Room[] rooms, int beds){
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].beds == beds){
                rooms[i].displayStatus();
            }
        }
    }

    // displaying number of vacant and occupied rooms
    public static void displayRoomsVacantOccupied(Room[] rooms){
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
    public static void reportVacantBeds(Room[] rooms){
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

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4, 3);
        Room r5 = new Room(5, 3);
        Room r6 = new Room(6, 1);

        Room[] rooms = {r1, r2, r3, r4, r5, r6};

        // a
        rooms[0].displayStatus();
        System.out.println();

        // b
        displayRoomsReport(rooms);

        //c
        displayRoomsReportSpecifiedBeds(rooms, 2);

        //d
        r1.checkin("Maciej Jastrzębski and Ania Stós");
        r2.checkin("Ania Stós");
        displayRoomsVacantOccupied(rooms);
        displayRoomsReport(rooms);

        //e
        reportVacantBeds(rooms);
    }
}
