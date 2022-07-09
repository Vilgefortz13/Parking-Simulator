import java.util.List;
import java.util.Set;

public class Main {
    static Parking parking = new Parking();
    static Car car = new Car();
    private static final List<Boolean> parkingPlaces = parking.getParkingPlaces();
    private static final Set<Car> cars = parking.getCars();
    public static void main(String[] args) {

    }
}