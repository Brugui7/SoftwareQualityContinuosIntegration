import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import task3.Engine;

import static org.junit.Assert.*;
import static task3.Engine.*;

public class EngineJUnitTest {
    static Engine classEngine;

    public EngineJUnitTest() {}

    @BeforeClass
    public static void instanceClassEngine(){
        System.out.println("Instanciando motor común...");
        classEngine = instanceEngine();
    }

    @AfterClass
    public static void destroyClassEngine(){
        System.out.println("Destruyendo motor común...");
        classEngine = null;
    }

    @Test
    public void setHorsepower() {
        int horsepower = 300;
        classEngine.setHorsepower(horsepower);
        assertEquals(classEngine.getHorsepower(), horsepower);

    }

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
    public void getMaxSpeed() {
        assertEquals(instanceEngine().getMaxSpeed(), DEFAULT_MAX_SPEED);
    }

    @Test
    public void setMaxSpeed() {
        Engine engine = instanceEngine();
        int maxSpeed = DEFAULT_MAX_SPEED + 100;
        engine.setMaxSpeed(maxSpeed);
        assertTrue(engine.getMaxSpeed() > DEFAULT_MAX_SPEED);
    }

    @Test
    public void speedUp() {
        Engine engine = instanceEngine();
        engine.speedUp();
        assertTrue(engine.getSpeed() > DEFAULT_SPEED);
    }

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

    @Test
    public void getHorsepower() {
        Engine engine = instanceEngine();
        assertNotSame(engine.getHorsepower(), 100);
    }

    @Test
    public void testDefaults() {
        Engine engineDefaultSpeeds = instanceEngine();
        int[] defaultSpeeds = {DEFAULT_SPEED, DEFAULT_MAX_SPEED};
        int[] speeds = {engineDefaultSpeeds.getSpeed(), engineDefaultSpeeds.getMaxSpeed()};
        assertArrayEquals(defaultSpeeds, speeds);
    }

    @Test
    public void testInstance() {
        assertNotNull(instanceEngine());
    }

    @Ignore
    @Test
    public void testThatDoesntWork() {
        System.out.println("Test que no funciona...");
        assertEquals(true, false);
    }
}