package Level3.ConsoleUI;

import Level3.Models.Seat;
import Level3.ReservationServices.CustomExceptions.InvalidPersonNameException;
import Level3.ReservationServices.CustomExceptions.InvalidSeatException;
import Level3.ReservationServices.CustomExceptions.SeatAlreadyEmptyException;
import Level3.ReservationServices.CustomExceptions.SeatAlreadyTakenException;
import Level3.ReservationServices.ReservationServices;

import java.util.List;
import java.util.Map;

public class MenuUI {
    private final ReservationServices RESERVATION_SERVICES;
    private final Map<Integer, Runnable> MENU_RUNNABLE = Map.of(
            1, this::showAllReservations,
            2, this::showReservationsByPerson,
            3, this::reserveSeat,
            4, this::cancelReservation,
            5, this::cancelAllReservationsByPerson
    );

    private static final List<String> MENU_OPTIONS = List.of(
            "1. Show all reservations",
            "2. Show reservations by person",
            "3. Reserve a seat",
            "4. Cancel a reservation",
            "5. Cancel all reservations by person",
            "0. Exit"
    );


    public MenuUI(ReservationServices reservationServices) {
        this.RESERVATION_SERVICES = reservationServices;
    }

    public void showMenu() {
        while (true) {
            MENU_OPTIONS.forEach(System.out::println);
            int option = Input.readInt("Please, enter an option: ");
            if (option == 0) {
                return;
            }
            if (MENU_RUNNABLE.containsKey(option)) {
                MENU_RUNNABLE.get(option).run();
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    private void showAllReservations() {
        List<Seat> seatsReservedCopy = RESERVATION_SERVICES.getSeatsReserved();
        if (seatsReservedCopy.isEmpty()) System.out.println("There are no seats reserved.");
        seatsReservedCopy.forEach(System.out::println);
    }

    private void showReservationsByPerson() {
        try {
            String name = Input.readString("Please, enter your name: ");
            List<Seat> seatsReservedByPersonCopy = RESERVATION_SERVICES.showReservationsByPerson(name);
            if (seatsReservedByPersonCopy.isEmpty()) System.out.println("There are no seats reserved.");
            seatsReservedByPersonCopy.forEach(System.out::println);
        } catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }
    }

    private void reserveSeat() {
        try {
            int row = Input.readInt("Please, enter a row number: ");
            int seatNumber = Input.readInt("Please, enter a seat number: ");
            String name = Input.readString("Please, enter a name: ");
            RESERVATION_SERVICES.reserveSeat(row, seatNumber, name);
            System.out.println("the seat has been reserved.");
        } catch (InvalidSeatException | SeatAlreadyTakenException | InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }
    }

    private void cancelReservation() {
        try {
            int row = Input.readInt("Please, enter a row number: ");
            int seatNumber = Input.readInt("Please, enter a seat number: ");
            RESERVATION_SERVICES.cancelReservation(row, seatNumber);
            System.out.println("the seat has been cancelled.");
        } catch (SeatAlreadyEmptyException | InvalidSeatException e) {
            System.out.println(e.getMessage());
        }
    }

    private void cancelAllReservationsByPerson() {
        try {
            String name = Input.readString("Please, enter a name: ");
            RESERVATION_SERVICES.cancelAllReservationsByPerson(name);
            System.out.println("the seat has been cancelled.");
        } catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
