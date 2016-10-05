package decorator.vehicle;

public class Vehicle extends VehicleComponent {

    public Vehicle(double price, String description) {
        super(price, description);
    }

    @Override
    public String finalDescription() {
        return this.getDescription();
    }

    @Override
    public double totalPrice() {
        return this.getPrice();
    }

}
