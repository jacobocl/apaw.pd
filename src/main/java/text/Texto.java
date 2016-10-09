package text;

public class Texto extends TextComposite {

    @Override
    public void add(Componente componente) {
        if (componente.isComposite()) {
            super.addToComponentes(componente);
        } else {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
    }

    @Override
    public void remove(Componente componente) {
        if (componente.isComposite()) {
            super.removeFromComponentes(componente);
        }
    }
    
    @Override
    public String dibujar(boolean upperCase) {
        return super.dibujar(upperCase) + "---o---\n";
    }

}
