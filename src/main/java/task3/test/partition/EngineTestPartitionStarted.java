package task3.test.partition;

import org.junit.Test;
import task3.Engine;

import static org.junit.Assert.*;
import static task3.Engine.instanceEngine;

public class EngineTestPartitionStarted {

    @Test
    public void start() {
        Engine engineStarted = instanceEngine();
        Engine engineNotStarted = instanceEngine();
        engineStarted.start();
        assertTrue(engineStarted.started);
        assertNotSame(engineStarted, engineNotStarted);

    }

    @Test
    public void stop() {
        Engine engine = instanceEngine();
        engine.start();
        engine.stop();
        assertFalse(engine.started);
    }
}
