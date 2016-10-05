package visitor.figure;

public class Triangle extends Figure {
    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double numberOfSides() {
        return 3;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void accept(FigureVisitor figureVisitor) {
        figureVisitor.visitTriangle(this);
    }

}
