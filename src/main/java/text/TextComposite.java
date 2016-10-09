package text;

import java.util.LinkedList;
import java.util.List;

public abstract class TextComposite extends Componente {

    private List<Componente> componentes;

    public TextComposite() {
        super(true);
        componentes = new LinkedList<Componente>();
    }

    protected void addToComponentes(Componente componente) {
        componentes.add(componente);
    }

    protected void removeFromComponentes(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public String dibujar(boolean upperCase) {
        String dibujoComponentes = "";
        for (Componente componente : componentes) {
            dibujoComponentes += componente.dibujar(upperCase);
        }
        return dibujoComponentes;
    }
}
