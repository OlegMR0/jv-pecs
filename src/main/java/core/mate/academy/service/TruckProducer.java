package core.mate.academy.service;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(1500, "Semi");
        Truck truck2 = new Truck(350, "Mini");
        Truck truck3 = new Truck(900, "Tipper");
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
