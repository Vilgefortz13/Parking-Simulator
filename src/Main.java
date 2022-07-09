import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Main {
    static Parking parking = new Parking();
    static Car car = new Car();
    private static final List<Boolean> parkingPlaces = parking.getParkingPlaces();
    private static final Set<Car> cars = parking.getCars();

    public static void main(String[] args) {
        LocalDateTime monthLater = LocalDateTime.now().plusDays(30);
        while (monthLater.isAfter(LocalDateTime.now())) {
            monthLater = monthLater.minusMinutes(5);
        }
    }

}