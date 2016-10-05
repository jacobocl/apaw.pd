package visitor.figure;

public abstract class Figure {

    private String description;

    public Figure(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void accept(FigureVisitor figureVisitor);

}
