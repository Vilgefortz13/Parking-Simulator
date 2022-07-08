import java.util.ArrayList;
import java.util.List;

public class Parking {
    private final List<Car> cars = new ArrayList<>();
    private final List<Boolean> parkingSpaces = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public List<Boolean> getParkingSpaces() {
        return parkingSpaces;
    }
}
