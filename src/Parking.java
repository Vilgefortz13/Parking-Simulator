import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Parking {
    private Set<Car> cars;
    private final List<Boolean> parkingSpaces = new ArrayList<>();

    public Set<Car> getCars() {
        return cars;
    }

    public List<Boolean> getParkingSpaces() {
        return parkingSpaces;
    }
}
