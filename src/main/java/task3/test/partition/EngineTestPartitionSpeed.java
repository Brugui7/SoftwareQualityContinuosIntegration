package task3.test.partition;

import org.junit.Test;
import task3.Engine;

import static org.junit.Assert.*;
import static task3.Engine.DEFAULT_SPEED;
import static task3.Engine.instanceEngine;

public class EngineTestPartitionSpeed {

    @Test
    public void getSpeed() {
        assertEquals(instanceEngine().getSpeed(), DEFAULT_SPEED);
    }

    @Test
    public void setSpeed() {
        Engine engine = instanceEngine();
        int speed = 50;
        engine.setSpeed(speed);
        assertEquals(engine.getSpeed(), speed);
    }

    @Test
    public void speedUp() {
        Engine engine = instanceEngine();
        engine.speedUp();
        assertTrue(engine.getSpeed() > DEFAULT_SPEED);
    }

    @Test
    public void testDefaultSpeed() {
        Engine engineDefaultSpeeds = instanceEngine();
        assertEquals(DEFAULT_SPEED, engineDefaultSpeeds.getSpeed());
    }
}
