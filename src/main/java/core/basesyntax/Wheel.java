package core.basesyntax;

public class Wheel {
    private final int radius;

    public Wheel(int i) {
        radius = i;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Wheel{"
            + "radius=" + radius
            + '}';
    }
}
