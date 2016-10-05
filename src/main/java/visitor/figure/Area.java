package visitor.figure;

public class Area extends FigureVisitor {

    private double totalArea;

    public Area() {
        super();
        totalArea = 0;
    }

    @Override
    public void visitCircle(Circle circle) {
        double circleArea = Math.PI * circle.getRadius() * circle.getRadius();
        addArea(circleArea);
    }

    @Override
    public void visitSquare(Square square) {
        double circleSquare = square.getSide() * square.getSide();
        addArea(circleSquare);
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        double triangleArea = triangle.getBase() * triangle.getHeight() * 0.5;
        addArea(triangleArea);
    }

    private void addArea(double area) {
        totalArea = totalArea + area;
    }
    
    public double getArea() {
        return totalArea;
    }

}
