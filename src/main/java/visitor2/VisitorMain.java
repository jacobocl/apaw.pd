package visitor2;

import java.util.ArrayList;
import java.util.Collection;

public final class VisitorMain {
    private Collection<Element> coleccion = new ArrayList<Element>();

    public VisitorMain() {
        coleccion.add(new ElementA());
        coleccion.add(new ElementA());
        coleccion.add(new ElementB());
        coleccion.add(new ElementA());
    }

    public void visitador1() {
        Visitor1 v1 = new Visitor1();
        for (Element elemento : coleccion) {
            elemento.accept(v1);
        }
    }
}
