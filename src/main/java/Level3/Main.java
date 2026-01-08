package Level3;

import Level2.Input;
import Level3.ConsoleUI.MenuUI;
import Level3.ReservationServices.ReservationServices;

public class Main {
    public static void main(String[] args) {
        int numberRows = Input.readInt("Please, enter the number of rows: ");
        int seatNumber = Input.readInt("Please, enter the number of seats: ");
        ReservationServices reservationServices = new ReservationServices(numberRows, seatNumber);
        MenuUI consoleUI = new MenuUI(reservationServices);
        consoleUI.showMenu();
    }
}
