package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private static final int DEFAULT_SIZE = 1000;
    private int size;

    public Truck() {
        size = DEFAULT_SIZE;
    }

    public Truck(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
