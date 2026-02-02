package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Make this class immutable. See requirements in task description.
 */
public final class Car {
    private final int year;
    private final String color;
    private final List<Wheel> wheels;
    private final Engine engine;

    public Car(int i, String red, List<Wheel> testWheels, Engine testEngine) {
        year = i;
        color = red;
        wheels = testWheels;
        engine = testEngine;
    }

    //implement this class
    public Car changeEngine(Engine engine) {
        return new Car(year, color, getWheels(), engine);
    }

    public Car changeColor(String newColor) {
        return new Car(year, newColor, getWheels(), getEngine());
    }

    public Car addWheel(Wheel newWheel) {
        List newWheels = getWheels();
        newWheels.add(newWheel);
        return new Car(year, color, newWheels, getEngine());
    }
    @Override
    public String toString() {
        return "Car{"
            + "year=" + year
            + ", color='" + color + '\''
            + ", wheels=" + wheels
            + ", engine=" + engine
            + '}';
    }

    public List<Wheel> getWheels() {
        return new ArrayList<>(wheels);
    }

    public Engine getEngine() {
        return engine.clone();
    }
}
