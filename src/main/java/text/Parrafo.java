package text;

public class Parrafo extends TextComposite {

    @Override
    public void add(Componente componente) {
        if (componente.isComposite()) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else {
            super.addToComponentes(componente);
        }
    }

    @Override
    public void remove(Componente componente) {
        if (!componente.isComposite()) {
            super.removeFromComponentes(componente);
        }
    }

    @Override
    public String dibujar(boolean upperCase) {
        return super.dibujar(upperCase) + "\n";
    }

}
