package core.basesyntax;

public class Engine {
    private int horsePower;
    private String manufacturer;

    public Engine(int i, String someMaker) {
    }

    //implement this class

    @Override
    public String toString() {
        return "Engine{"
            + "horsePower=" + horsePower
            + ", manufacturer='" + manufacturer + '\''
            + '}';
    }
}
