package visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double numberOfSides() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public void accept(FigureVisitor figureVisitor) {
        figureVisitor.visitCircle(this);
    }

}
