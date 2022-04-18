import com.sanvalero.Reserva;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrearReservaTest {
    private static Reserva reserva;

    @BeforeAll
    public static void setup() {
        reserva = new Reserva("Ada", 256, 1099, 300, "18/04/2022");
    }

    @Test
    public void precioTotalTest() {
        float precioTotal = reserva.getPrecioTotal();
        assertEquals(1099, precioTotal);
    }
}
