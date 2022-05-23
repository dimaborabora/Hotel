import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private  String name;
    private HashMap <Integer, Room> rooms = new HashMap<>();
    private ArrayList <ReservationInformation> reservationInformation = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hotel(String name) {
        this.name = name;
    }


    public ArrayList<ReservationInformation> getReservationInformation() {
        return reservationInformation;
    }

    public void addRoom (Room room){

        if (rooms.containsKey(room.getRoomNumber())){
            System.out.println("Такая комната уже существует.");
        }
        else {
            rooms.put(room.getRoomNumber(), room);
            System.out.println("Комната типа " + room.getType() + " под номером " + room.getRoomNumber() + " успешно добавлена.");
        }
    }

     public void addBooking (String clientName, int roomNumber, int days){

        if (!rooms.containsKey(roomNumber)){
            System.out.println("Неверный номер комнаты.");
        }
        else {
            boolean free = true;

            LocalDate today = LocalDate.now();
            LocalDate endBookingDate = LocalDate.now().plusDays(days);

            for (ReservationInformation information : reservationInformation) {

                if (information.getRoom().getRoomNumber() == roomNumber && !information.getReservationStartDate().isAfter(LocalDate.now().plusDays(days))) {
                    free = false;
                }
            }

            if (free){

                ReservationInformation bookingList = new ReservationInformation(rooms.get(roomNumber), clientName, LocalDate.now(), LocalDate.now().plusDays(days),
                        rooms.get(roomNumber).getPrice() * days);
                    getReservationInformation().add(bookingList);

                    System.out.println("В систему добавлено бронирование номера " + rooms.get(roomNumber).getType()
                             + ". Номер комнаты " + roomNumber + ".");

                }

                else {
                    System.out.println("Комната номер " + roomNumber + " занята в выбранные даты.");
                }

            }


        }


    public void addFeatureBooking (String clientName, int roomNumber, LocalDate reservationStartDate, int days){
        if ( (!rooms.containsKey(roomNumber))){
            System.out.println("Неверный номер комнаты.");
        }
        else {
            boolean free = true;

            for (ReservationInformation information : reservationInformation) {
                if (information.getRoom().getRoomNumber() == roomNumber && !information.getReservationStartDate().isAfter(reservationStartDate.plusDays(days))) {
                    free = false;
                }
            }
            if (free) {
                ReservationInformation bookingList = new ReservationInformation(rooms.get(roomNumber), clientName, reservationStartDate,
                        reservationStartDate.plusDays(days), rooms.get(roomNumber).getPrice() * days);
                reservationInformation.add(bookingList);

                System.out.println("В систему добавлено бронирование номера " + rooms.get(roomNumber).getType()
                        + ". Номер комнаты " + roomNumber + ".");

            }

            else {
                System.out.println("Комната номер " + roomNumber + " занята в данные даты.");
            }
        }

        }
    }



