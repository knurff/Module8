package shapes;

public abstract class ThreeDimensionalShape extends Shape{
    public ThreeDimensionalShape(String name) {
        super(name);
    }

    public abstract double countVolume();
}
