import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
    static Parking parking = new Parking();
    static Car car = new Car();
    private static final List<Boolean> parkingPlaces = parking.getParkingPlaces();
    private static final Set<Car> cars = new HashSet<>();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        for (Car c : cars) {
            c.onTheRoad();
        }

        for (Boolean p: parkingPlaces) {
            System.out.println(p);
        }

        Random random = new Random();
        Car car = new Car();
        LocalDateTime monthLater = LocalDateTime.now().plusDays(30);

        while (monthLater.isAfter(LocalDateTime.now())) {
            monthLater = monthLater.minusMinutes(5);
            int chanceToParking = random.nextInt(100) + 1;
            int chanceToRoad = random.nextInt(100) + 1;

            if (chanceToParking <= 30 && parkingPlaces.size() <= 30) {
                parkingPlaces.remove(0);
                parkingPlaces.add(0, true);
                car.toTheParking();
            }
        }
    }

}