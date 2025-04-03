package bai3;

public class CarBuilder {
    private String engine;
    private int seats;
    private String color;

    // Setter methods
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    // Getter methods
    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    // Phương thức build() để tạo đối tượng Car
    public Car build() {
        return new Car(this);
    }
}
