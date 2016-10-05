package visitor.figure;

public class NumberOfSides extends FigureVisitor {

    private double totalSides;

    public NumberOfSides() {
        super();
        totalSides = 0;
    }

    @Override
    public void visitCircle(Circle circle) {
        addSides(circle.numberOfSides());
    }

    @Override
    public void visitSquare(Square square) {
        addSides(square.numberOfSides());
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        addSides(triangle.numberOfSides());
    }

    private void addSides(double sides) {
        totalSides = totalSides + sides;
    }

    public double getTotalSides() {
        return totalSides;
    }
}
