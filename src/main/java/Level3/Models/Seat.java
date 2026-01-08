package Level3.Models;

import java.util.Objects;

public record Seat(int row, int seatNumber, String name) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat seat1)) return false;
        return row == seat1.row && seatNumber == seat1.seatNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, seatNumber);
    }
}