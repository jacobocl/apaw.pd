package decorator.vehicle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {
    
    private VehicleComponent vehicle;
    
    @Before
    public void before() {
        vehicle = new Vehicle(78369.88, "Audi R8");
    }

    @Test
    public void test() {
        VehicleComponent vehicleEDS = new EDSDecorator(vehicle);
        VehicleComponent vehicleMP3 = new MP3Decorator(vehicle);
        VehicleComponent vehicleEDSMP3 = new MP3Decorator(vehicleEDS);
        VehicleComponent vehicleGPSEDSMP3 = new GPSDecorator(vehicleEDSMP3);
        
        assertEquals("Audi R8\n", vehicle.finalDescription());
        assertEquals(78369.88, vehicle.totalPrice(), 10e-3);
        
        assertEquals("Audi R8\n\tEDS\n", vehicleEDS.finalDescription());
        assertEquals(78804.87, vehicleEDS.totalPrice(), 10e-3);
        
        assertEquals("Audi R8\n\tMP3\n", vehicleMP3.finalDescription());
        assertEquals(78457.42, vehicleMP3.totalPrice(), 10e-3);
        
        assertEquals("Audi R8\n\tEDS\n\tMP3\n", vehicleEDSMP3.finalDescription());
        assertEquals(78892.41, vehicleEDSMP3.totalPrice(), 10e-3);
        
        assertEquals("Audi R8\n\tEDS\n\tMP3\n\tGPS\n", vehicleGPSEDSMP3.finalDescription());
        assertEquals(79042.41, vehicleGPSEDSMP3.totalPrice(), 10e-3);
    }

}
