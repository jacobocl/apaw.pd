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

    public Caracter get(char caracter) {
        if (caracteres.containsKey(caracter)) {
            return caracteres.get(caracter);
        } else {
            Caracter caracterTexto = new Caracter(caracter);
            caracteres.put(caracter, caracterTexto);
            return caracterTexto;
        }
    }
}
