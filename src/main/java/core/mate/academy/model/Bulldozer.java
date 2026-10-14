package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static final int DEFAULT_LOAD_CAPACITY = 100;
    private int loadCapacity;
    
    public Bulldozer() {
        loadCapacity = DEFAULT_LOAD_CAPACITY;
    }

    public Bulldozer(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
