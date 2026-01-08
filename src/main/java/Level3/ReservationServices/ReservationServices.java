package Level3.ReservationServices;

import Level3.Models.Seat;
import Level3.ReservationServices.CustomExceptions.InvalidSeatException;

import java.util.ArrayList;
import java.util.List;

public class ReservationServices {
    private int totalRows;
    private int seatsPerRows;
    private List<Seat> seats = new ArrayList<>();

    public ReservationServices(int numberRows, int numberSeats) {
        this.totalRows = numberRows;
        this.seatsPerRows = numberSeats;
    }

    private void validateSeatPosition(int row, int seat) throws InvalidSeatException {
        if (row < 1 || row > totalRows || seat < 1 || seat > seatsPerRows) {
            throw new InvalidSeatException();
        }
    }

    public void reserveSeat(int row, int numberSeat, String namePerson) {

    }
}
