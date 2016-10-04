package factoryMethod.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumber number;

    private NaturalNumberCreator creator;

    public void createNaturalNumber(int value) {
        assert creator != null;
        number = creator.createNaturalNumber(value);
    }
    
    public void setNaturalNumberCreator(NaturalNumberCreator creator) {
        assert creator != null;
        this.creator = creator;
    }
    
    public NaturalNumber getNaturalNumber() {
        return this.number;
    }
}
