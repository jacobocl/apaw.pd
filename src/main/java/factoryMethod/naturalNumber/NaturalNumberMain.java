package factoryMethod.naturalNumber;

public class NaturalNumberMain {

    private static final NaturalNumberCreator[] creators = {new NaturalNumberEsCreator(), new NaturalNumberFrCreator(), new NaturalNumberEnCreator()};

    public static void main(String[] args) {
        NaturalNumberManager manager = new NaturalNumberManager();
        for (int i = 0; i < creators.length; i++) {
            manager.setNaturalNumberCreator(creators[i]);
            for (int j = 0; j <= 6; j++) {
                manager.createNaturalNumber(j);
                NaturalNumber number = manager.getNaturalNumber();
                System.out.println(number.getTextValue());
            }
        }
    }

}
