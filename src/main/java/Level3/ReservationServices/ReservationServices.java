package Level3.ReservationServices;

import Level3.Models.Seat;
import Level3.ReservationServices.CustomExceptions.InvalidSeatException;
import Level3.ReservationServices.CustomExceptions.SeatAlreadyEmptyException;
import Level3.ReservationServices.CustomExceptions.SeatAlreadyTakenException;

import java.util.ArrayList;
import java.util.List;

public class ReservationServices {
    private final int totalRows;
    private final int seatsPerRows;
    private final List<Seat> seatReserved = new ArrayList<>();

    public ReservationServices(int numberRows, int seatsPerRows) {
        this.totalRows = numberRows;
        this.seatsPerRows = seatsPerRows;
    }

    private void validateSeatPosition(int row, int seatNumber) throws InvalidSeatException {
        if (row < 1 || row > totalRows || seatNumber < 1 || seatNumber > seatsPerRows) {
            throw new InvalidSeatException();
        }
    }

    public void reserveSeat(int row, int seatNumber, String name) throws InvalidSeatException, SeatAlreadyTakenException {
        validateSeatPosition(row, seatNumber);
        Seat chosenSeat = new Seat(row, seatNumber, name);
        if (seatReserved.contains(chosenSeat)) {
            throw new SeatAlreadyTakenException();
        }
        seatReserved.add(chosenSeat);
    }
}
