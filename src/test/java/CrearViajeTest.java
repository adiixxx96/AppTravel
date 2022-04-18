import com.sanvalero.Viaje;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrearViajeTest {
    private static Viaje viaje;

    @BeforeAll
    public static void setup() {
        viaje = new Viaje("Tailandia", "Sudeste Asiático", "20/04/2022", "30/04/2022", 15, 1099);
    }

    @Test
    public void plazasDisponiblesTest() {
        int plazasDisponibles = viaje.getPlazasDisponibles();
        assertEquals(15, plazasDisponibles);
    }
}
