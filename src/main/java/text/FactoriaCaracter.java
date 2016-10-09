package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private Map<Character, Caracter> caracteres;

    private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();

    private FactoriaCaracter() {
        caracteres = new HashMap<Character, Caracter>();
    }

    public static FactoriaCaracter getFactoria() {
        return factoriaCaracter;
    }

    public Caracter get(char c) {
        if (caracteres.containsKey(c)) {
            return caracteres.get(c);
        } else {
            Caracter caracter = new Caracter(c);
            caracteres.put(c, caracter);
            return caracter;
        }
    }
}
