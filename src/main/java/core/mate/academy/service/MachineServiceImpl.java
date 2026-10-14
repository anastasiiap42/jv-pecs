package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<? extends Machine> machines = new BulldozerProducer().get();
            return new ArrayList<>(machines);
        } else if (type == Excavator.class) {
            List<? extends Machine> machines = new ExcavatorProducer().get();
            return new ArrayList<>(machines);
        } else if (type == Truck.class) {
            List<? extends Machine> machines = new TruckProducer().get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    /**
     * Fill the machines list with passed value
     * Replace the Object with parametrized value.
     * This method should be able to work well with any type of machine passed as 'value'
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    public void fill(List<? super Machine> machines, Machine value) {
        for (int j = 0; j < machines.size(); j++) {
            machines.set(j, value);
        }
    }

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of trucks.
     *
     * @param machines - the list of machines
     */
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
