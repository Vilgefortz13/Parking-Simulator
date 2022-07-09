public enum State {
    IN_PARKING("in the parking") {
        @Override
        public void onTheRoad(Car car) throws Exception {
            Parking parking = new Parking();
            car.setStateObj(State.IN_WAY);
            System.out.println("The car pulled out of the parking lot");
            parking.getParkingPlaces().add(false);
        }

        @Override
        public void toTheParking(Car car) throws Exception {
            throw new Exception("The car is already in the parking lot.");
        }


    },

    IN_WAY("on the way") {
        @Override
        public void onTheRoad(Car car) throws Exception {
            throw new Exception("The car is already ot the road");
        }

        @Override
        public void toTheParking(Car car) throws Exception {
            Parking parking = new Parking();
            car.setStateObj(State.IN_PARKING);
            System.out.println("The car arrived at the parking lot");
            parking.getParkingPlaces().add(true);
        }
    };

    private String value;

    public String getValue() {
        return value;
    }

    State(String value) {
        this.value = value;
    }

    public abstract void onTheRoad(Car car) throws Exception;

    public abstract void toTheParking(Car car) throws Exception;
}
