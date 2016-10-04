package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {
    
    private static final String[] textValue = {"un", "deux", "trois", "quatre", "cinq"};

    public NaturalNumberFr(int value) {
        super(value);
    }

    @Override
    public String getTextValue()  {
        if (super.getValue() < textValue.length) {
            return NaturalNumberFr.textValue[super.getValue()];
        } else {
            return "???";
        }
    }

}
