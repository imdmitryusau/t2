public class Car {
    String id;
    String color;
    String brand;
    double engine_capacity;
    int quantity;

    public Car(String id, String color, String brand,
               double engine_capacity, int quantity) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.engine_capacity = engine_capacity;
        this.quantity = quantity;
    }
    public void Selling_the_car(int quantity) {
        this.quantity -= quantity;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getEngine_Capacity() {
        return this.engine_capacity;
    }

    public void setEngine_Capacity(double engine_capacity) {
        this.engine_capacity=engine_capacity;
    }

}
