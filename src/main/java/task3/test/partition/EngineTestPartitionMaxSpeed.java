package task3.test.partition;

import org.junit.Test;
import task3.Engine;

import static org.junit.Assert.*;
import static task3.Engine.DEFAULT_MAX_SPEED;
import static task3.Engine.instanceEngine;

public class EngineTestPartitionMaxSpeed {
    @Test
    public void getMaxSpeed() {
        assertEquals(instanceEngine().getMaxSpeed(), DEFAULT_MAX_SPEED);
    }

    @Test
    public void setMaxSpeed() {
        Engine engine = instanceEngine();
        int maxSpeed = DEFAULT_MAX_SPEED + 100;
        engine.setMaxSpeed(maxSpeed);
        assertFalse(engine.getMaxSpeed() < DEFAULT_MAX_SPEED);
    }

    @Test
    public void testDefaultMaxSpeed() {
        Engine engineDefaultSpeeds = instanceEngine();
        assertEquals(DEFAULT_MAX_SPEED, engineDefaultSpeeds.getMaxSpeed());
    }

    @Test
    public void speedUp() {
        Engine engine = instanceEngine();
        engine.speedUp();
        assertEquals(DEFAULT_MAX_SPEED, engine.getMaxSpeed());
    }
}
