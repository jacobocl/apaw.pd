package visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double numberOfSides() {
        return 4;
    }

    @Override
    public void accept(FigureVisitor figureVisitor) {
        figureVisitor.visitSquare(this);
    }
}
