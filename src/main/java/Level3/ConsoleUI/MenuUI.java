package Level3.ConsoleUI;

import Level2.Input;
import Level3.ReservationServices.ReservationServices;

import java.util.List;

public class MenuUI {
    private static final List<String> MENUOPTIONS = List.of(
            "1. Show all reservations",
            "2. Show reservations by person",
            "3. Reserve a seat",
            "4. Cancel a reservation",
            "5. Cancel all reservations by person",
            "0. Exit"
    );


    public MenuUI(ReservationServices reservationServices) {

    }

    public void showMenu() {

        while (true) {
            MENUOPTIONS.forEach(System.out::println);
            int option = Input.readInt("Please, enter an option: ");
            switch (option) {
                case 1:
                    showAllReservations();
                    break;

                case 2:
                    showReservationsByPerson();
                    break;

                case 3:
                    reserveSeat();
                    break;

                case 4:
                    cancelReservation();
                    break;

                case 5:
                    cancelAllReservationsByPerson();
                    break;

                case 0:
                    exitApplication();
                    return;

                default:
                    showInvalidOptionMessage();
                    break;
            }
        }
    }
}
