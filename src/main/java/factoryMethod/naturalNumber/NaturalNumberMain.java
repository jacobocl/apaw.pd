package factoryMethod.naturalNumber;

public class NaturalNumberMain {

    public static void main(String[] args) {
        NaturalNumberManager manager = new NaturalNumberManager();
        manager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        manager.createNaturalNumber(0);
        NaturalNumber number = manager.getNaturalNumber();
        System.out.println(number.getTextValue());
    }

}
