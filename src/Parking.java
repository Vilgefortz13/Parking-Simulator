import java.util.ArrayList;
import java.util.List;

public class Parking {
    private final List<Integer> carsCount = new ArrayList<>();
    private final List<Boolean> parkingSpaces = new ArrayList<>();

    public List<Integer> getCarsCount() {
        return carsCount;
    }

    public List<Boolean> getParkingSpaces() {
        return parkingSpaces;
    }
}
