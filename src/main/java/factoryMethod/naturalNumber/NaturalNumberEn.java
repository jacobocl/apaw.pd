package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

    private static final String[] textValuesEn = {"zero", "one", "two", "three", "four", "five"};

    public NaturalNumberEn(int value) {
        super(value, textValuesEn);
    }
}
