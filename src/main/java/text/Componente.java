package text;

public abstract class Componente {

    private boolean isComposite;

    public Componente(boolean isComposite) {
        this.isComposite = isComposite;
    }

    public abstract void add(Componente componente);

    public abstract void remove(Componente componente);

    public abstract String dibujar(boolean upperCase);

    public boolean isComposite() {
        return isComposite;
    }
}
