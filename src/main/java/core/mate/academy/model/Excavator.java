package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private static final int DEFAULT_LOAD_CAPACITY = 100;
    private int speed;

    public Excavator() {
        speed = DEFAULT_LOAD_CAPACITY;
    }

    public Excavator(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
