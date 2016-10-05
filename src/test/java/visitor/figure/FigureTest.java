package visitor.figure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FigureTest {

    private FiguresManager figureManager;
    private Figure circle = new Circle("Circulo de radio 4", 4);
    private Figure triangle = new Triangle("Triángulo de base 2 y altura 6", 2, 6);
    private Figure square = new Square("Cuadrado de lado 4", 4);
    
    @Before
    public void before() {
        figureManager = new FiguresManager();
        figureManager.add(triangle);
        figureManager.add(square);
    }

    @Test
    public void testTotalArea() {
        assertEquals(22 , figureManager.totalArea(), 10e-4);
        
        figureManager.add(circle);
        assertEquals(72.265, figureManager.totalArea(), 10e-4);
    }

    @Test
    public void testTotalNumberOfSides() {
        assertEquals(7 , figureManager.totalNumberOfSides(), 10e-1);
        
        figureManager.add(triangle);
        assertEquals(10 , figureManager.totalNumberOfSides(), 10e-1);
        
        figureManager.add(circle);
        assertEquals(Double.POSITIVE_INFINITY , figureManager.totalNumberOfSides(), 10e-1);
    }

}
