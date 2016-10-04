package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

    private static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};

    public NaturalNumberEn(int value) {
        super(value);
    }

    @Override
    public String getTextValue() {
        if (super.getValue() < textValue.length) {
            return NaturalNumberEn.textValue[super.getValue()];
        } else {
            return "???";
        }
    }

}
