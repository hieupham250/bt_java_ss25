package bai3;

public class Car {
    private String engine;
    private int seats;
    private String color;

    public Car(CarBuilder builder) {
        this.engine = builder.getEngine();
        this.seats = builder.getSeats();
        this.color = builder.getColor();
    }

    public void showDetails() {
        System.out.println("Chi tiết xe: Động cơ - " + engine + ", Số ghế - " + seats + ", Màu sắc - " + color);
    }
}
