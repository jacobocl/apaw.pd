package factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {
    private NaturalNumberCreator numberCreatorEs, numberCreatorFr, numberCreatorEn;
    private NaturalNumberManager numberManager;
    
    @Before
    public void initialize() {
        this.numberCreatorEs = new NaturalNumberEsCreator();
        this.numberCreatorFr = new NaturalNumberFrCreator();
        this.numberCreatorEn = new NaturalNumberEnCreator();
        this.numberManager = new NaturalNumberManager();
    }

    @Test
    public void testNumberEs() {
        NaturalNumber number = getNumberZero(numberCreatorEs);
        
        assertEquals("cero", number.getTextValue());
        number.add(5);
        assertEquals("cinco", number.getTextValue());
        number.add(3);
        assertEquals("???", number.getTextValue());
    }
    
    @Test
    public void testNumberFr() {
        NaturalNumber number = getNumberZero(numberCreatorFr);
        
        assertEquals("zéro", number.getTextValue());
        number.add(5);
        assertEquals("cinq", number.getTextValue());
        number.add(3);
        assertEquals("???", number.getTextValue());
    }
    
    @Test
    public void testNumberEn() {
        NaturalNumber number = getNumberZero(numberCreatorEn);
        
        assertEquals("zero", number.getTextValue());
        number.add(5);
        assertEquals("five", number.getTextValue());
        number.add(3);
        assertEquals("???", number.getTextValue());
    }
    
    @Test
    public void testNaturalNumber() {
        NaturalNumber number = getNumberZero(numberCreatorEs);
        
        assertEquals(0, number.getValue());
        number.add(5);
        assertEquals(5, number.getValue());
        number.add(3);
        assertEquals(8, number.getValue());
    }

    private NaturalNumber getNumberZero(NaturalNumberCreator numberCreator) {
        numberManager.setNaturalNumberCreator(numberCreator);
        numberManager.createNaturalNumber(0);
        return numberManager.getNaturalNumber();
    }
}
