package decorator.vehicle;

public class EDSDecorator extends VehicleDecorator {

    private static double price = 434.99;

    private static String description = "\tEDS";

    public EDSDecorator(VehicleComponent vehicleComponent) {
        super(price, description, vehicleComponent);
    }
}
