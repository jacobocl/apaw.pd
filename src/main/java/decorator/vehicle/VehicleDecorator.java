package decorator.vehicle;

public abstract class VehicleDecorator extends VehicleComponent {
    
    VehicleComponent vehicleComponent;

    public VehicleDecorator(double price, String description, VehicleComponent vehicleComponent) {
        super(price, description);
        this.vehicleComponent = vehicleComponent;
    }
    
    @Override
    public String finalDescription() {
        return vehicleComponent.finalDescription() + this.getDescription();
    }

    @Override
    public double totalPrice() {
        return vehicleComponent.totalPrice() + this.getPrice();
    }
}
