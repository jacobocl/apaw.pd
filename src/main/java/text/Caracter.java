package text;

public class Caracter extends Componente {
    
    char caracter;

    public Caracter(char caracter) {
        super(false);
        this.caracter = caracter;
    }

    @Override
    public void add(Componente componente) {
    }

    @Override
    public void remove(Componente componente) {
    }

    @Override
    public String dibujar(boolean upperCase) {
        String caracterString = String.valueOf(caracter);
        if (upperCase) {
            caracterString = caracterString.toUpperCase();
        }
        return caracterString;
    }

}
