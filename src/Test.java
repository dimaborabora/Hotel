import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Hotel hilton = new Hotel("Double Tree By Hilton");
        Room seasideView = new Room(400, "SeaSide", 150);
        Room gardenView = new Room(300, "GardenView", 130);
        Room lux = new Room(800, "Lux", 490);

        hilton.addRoom(seasideView);
        hilton.addRoom(gardenView);
        hilton.addRoom(lux);
        System.out.println();

        hilton.addBooking("Petya", 800, 5);
        hilton.addBooking("Petya", 300, 5);
        hilton.addBooking("Petya", 400, 5);
        System.out.println();

        hilton.addFeatureBooking("Vasek", 800, LocalDate.of(2022, 5, 19), 3);
        hilton.addFeatureBooking("Vasek", 300, LocalDate.of(2022, 5, 12), 3);
        hilton.addFeatureBooking("Vasek", 400, LocalDate.of(2022, 5, 12), 3);


    }
}
