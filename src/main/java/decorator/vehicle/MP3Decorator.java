package decorator.vehicle;

public class MP3Decorator extends VehicleDecorator {

    private static double price = 87.54;

    private static String description = "\tMP3";

    public MP3Decorator(VehicleComponent vehicleComponent) {
        super(price, description, vehicleComponent);
    }

}
