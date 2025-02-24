import java.util.*;

class Hotel {
    String roomNumber;
    boolean isAvailable = true;

    Hotel(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}

public class HotelBooking {
    public static void main(String[] args) {
        List<Hotel> rooms = new ArrayList<>();
        rooms.add(new Hotel("101"));
        rooms.add(new Hotel("102"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Available Rooms:");
        for (Hotel r : rooms) {
            if (r.isAvailable) System.out.println(r.roomNumber);
        }

        System.out.print("Enter room number to book: ");
        String roomNumber = sc.nextLine();
        for (Hotel r : rooms) {
            if (r.roomNumber.equals(roomNumber) && r.isAvailable) {
                r.isAvailable = false;
                System.out.println("Room booked: " + r.roomNumber);
                break;
            }
        }
        sc.close();
    }
}
