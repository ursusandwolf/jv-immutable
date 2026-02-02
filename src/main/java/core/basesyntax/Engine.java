package core.basesyntax;

public class Engine implements Cloneable {
    private int horsePower;
    private final String manufacturer;

    public Engine(int i, String someMaker) {
        horsePower = i;
        manufacturer = someMaker;
    }

    public void setHorsePower(int i) {
        horsePower = i;
    }

    public Engine clone() {
        return new Engine(horsePower, manufacturer);
    }

    @Override
    public String toString() {
        return "Engine{"
            + "horsePower=" + horsePower
            + ", manufacturer='" + manufacturer + '\''
            + '}';
    }
}
