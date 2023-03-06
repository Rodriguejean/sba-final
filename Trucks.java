public class Trucks extends Car {
    private int weight;

    public Trucks(String make, String model, int year, double price, int weight) {
        super(make, model, year, price);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return price * 0.9;
        } else {
            return price * 0.8;
        }
    }
}
