import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CreatureTest {

    Creature cr1 = new Creature("cr1",true,100,200,100,false,100,0);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @org.junit.jupiter.api.Test
    void manger() {

    }
    @org.junit.jupiter.api.Test
    void emmetreSon() {
        Assert.assertEquals("cr1 emmet un son !", outputStreamCaptor.toString()
                .trim());
    }

    @org.junit.jupiter.api.Test
    void soigner() {
    }

    @org.junit.jupiter.api.Test
    void reveiller() {
    }

    @org.junit.jupiter.api.Test
    void dormir() {
    }

    @org.junit.jupiter.api.Test
    void vieillir() {
    }
}