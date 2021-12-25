package task3.test.partition;

import org.junit.Test;
import task3.Engine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static task3.Engine.instanceEngine;

public class EngineTestPartitionHorsepower {
    @Test
    public void setHorsepower() {
        Engine engine = instanceEngine();
        int horsepower = 300;
        engine.setHorsepower(horsepower);
        assertEquals(engine.getHorsepower(), horsepower);
    }

    @Test
    public void getHorsepower() {
        Engine engine = instanceEngine();
        assertNotSame(engine.getHorsepower(), 100);
    }
}
