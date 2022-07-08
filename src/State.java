public enum State {
    IN_PARKING("in the parking") {

    },

    IN_WAY("on the way") {

    };

    private String value;

    public String getValue() {
        return value;
    }

    State(String value) {
        this.value = value;
    }
}
