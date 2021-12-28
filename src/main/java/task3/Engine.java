package task3;

public class Engine {
    public static final int DEFAULT_SPEED = 10;
    public static final int DEFAULT_MAX_SPEED = 100;
    public static final int DEFAULT_HORSE_POWER = 150;

    private int horsepower;
    private int maxSpeed;
    private int speed;
    public boolean started;


    public static Engine instanceEngine() {
        return new Engine(DEFAULT_HORSE_POWER, DEFAULT_MAX_SPEED, DEFAULT_SPEED);
    }

    public Engine(int horsepower, int maxSpeed, int speed) {
        setHorsepower(horsepower);
        setMaxSpeed(maxSpeed);
        setSpeed(speed);
        started = false;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower < 0) {
            return;
        }

        this.horsepower = horsepower;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            return;
        }

        if (speed > maxSpeed) {
            return;
        }

        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Establece la velocidad máxima si no es negativa
     *
     * @param maxSpeed int
     */
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            return;
        }

        this.maxSpeed = maxSpeed;
    }

    public void speedUp() {
        System.out.println("Acelerando...");
        if (getSpeed() + 10 > getMaxSpeed()) {
            return;
        }

        setSpeed(getSpeed() + 10);
    }

    public void start() {
        System.out.println("Arrancando motor...");
        if (this.started) {
            return;
        }

        this.started = true;
    }

    public void stop() {
        System.out.println("Parando motor...");
        if (!this.started) {
            return;
        }

        this.started = false;
    }


    public int getHorsepower() {
        return --horsepower; // Error
    }


}
