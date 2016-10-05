package decorator.vehicle;

public class GPSDecorator extends VehicleDecorator {
    private static double price = 150;

    private static String description = "\tGPS";

    public GPSDecorator(VehicleComponent vehicleComponent) {
        super(price, description, vehicleComponent);
    }

}
