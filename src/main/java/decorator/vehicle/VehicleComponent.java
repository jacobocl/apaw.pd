package decorator.vehicle;

public abstract class VehicleComponent {

    private double price;

    private String description;

    public VehicleComponent(double price, String description) {
        super();
        this.price = price;
        this.description = description;
    }
    
    protected String getDescription() {
        return description + "\n";
    }
    
    protected double getPrice() {
        return price;
    }
    
    public abstract String finalDescription();

    public abstract double totalPrice();
}
