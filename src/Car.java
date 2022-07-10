import java.time.LocalDate;
import java.util.Random;

public class Car {
    private Integer plateNumber = new Random().nextInt(1000, 10000);
    private String state;
    private LocalDate date;
    private LocalDate time;
    private State stateObj;

    public Integer getPlateNumber() {
        return plateNumber;
    }

    public String getState() {
        return state;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getTime() {
        return time;
    }

    public State getStateObj() {
        return stateObj;
    }

    public void setPlateNumber(Integer plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setStateObj(State stateObj) {
        this.stateObj = stateObj;
    }

    public void onTheRoad() {
        try {
            this.stateObj.onTheRoad(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void toTheParking() {
        try {
            this.stateObj.toTheParking(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
