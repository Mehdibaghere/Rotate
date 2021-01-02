import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateTest {

    @Test
    void rotate() {
        String actual = Rotate.rotationalCipher("Zebra-493?", 3);

        assertEquals("Cheud-726?", actual);
    }
}