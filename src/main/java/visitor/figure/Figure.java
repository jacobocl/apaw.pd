package visitor.figure;

public abstract class Figure {

    String description;

    public Figure(String description) {
        this.description = description;
    }

    public abstract void accept(FigureVisitor figureVisitor);

}
