public class ReservasiHotel
{
    public static class Room
    {
        private int roomNumber;
        private String roomType;
        private boolean occupied;
        private double rate;
    
        public Room()
        {
            this.roomNumber = 0;
            this.roomType = "Standard";
            this.occupied = false;
            this.rate = 100.0;
            System.out.println("Default constructor for Room is called");
        }
    
        public Room(int roomNumber, String roomType)
        {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.occupied = false;
            if (roomType.equals("Standard"))
            {
                this.rate = 100.0;
            } 
            else if (roomType.equals("Deluxe"))
            {
                this.rate = 200.0;
            }
            System.out.println("Constructor for Room with roomNumber " + roomNumber + " and roomType " + roomType + " is called");
        }
    
        public Room(int roomNumber, String roomType, boolean occupied, double rate)
        {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.occupied = occupied;
            this.rate = rate;
            System.out.println("Custom constructor for Room with roomNumber " + roomNumber + ", roomType " + roomType + ", occupied " + occupied + ", and rate " + rate + " is called");
        }
    
        public int getRoomNumber()
        {
            return roomNumber;
        }
        public String getRoomType()
        {
            return roomType;
        }
        public boolean isOccupied()
        {
            return occupied;
        }
        public void setOccupied(boolean occupied)
        {
            this.occupied = occupied;
        }
        public double getRate()
        {
            return rate;
        }
    }
    
    public static class Hotel
    {
        private String name;
        private Room[] rooms;
    
        public Hotel(String name, int numberOfRooms)
        {
            this.name = name;
            this.rooms = new Room[numberOfRooms];
            for (int i = 0; i < numberOfRooms; i++)
            {
                rooms[i] = new Room(i + 1, "Standard");
            }
            System.out.println("Hotel constructor with name " + name + " and numberOfRooms " + numberOfRooms + " is called");
        }
    
        public Hotel(String name, int numberOfStandardRooms, int numberOfDeluxeRooms)
        {
            this.name = name;
            int totalRooms = numberOfStandardRooms + numberOfDeluxeRooms;
            this.rooms = new Room[totalRooms];
            for (int i = 0; i < totalRooms; i++)
            {
                if (i < numberOfStandardRooms)
                {
                    rooms[i] = new Room(i + 1, "Standard");
                }
                else
                {
                    rooms[i] = new Room(i + 1, "Deluxe");
                }
            }
            System.out.println("Hotel constructor with name " + name + ", numberOfStandardRooms " + numberOfStandardRooms + ", and numberOfDeluxeRooms " + numberOfDeluxeRooms + " is called");
        }
    }
    
    public static class Reservation
    {
        private Room reservedRoom;
        private String guestName;
        private int numberOfNights;
        private double totalCharge;
    
        public Reservation(Room reservedRoom, String guestName, int numberOfNights)
        {
            this.reservedRoom = reservedRoom;
            this.guestName = guestName;
            this.numberOfNights = numberOfNights;
            this.totalCharge = reservedRoom.getRate() * numberOfNights;
            System.out.println("Reservation constructor is called for guest " + guestName + ", roomNumber " + reservedRoom.getRoomNumber() + ", roomType " + reservedRoom.getRoomType() + ", numberOfNights " + numberOfNights);
        }
    
        public Room getReservedRoom()
        {
            return reservedRoom;
        }
        public String getGuestName()
        {
            return guestName;
        }
        public int getNumberOfNights()
        {
            return numberOfNights;
        }
        public double getTotalCharge()
        {
            return totalCharge;
        }
    }
    
    public static void main(String[] args)
    {
        Hotel hotel1 = new Hotel("Hotel A", 5);
        Hotel hotel2 = new Hotel("Hotel B", 3, 2);
        Room reservedRoom = hotel1.rooms[0];
        Reservation reservation = new Reservation(reservedRoom, "John Doe", 3);
    
        System.out.println("Reservation for " + reservation.getGuestName() + ":\nRoom Number: " + reservation.getReservedRoom().getRoomNumber() +
                "\nRoom Type: " + reservation.getReservedRoom().getRoomType() + "\nNumber of Nights: " + reservation.getNumberOfNights() +
                "\nTotal Charge: $" + reservation.getTotalCharge());
    }
}
