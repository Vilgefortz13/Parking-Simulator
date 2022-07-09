import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Parking {
    private Set<Car> cars;
    private final List<Boolean> parkingPlaces = new ArrayList<Boolean>();

    public Set<Car> getCars() {
        return cars;
    }

    public List<Boolean> getParkingPlaces() {
        return parkingPlaces;
    }


}
