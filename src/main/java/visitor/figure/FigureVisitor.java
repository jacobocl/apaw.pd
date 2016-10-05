package visitor.figure;

public abstract class FigureVisitor {
    public abstract void visitCircle(Circle circle);

    public abstract void visitSquare(Square square);

    public abstract void visitTriangle(Triangle triangle);
}
