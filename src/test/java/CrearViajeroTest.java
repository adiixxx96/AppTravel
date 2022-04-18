import com.sanvalero.Viajero;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrearViajeroTest {
    private static Viajero viajero;

    @BeforeAll
    public static void setup() {
        viajero = new Viajero("Carlota", 25, "española", "Zaragoza");
    }

    @Test
    public void nombreTest() {
        String nombre = viajero.getNombre();
        assertEquals("Carlota", nombre);
    }
}
